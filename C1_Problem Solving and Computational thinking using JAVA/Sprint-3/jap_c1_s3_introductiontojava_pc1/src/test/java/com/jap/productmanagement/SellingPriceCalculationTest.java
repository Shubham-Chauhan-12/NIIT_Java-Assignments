package com.jap.productmanagement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SellingPriceCalculationTest {

  SellingPriceCalculation sellingPriceCalculation;

  @BeforeEach
  void init() {
    sellingPriceCalculation = new SellingPriceCalculation();
  }

  @Test
  public void givenNameAndPriceThenReturnRevisedSellingPrice() {
    assertEquals(11.539499282836914, sellingPriceCalculation.revisedSellingPriceCalculator("Rounded Kaisa Bowl", 10.99f));
    assertNotEquals(11, sellingPriceCalculation.revisedSellingPriceCalculator("Rounded Kaisa Bowl", 10.99f));
  }


  @Test
  public void givenNameAndPriceAsZeroThenReturnRevisedSellingPrice() {
    assertEquals(0, sellingPriceCalculation.revisedSellingPriceCalculator("Swirling Basket", 0));
  }


  @Test
  public void givenNameAndPriceAsNegativeValueThenReturnRevisedSellingPrice() {
    assertEquals(-94.5, sellingPriceCalculation.revisedSellingPriceCalculator("Fresh Air Necklace", -90));
  }
}
