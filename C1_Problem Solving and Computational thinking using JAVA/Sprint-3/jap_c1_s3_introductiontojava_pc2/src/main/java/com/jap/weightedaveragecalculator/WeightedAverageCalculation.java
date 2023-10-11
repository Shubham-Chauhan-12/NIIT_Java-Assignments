package com.jap.weightedaveragecalculator;

import java.util.Scanner;

public class WeightedAverageCalculation {

  // Function accepts academic scores as input parameters and outputs the overall
  // weighted average percentage of an individual.
  //Calculate the Overall Percentage
  public float averageCalculation (int assignmentScore, int projectScore, int quizScore , int midTermScore , int finalExamScore)

  {
	  System.out.println(assignmentScore*0.10f);
	  
	  System.out.println(projectScore*0.35f);
	   
	  System.out.println(quizScore *0.10f);
	   
	  System.out.println(midTermScore *0.15f);
	  
	  System.out.println(finalExamScore *0.30f);

	  float overallPercentage =((assignmentScore*0.10f+projectScore*0.35f+quizScore*0.10f+midTermScore*0.15f+finalExamScore*0.30f));
	    return overallPercentage;
  
  }

}