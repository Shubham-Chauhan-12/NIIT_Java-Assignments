package com.jap.cricketscoremanagement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CricketScoreTest {

  CricketScore cricketScore;

  @BeforeEach
  void init() {
    cricketScore = new CricketScore();
  }

  // Test winnerOfSeriesCalculation method by passing scores of 3 teams.
  @Test
  public void givenScoresThenReturnWinner() {
    assertEquals("England is winner", cricketScore.winnerOfSeriesCalculation(21, 24, 20));
    assertEquals("Australia is winner", cricketScore.winnerOfSeriesCalculation(29, 15, 28));
    assertEquals("New Zealand is winner", cricketScore.winnerOfSeriesCalculation(20, 25, 30));
  }

  // Test winnerOfSeriesCalculation method by passing negative scores for few
  // teams.
  @Test
  public void givenNegativeScoresThenReturnWinner() {
    assertNotEquals("England is winner", cricketScore.winnerOfSeriesCalculation(21, -24, 20));
    assertEquals("Australia is winner", cricketScore.winnerOfSeriesCalculation(21, -24, 20));

    assertNotEquals("Australia is the winner", cricketScore.winnerOfSeriesCalculation(-29, 15, 28));
    assertEquals("New Zealand is winner", cricketScore.winnerOfSeriesCalculation(-29, 15, 28));

    assertNotEquals("New Zealand is the winner", cricketScore.winnerOfSeriesCalculation(20, 25, -30));
    assertEquals("England is winner", cricketScore.winnerOfSeriesCalculation(20, 25, -30));
  }

  // Test winnerOfSeriesCalculation method by passing scores as 0 for few teams.
  @Test
  public void givenScoresAsZeroThenReturnWinner() {
    assertEquals("England is winner", cricketScore.winnerOfSeriesCalculation(0, 24, 20));
    assertEquals("Australia is winner", cricketScore.winnerOfSeriesCalculation(29, 0, 28));
    assertEquals("England is winner", cricketScore.winnerOfSeriesCalculation(20, 25, 0));
  }
}
