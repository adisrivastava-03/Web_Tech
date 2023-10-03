import java.util.*;
class A1
{
    public static void main(String args[])
    {
        A1 obj=new A1();
        Scanner sc=new Scanner(System.in);
        int a,b,c1,sum,sum1;
        String c;
        System.out.println("My Name is A R S");
        System.out.println();
        System.out.println("PLease Enter any 2 No.:-");
        a=sc.nextInt();
        b=sc.nextInt();
        sum=a+b;
        System.out.println("Sum of "+a+" & "+b+" is " +sum);
        System.out.print("Now, Enter any another no.");
        sc.nextLine();
        c=sc.nextLine();
        c1=Integer.parseInt(c);
        sum1=sum+c1;
        System.out.println("Sum of "+sum+" & "+c1+" is " +sum1);
    }
}