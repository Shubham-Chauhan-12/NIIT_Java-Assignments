## Practice Statement - Linear Search

**Caroline is from Chicago. She is looking forward to her 10 days trip to Switzerland. She has decided to make Zurich her base city and visit 8 cities every day from Zurich by doing day trips. She has a list of 10 cities and towns in Switzerland that she wants to cover but has to remove 2 out of the list as on the 10th day she has a flight back to Chicago. She has decided to sort the list based on the distance in kms of each city from Zurich.​**

**Task: Use linear search to perform this task.**
- Find the city which is 52 kms from Zurich
- Find the city which is greater than or equal to 270 kms from Zurich.

***Note : Use a linear search algorithm to display the number of comparisons.***

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

    City at 52 kms from Zurich : Lucerne
    Number of comparisons:: 10
    Cities more than 270 kms from Zurich : {Geneva}



