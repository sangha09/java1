
//package greaterno;
import java.util.*;

public class character
{

       public static void main(String[] args)
       {
        char ch;
	System.out.println("enter character");
        Scanner sc=new Scanner (System.in);
        ch=sc.next().charAt(0);

        if(ch>65 && ch<=90) || (ch>=97 && ch<=122)
	{
	
	System.out.println("ALPHABATE");
	}
`	else if(ch<=48 && ch<=57)
	{
	System.out.println(" not ALPHABATE");
     	}
      else 
	{
	System.out.println(" special character");
	}

    }
    
}
