package com.jap.customers;


import java.util.*;

public class CustomerService {
    // This method returns the customer's loyalty points in sorted order
    public List<Integer> getListOfCustomersSortedByLoyaltyPoints(List<Customer> customerList, LoyaltyPointComparator loyaltyPointComparator){

        List<Integer> newlist = new ArrayList<>();
        Collections.sort(customerList,loyaltyPointComparator);
        for (Customer elements: customerList) {
            newlist.add(elements.getLoyaltyPoints());
        }

        return newlist;
    }

}
