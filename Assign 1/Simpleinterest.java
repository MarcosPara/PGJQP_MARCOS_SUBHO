import java.util.Scanner; 
public class SimpleInterest
{
 public static void main(String[] args) 
{
        
        int P,r,t,f;
        
        System.out.println("Enter The Principal Amount: ");
        Scanner sc = new Scanner(System.in);
        P = sc.nextInt();
        System.out.println("Enter The Interest Rate: ");
        Scanner sb = new Scanner(System.in);
        r = sb.nextInt();
        System.out.println("Enter The Timeperiod: ");
        Scanner sa = new Scanner(System.in);
        t = sa.nextInt();
        f=P+(P*r*t);
        System.out.println("The Final Amount  is: "+f);
      
    
    }
}
