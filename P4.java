import Mathematics.Matrix;
import java.util.*;
class P4 {
    public static void main(String args[]){
        int mat1[][]=new int[2][2];
        int mat2[][]=new int[2][2];

        Matrix obj=new Matrix();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st Matrix A:-");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print("Enter A["+i+"]["+j+"]: ");
                mat1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the 2nd Matrix:-");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print("Enter B["+i+"]["+j+"]: ");
                mat2[i][j]=sc.nextInt();
            }
        }
        obj.add(mat1,mat2);
        obj.sub(mat1,mat2);
    }
}
