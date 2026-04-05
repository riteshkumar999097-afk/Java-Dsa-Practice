import java.util.Scanner;
public class SpiralPrint{

    public static int [][] inputMatrix(){
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int cols = sc.nextInt();
        int [][] mat = new int[rows][cols];
        System.out.println("Enter the elements of the matrix: ");
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        sc.close();
        return mat;
    }

    public static void printMatrix(int [][] mat){
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printSpiral(int[] []mat){
        int sRow =0, eRow = mat.length-1, sCol = 0, eCol = mat[0].length - 1;

        while(sRow <= eRow && sCol <= eCol){
// first row left to right
            for(int i = sCol; i<= eCol; i++){
                System.out.print(mat[sRow][i] +" ");
            }
            sRow++;
            //end col top to bottom
            for(int j = sRow; j<= eRow; j++){
                System.out.print(mat[j][eCol] +" " );
            }
            eCol--;

            //last row right to left
            for(int i = eCol; i>= sCol; i--){
                System.out.print(mat[eRow][i] +" ");
            }
            eRow--;
            //first col bottom to top

             for(int i = eRow; i>= sRow; i--){
                System.out.print(mat[i][sCol] +" " );
            }
            sCol++;






        }




    }
    public static void main(String[] args) {
        int [][] mat = inputMatrix();
        printMatrix(mat);
        System.out.println("Spiral Print:");
        printSpiral(mat);
    }
}