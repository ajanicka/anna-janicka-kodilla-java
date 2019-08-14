package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    ItemDao itemDao;
    @Autowired
    ProductDao productDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Invoice invoice = new Invoice("13");
        List<Item> items = new ArrayList<>();

        Item item1 = new Item(BigDecimal.valueOf(500), 2, BigDecimal.valueOf(3));
        Item item2 = new Item(BigDecimal.valueOf(1000), 1, BigDecimal.valueOf(2));
        Item item3 = new Item(BigDecimal.valueOf(1500), 3, BigDecimal.valueOf(1));

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        Product product = new Product("First product");

        item1.setProduct(product);
        item2.setProduct(product);
        item3.setProduct(product);

        items.add(item1);
        items.add(item2);
        items.add(item3);

        product.setItems(items);
        invoice.setItems(items);

        //When
        invoiceDao.save(invoice);

        //Then
        long invoiceNumber = invoiceDao.count();
        long productNumber = productDao.count();
        long itemNumber = itemDao.count();

        Assert.assertEquals(1, invoiceNumber);
        Assert.assertEquals(1, productNumber);
        Assert.assertEquals(3, itemNumber);

        //CleanUp
        int id = invoice.getId();
        invoiceDao.deleteById(id);
    }
}