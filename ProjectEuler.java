

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