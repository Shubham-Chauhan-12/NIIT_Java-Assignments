package com.jap.customers;


import java.util.Comparator;

// Implement the Comparator interface
public class LoyaltyPointComparator implements Comparator<Customer> {


    @Override
    public int compare(Customer o1, Customer o2) {
        return o2.getLoyaltyPoints()-o1.getLoyaltyPoints();
    }
}
