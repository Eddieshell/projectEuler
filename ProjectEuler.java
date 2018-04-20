

//Problem #1
// Could have used "||" in line 8 and combined the 3 and 5
// operations saving space, but this works just fine.
public static int multiplesOf3And5(int num){
        int returnItem = 0;
        for(int i = 0; i < num; i++){
            if(i%3==0){
               returnItem +=i; 
            }
            else if(i%5==0){
                returnItem +=i;
            }
        }

//Problem #2
//By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
public static int sumOfEvenFibonaccis(int num) {
        int returnItem = 2;
        int previous = 1;
        int currentSequence = 2;

        do {
            int x = previous + currentSequence;
            
                if (x % 2 == 0) {
                    returnItem += x;
                }
            
            previous = currentSequence;
            currentSequence = x;
        } while (currentSequence < num);

        return returnItem;
    }
