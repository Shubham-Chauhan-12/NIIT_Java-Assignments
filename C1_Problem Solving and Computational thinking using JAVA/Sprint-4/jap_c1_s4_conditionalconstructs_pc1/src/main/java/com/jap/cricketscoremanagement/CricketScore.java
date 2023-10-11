package com.jap.cricketscoremanagement;



public class CricketScore {
  /**
   *  Function accepts scores of 3 teams as input parameters and identifies the
   *  team which is winner of the series.
   */

  public String winnerOfSeriesCalculation(int totalScore1, int totalScore2, int totalScore3)
  {
	 String winnerOfSeriesCalculation=null;
	 winnerOfSeriesCalculation=(totalScore1>totalScore2) ? (totalScore1>totalScore3) ? "Australia is winner" : "New Zealand is winner" :(totalScore2>totalScore3) ? "England is winner" : "New Zealand is winner";
	return winnerOfSeriesCalculation;
  }



  }

  

