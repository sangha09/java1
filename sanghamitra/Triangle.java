import java.util.*;

class Triangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        if(a==b && b==c)
            System.out.println("Equilateral");

        else if ((a==b && b!=c ) || (a!=b && c==a) || (c==b && c!=a))
            System.out.println("Isosceles");

        else if(a!=b && b!=c && c!=a)
            System.out.println("Scalene");
    }
}