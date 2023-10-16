package com.jap.customers;

import com.jap.customers.Customer;
import com.jap.customers.CustomerService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CustomerServiceTest {


    CustomerService customerService = null;
    List<Customer> customerList = null;
    @Before
    public void setUp(){
      customerList = Arrays.asList(
                new Customer(1101,"Tara","Female",true,"Austin"),
                new Customer(5242,"Sam","Male",false,"Denver"),
                new Customer(8965,"Abbie","Female",false,"Chicago"),
                new Customer(3354,"Michelle","Female",false,"Portland"),
                new Customer(2212,"Mary","Female",true,"New Orleans"),
                new Customer(4542,"John","Male",false,"Seattle"),
                new Customer(1119,"Trevor","Male",false,"Boston"));
        customerService = new CustomerService();
    }

    @After
    public void tearDown(){
        customerList = null;
        customerService = null;
    }

    @Test
    public void givenCustomerListReturnSortedListOfNames(){
        String expected = "[Abbie, John, Mary, Michelle, Sam, Tara, Trevor]";
        String list = customerService.getListOfCustomersSortedByName(customerList).toString();
        assertEquals(expected,list);
    }
}
