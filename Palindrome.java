#create varaibles temp, sum and reminder and set sum and reminder to zero and asssign the number which we need to check to temp
#loop until num is greater than zero
#calculate the reminder as rem=number%10
  #calculate sum=(sum*10) and add reminder
  #calculate number=number/10;
#do following steps until number becomes zero
#compare the temp and sum if yes return true else false
  
  class Solution {
    public boolean isPalindrome(int x) {
        int rem=0;
        int sum=0;
        int temp=x;
        
        while(x>0){
            rem=x%10;
            sum=(sum*10)+rem;
            x=x/10;
            
        }
        if(temp==sum){
            return true;
        }
       
    return false;
        
    }
  
}
