package com.jap.pizzaorderingsystem;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//org.junit.jupiter.api.Assertions

public class PizzaOrderingTest {
    PizzaOrdering pizzaOrdering;

    @BeforeEach
    void setUp() {
        pizzaOrdering = new PizzaOrdering();
    }

    @AfterEach
    void tearDown() {
        pizzaOrdering = null;
    }

    /* NOTE: Write a minimum of 4 assert statements for each test case */

    @Test
    public void givenPizzaChoiceAndSizeCalculateBill() {
		assertEquals(0, pizzaOrdering.calculateBillBasedOnPizzaChoiceAndSize(0,1,"R"));
		assertEquals(400, pizzaOrdering.calculateBillBasedOnPizzaChoiceAndSize(0,2,"L"));
		assertEquals(375, pizzaOrdering.calculateBillBasedOnPizzaChoiceAndSize(0,5,"M"));
		assertEquals(250, pizzaOrdering.calculateBillBasedOnPizzaChoiceAndSize(0,3,"R"));
    }

    @Test
    public void givenCrustChoiceEstimatePrice() {
		assertEquals(60, pizzaOrdering.estimatePriceOfCrust(1));
		assertEquals(70, pizzaOrdering.estimatePriceOfCrust(2));
		assertEquals(80, pizzaOrdering.estimatePriceOfCrust(3));
		assertEquals(0, pizzaOrdering.estimatePriceOfCrust(0));
    }

    @Test
    public void givenToppingsChoiceEstimatePrice() {
		assertEquals(80, pizzaOrdering.estimatePriceOfToppings(1));
		assertEquals(120, pizzaOrdering.estimatePriceOfToppings(2));
		assertEquals(0, pizzaOrdering.estimatePriceOfToppings(3));
		assertEquals(0, pizzaOrdering.estimatePriceOfToppings(0));
    }

    @Test
    public void givenCrustAndToppingsCostCalculateTotalBill() {
		assertEquals(0, pizzaOrdering.calculateBillWithCrustAndToppings(0,0,0));
		assertEquals(590, pizzaOrdering.calculateBillWithCrustAndToppings(400,70,120));
		assertEquals(455, pizzaOrdering.calculateBillWithCrustAndToppings(375,0,80));
		assertEquals(370, pizzaOrdering.calculateBillWithCrustAndToppings(250,120,0));
    }

    @Test
    public void givenBreadChoiceCalculateTotalBill() {
		assertEquals(0, pizzaOrdering.calculateBillBasedOnChoiceOfBread(0,0));
		assertEquals(80, pizzaOrdering.calculateBillBasedOnChoiceOfBread(1,0));
		assertEquals(120, pizzaOrdering.calculateBillBasedOnChoiceOfBread(2,0));
		assertEquals(490, pizzaOrdering.calculateBillBasedOnChoiceOfBread(2,370));
    }

    @Test
    public void givenDrinksChoiceCalculateTotalBill() {
		assertEquals(0, pizzaOrdering.calculateBillBasedOnDrinksChoice(0,0));
		assertEquals(80, pizzaOrdering.calculateBillBasedOnDrinksChoice(1,0));
		assertEquals(520, pizzaOrdering.calculateBillBasedOnDrinksChoice(2,400));
		assertEquals(455, pizzaOrdering.calculateBillBasedOnDrinksChoice(1,375));
		
    }

    @Test
    public void givenTotalBillEstimateDiscountAmount() {
		assertEquals(0, pizzaOrdering.estimateDiscountAmount(350));
		assertEquals(25, pizzaOrdering.estimateDiscountAmount(500));
		assertEquals(40, pizzaOrdering.estimateDiscountAmount(800));
		assertEquals(120, pizzaOrdering.estimateDiscountAmount(1200));
		assertEquals(0, pizzaOrdering.estimateDiscountAmount(2000));
    }

    @Test
    public void givenDeliveryAndTipChargeCalculateFinalBill() {
		assertEquals(0, pizzaOrdering.calculateFinalBillBasedOnDeliveryChargeAndTipCharge(0,0,0));
		assertEquals(600, pizzaOrdering.calculateFinalBillBasedOnDeliveryChargeAndTipCharge(520,50,30));
		assertEquals(570, pizzaOrdering.calculateFinalBillBasedOnDeliveryChargeAndTipCharge(490,50,30));
		assertEquals(200, pizzaOrdering.calculateFinalBillBasedOnDeliveryChargeAndTipCharge(120,50,30));
    }

}