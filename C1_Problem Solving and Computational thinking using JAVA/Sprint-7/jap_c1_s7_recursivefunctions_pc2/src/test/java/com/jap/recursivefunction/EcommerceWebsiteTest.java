package com.jap.recursivefunction;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EcommerceWebsiteTest {

    EcommerceWebsite ecommerceWebsite;

    @BeforeEach
    void init() {
        ecommerceWebsite = new EcommerceWebsite();
    }

    @Test
    public void givenAmountAndPriceTagReturnNumberOfPurchasedItem() {
        assertEquals(11,EcommerceWebsite.countTotalItemsPurchasedIncludingFreeItem(100,10,10));
        assertEquals(22,EcommerceWebsite.countTotalItemsPurchasedIncludingFreeItem(200,10,10));
    }



}