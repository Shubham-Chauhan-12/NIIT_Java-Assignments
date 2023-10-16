package com.jap.customers;

import com.jap.customers.Customer;
import com.jap.customers.CustomerService;
import com.jap.customers.LoyaltyPointComparator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CustomerServiceTest {


    CustomerService customerService = null;
    List<Customer> customerList = null;
    LoyaltyPointComparator loyaltyPointComparator ;
    @Before
    public void setUp(){
        customerList = Arrays.asList(
                new Customer(1101,"Tara","Female",true,"Austin",123),
                new Customer(5242,"Sam","Male",false,"Denver",112),
                new Customer(8965,"Abbie","Female",false,"Chicago",345),
                new Customer(3354,"Michelle","Female",false,"Portland",234),
                new Customer(2212,"Mary","Female",true,"New Orleans",456),
                new Customer(4542,"John","Male",false,"Seattle",265),
                new Customer(1119,"Trevor","Male",false,"Boston",101));
        customerService = new CustomerService();
        loyaltyPointComparator = new LoyaltyPointComparator();
    }

    @After
    public void tearDown(){
        customerList = null;
        customerService = null;
        loyaltyPointComparator = null;
    }

    @Test
    public void givenCustomerListReturnSortedListOfNames(){
        String expected = "[456, 345, 265, 234, 123, 112, 101]";
        String list = customerService.getListOfCustomersSortedByLoyaltyPoints(customerList,loyaltyPointComparator).toString();
        assertEquals(expected,list);
    }
}
