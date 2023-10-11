package com.jap.aquariumphlevelanalyser;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PhLevelAnalyserTest {

  PhLevelAnalyser phLevelAnalyser;

  @BeforeEach
  void init() {
    phLevelAnalyser = new PhLevelAnalyser();
  }

  // Test health status of aquarium to be Acidic by passing pH level less than 7
  @Test
  public void givenpHValueReturnStatusAsAcidic() {
    assertEquals("pH value is low, partial water change required", phLevelAnalyser.findHealthStatusOfAquarium(5));
  }

  // Test health status of aquarium to be Alkaline by passing pH level greater
  // than 7 and pH level as 14
  @Test
  public void givenpHValueReturnStatusAsAlkaline() {
    assertEquals("pH value is high, partial water change required", phLevelAnalyser.findHealthStatusOfAquarium(10));
    assertEquals("pH value is high, partial water change required", phLevelAnalyser.findHealthStatusOfAquarium(14));
  }

  // Test health status of aquarium to be Neutral by passing pH level as 7
  @Test
  public void givenpHValuesReturnStatusAsNeutral() {
    assertEquals("pH value is fine", phLevelAnalyser.findHealthStatusOfAquarium(7));
  }

  // Test health status of aquarium to be Acidic by passing pH level as 0
  @Test
  public void givenpHValueAsZeroReturnAquariumStatus() {
    assertEquals("pH value is low, partial water change required", phLevelAnalyser.findHealthStatusOfAquarium(0));

  }

}
