import java.util.*;
import java.io.*;
class P1{
    
    public static void main(String args[]) throws IOException{

        String name;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Name:-");
        name=sc.nextLine();
        System.out.println("Hello..."+name+ "!!! How Are You");

        int age;
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(in);
        System.out.println("Enter Your Age");
        age=Integer.parseInt(br.readLine());
        System.out.println("Your Given Age- "+age);

        int a,b;
        a=Integer.parseInt(args[0]);
        b=Integer.parseInt(args[1]);
        System.out.println("Sum of "+a+" & "+b+" is "+(a+b));
        System.out.println("Subraction of "+a+" & "+b+" is "+(a-b));
        
    }
}

