package Assign4;
import java.util.*;   
class strpalin
{  
   public static void main(String args[])  
   {  
      String str, reverse = ""; // Objects of String class  
      Scanner sc = new Scanner(System.in);   
      System.out.println("Enter a string/number to check if it is a palindrome");  
      str = sc.nextLine();   
      int length = str.length();   
      for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + str.charAt(i);  
      if (str.equals(reverse))  
         System.out.println("Entered string/number is a palindrome.");  
      else  
         System.out.println("Entered string/number isn't a palindrome.");   
   }  
}


