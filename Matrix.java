package Mathematics;
public class Matrix{
    int res1[][]=new int[2][2];
    int res2[][]=new int[2][2];
    public void add(int mat1[][],int mat2[][]){
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                res1[i][j]=mat1[i][j]+mat2[i][j];
            }
        }
        System.out.println("RESULTANT MATRIX {Addition}");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(res1[i][j]+" ");
            }
            System.out.print("\n");
        }
        
    }
    public void sub(int mat1[][],int mat2[][]){
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                res2[i][j]=mat1[i][j]-mat2[i][j];
            }
        }
        System.out.println("RESULTANT MATRIX {Subtraction}");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(res2[i][j]+" ");
            }
            System.out.print("\n");
        }
    }

}