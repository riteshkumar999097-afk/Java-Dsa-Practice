public class SumONBoundariesAndDiagonal {
    public static void sumOfBoundariesAndDiagonal(int [][] matrix){
        //check if matrix is null
        if(matrix == null || matrix.length == 0){
            System.out.println("please enter valid matrix");
            return;
        }
        int sum = 0;
        //traverse the matrix and add the boundary and diagonal elements
        for(int i = 0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(i==0 || i==matrix.length-1 || j==0 || j==matrix[0].length-1 || i==j){
                    sum += matrix[i][j];
                }
            }
        }
        int i=0, j= matrix.length;
        while(i< matrix.length && j< matrix[0].length){
            sum = sum + matrix[i][j-1];
            i++;
            j--;

        }
        
        System.out.println("Sum of boundaries and diagonal elements: " + sum);
    }
    public static void main(String[] args){
        int[][] mat= {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        sumOfBoundariesAndDiagonal(mat);
    }
}
