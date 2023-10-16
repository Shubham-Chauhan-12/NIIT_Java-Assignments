package com.jap.customers;

import com.jap.customers.Customer;
import com.jap.customers.CustomerService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class CustomerTest {
    Customer customer = null;


    @Before
    public void setUp(){
        customer =new Customer(4344,"Rhonda","Female",false,"Austin");

          }

    @After
    public void tearDown(){
        customer = null;

    }

    @Test
    public void givenCustomerObjectThenShouldSetProperties(){
        assertEquals(4344,customer.getCustomerId());
        assertEquals("Rhonda",customer.getCustomerName());
        assertEquals("Female",customer.getCustomerGender());
        assertFalse(customer.isSeniorCitizen());
        assertEquals("Austin",customer.getCity());
    }

    @Test
    public void givenCustomerObjectReturnDetails(){
        String expected = "Customer{customerId=4344, customerName='Rhonda', customerGender='Female', isSeniorCitizen=false, city='Austin'}";
        assertEquals(expected.toLowerCase(),customer.toString().toLowerCase());
    }
}
