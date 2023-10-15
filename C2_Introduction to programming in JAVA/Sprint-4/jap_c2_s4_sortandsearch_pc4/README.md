## Practice Statement - Binary Search

**Caroline is from Chicago. She is looking forward to her 10 days trip to Switzerland. She has decided to make Zurich her base city and visit 8 cities every day from Zurich by doing day trips. She has a list of 10 cities and towns in Switzerland that she wants to cover but has to remove 2 out of the list as on the 10th day she has a flight back to Chicago. She has decided to sort the list based on the distance in kms of each city from Zurich.​**

**Task: Use binary search to perform this task.**

- Find the city which is 52 kms from Zurich

***Note :***
- Use a sorted array for distances
- Use binary search algorithm to display the number of comparisons 

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

    String cityNames[] = {"Lucerne", "Engelberg", "Basel", "Jungfraujoch", "Murren", "InterLaken", "Grindelwald", "Bern", "Zermatt", "Geneva"};
    int distances[] = {52, 85, 87, 101, 103, 118, 136, 138, 214, 276};

**Expected Output:**

    Lucerne is at 52 kms from Zurich.
    Number of comparisons : 8
