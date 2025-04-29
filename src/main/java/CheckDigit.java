public class CheckDigit 
{   
  /** Returns the check digit for num, as described in part (a).  
   *          num >= 0  
   */  
   public static int getCheck(int num) 
   {  
     /* to be implemented in part (a) */
     int sum = 0;
     int changeNum = num;
     for (int i = 0; i < getNumberOfDigits(num); i++){
        sum+= (changeNum % 10) * (7-getNumberofDigits(num) +1 + i);
         changeNum = changeNum / 10;
     }
     return getDigit(sum, getNumberOfDigits(sum));
   }
 
  /** Returns true if numWithCheckDigit is valid, or false    
   *  otherwise, as described in part (b). 
   *  Precondition: The number of digits in numWithCheckDigit   
   *  is between two and seven, inclusive.
   *                numWithCheckDigit >= 0     
   */     
   public static boolean isValid(int numWithCheckDigit)    
   {      
     /* to be implemented in part (b) */    
     if (getCheck(numWithCheckDigit/10) == numWithCheckDigit%10){
      return true;
     }
     return false;
   }    
   
   /** Returns the number of digits in num. */    
   public static int getNumberOfDigits(int num)    
   {      
    if(num < 10)
      return 1;
    return 1 + getNumberOfDigits(num/10);    
   }    
   
   /** Returns the nthdigit of num.      
    *  Precondition: n >= 1 and n <= the number of digits in num     
    */    
    public static int getDigit(int num, int n)    
    {      
      int pos = getNumberOfDigits(num)-n+1;
      while(pos > 1){
        num/=10;
        pos--;
      }
      return num%10;
    }     

}
