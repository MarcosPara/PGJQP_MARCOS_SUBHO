package Assign2;
import java.util.Scanner;
public class vowel
{
    public static void main(String args[])
    {
        char ch;
        System.out.print("Enter a Character : ");
        Scanner sc = new Scanner(System.in);
        ch = sc.next().charAt(0);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        {
            System.out.println("Entered character "+ch+" is  Vowel"); 
        }
      else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
        {
            System.out.println("Entered character "+ch+" is Consonant");
        }
else
	System.out.println("Not an alphabet");	
    }
}
 
