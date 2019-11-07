package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyAndEmployeeFacadeTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    CompanyAndEmployeeFacade companyAndEmployeeFacade;

    private int softwareMachineId, dataMaestersId, greyMatterId, greyoMasterId;
    private Company softwareMachine = new Company("Software Machine");

    @Before
    public void prepareTestsData() {
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
        Employee lindaJ = new Employee("Linda", "J");

        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");
        Company greyoMaster = new Company("Greyo Master");

        softwareMachine.getEmployees().add(johnSmith);
        softwareMachine.getEmployees().add(lindaJ);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);
        greyoMaster.getEmployees().add(lindaJ);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);
        lindaJ.getCompanies().add(greyoMaster);
        lindaJ.getCompanies().add(softwareMachine);

        companyDao.save(greyoMaster);
        greyoMasterId = greyoMaster.getId();

        companyDao.save(softwareMachine);
        softwareMachineId = softwareMachine.getId();

        companyDao.save(dataMaesters);
        dataMaestersId = dataMaesters.getId();

        companyDao.save(greyMatter);
        greyMatterId = greyMatter.getId();
    }

    @Test
    public void testGetCompany() {
        //When
        List<Company> company = companyAndEmployeeFacade.retrieveCompanyByPartname("rey");

        //Then
        Assert.assertEquals(2, company.size());
        Assert.assertEquals("Grey Matter", company.get(0).getName());
        Assert.assertEquals("Greyo Master", company.get(1).getName());
    }

    @Test
    public void testGetEmployee() {
        //When
        List<Employee> employee = companyAndEmployeeFacade.retrieveEmployeeByPartname("alsk");

        //Then
        Assert.assertEquals(1, employee.size());
        Assert.assertEquals("Kovalsky", employee.get(0).getLastname());
    }

    @After
    public void cleanTestsData() {
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMaestersId);
            companyDao.deleteById(greyMatterId);
            companyDao.deleteById(greyoMasterId);
        } catch (Exception e) {
            //do nothing
        }
    }
}
