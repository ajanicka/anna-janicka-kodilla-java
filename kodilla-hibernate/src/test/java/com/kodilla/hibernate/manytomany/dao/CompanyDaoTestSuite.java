package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
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
public class CompanyDaoTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

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
    public void testSaveManyToMany() {
        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);
    }

    @Test
    public void testNamedQueries() {
        //When
        List<Employee> lastNameEqualsParam = employeeDao.getEmployeesWithSpecifiedLastname("Kovalsky");
        List<Company> nameWithThreeFirstLetters = companyDao.getCompaniesWithThreeFirstLetters("Gre");

        //Then
        Assert.assertEquals(1, lastNameEqualsParam.size());
        Assert.assertEquals("Kovalsky", lastNameEqualsParam.get(0).getLastname());

        Assert.assertEquals(2, nameWithThreeFirstLetters.size());
        Assert.assertEquals("Grey Matter", nameWithThreeFirstLetters.get(0).getName());
        Assert.assertEquals("Greyo Master", nameWithThreeFirstLetters.get(1).getName());
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