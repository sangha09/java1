
import java.util.*;

public class GreaterNo1
{

       public static void main(String[] args)
       {
        int num1,num2;
        Scanner sc=new Scanner (System.in);
	System.out.println("enter two no");
        num1=sc.nextInt();
        num2=sc.nextInt();
	num3=sc.nextInt();
                if(num1=num2 && num1==num3)
                {
                    System.out.println("equi tringle");
                }
                
	else if(num1==num2 || num1=num3)
	{
	System.out.println(" Isococeles tringle");	
	}
                else
                {
                     System.out.println(num2+" is greater");
                }
    }
    
}
