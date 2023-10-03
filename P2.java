import java.util.*;

class P2{

    public static void main(String args[]){
    int n,r,c;
    Scanner sc=new Scanner(System.in);
    System.out.println("\n");
    System.out.println("\t1-D ARRAY");
    System.out.print("Enter the Size of 1-D Array:- ");
    n=sc.nextInt();
    int A1[]=new int[n];
    for(int i=0;i<n;i++){
        System.out.print("Enter "+(i+1)+" value:-");
        A1[i]=sc.nextInt();
    }
    System.out.println("Inputted Array: ");
    System.out.print("\t");
    for(int i=0;i<n;i++){
        System.out.print(A1[i]+" ");
    }
    System.out.println("\n");
    System.out.println("\t2-D ARRAY");
    System.out.print("Enter the Row & Column of 2-D Array:- ");
    r=sc.nextInt();
    c=sc.nextInt();
    int A2[][]=new int[r][c];
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            System.out.print("Enter "+(i+1)+" Row "+(j+1)+" Column value:-");
            A2[i][j]=sc.nextInt();
        } 
    }
    System.out.println("Inputted 2-D Array: ");
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            System.out.print(A2[i][j]+" ");
        }
        System.out.println();
    }
    }
    

    

}