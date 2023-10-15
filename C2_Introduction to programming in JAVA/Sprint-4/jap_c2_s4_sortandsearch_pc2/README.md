## Practice Statement - Quick Sort

**Caroline is from Chicago. She is looking forward to her 10 days trip to Switzerland. She has decided to make Zurich her base city and visit 8 cities every day from Zurich by doing day trips. She has a list of 10 cities and towns in Switzerland that she wants to cover but has to remove 2 out of the list as on the 10th day she has a flight back to Chicago. She has decided to sort the list based on the distance in kms of each city from Zurich.​ Use Quick Sort to sort the distances.**

***Note : Find the number of comparisons done on the array and the number of swaps that happen within the array while using QuickSort.***

Given below is the list of places along with their distance.

- Bern: 138 kms
- Lucerne: 52 kms
- Interlaken: 118 Kms
- Grindelwald: 136 kms
- Engelberg: 85 kms
- Geneva: 276 kms
- Murren: 103 kms
- Basel: 87 kms
- Zermatt: 214 kms
- Jungfraujoch: 101 kms



**Sample Input:**

    String[] citiesFromZurich ={"Bern","Lucerne","InterLaken","Grindelwald","Engelberg","Geneva","Murren","Basel","Zermatt","Jungfraujoch"};
    int[] distanceFromZurich = {138,52,118,136,85,276,103,87,214,101};

**Expected Output:**

    Lucerne 	 52
    Engelberg 	 85
    Basel 		 87
    Jungfraujoch 101
    Murren 		 103
    InterLaken 	 118
    Grindelwald  136
    Bern 		 138
    Zermatt 	 214
    Geneva 		 276
