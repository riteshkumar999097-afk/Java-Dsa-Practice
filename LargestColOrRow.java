public class LargestColOrRow {
    public static void largestColOrRow(int [][] matrix){
        //check if matrix is null
        if(matrix == null || matrix.length == 0){
            System.out.println("please enter valid matrix");
            return;
        }
        int maxRowSum = Integer.MIN_VALUE;
        int maxColSum = Integer.MIN_VALUE;
        int rowIndex = -1;
        int colIndex = -1;

        //calculate the sum of each row and find the maximum row sum
        for(int i=0; i<matrix.length; i++){
            int rowSum = 0;
            for(int j=0; j<matrix[0].length; j++){
                rowSum += matrix[i][j];
            }
            if(rowSum > maxRowSum){
                maxRowSum = rowSum;
                rowIndex = i;
            }
        }

        //calculate the sum of each column and find the maximum column sum
        for(int j=0; j<matrix[0].length; j++){
            int colSum = 0;
            for(int i=0; i<matrix.length; i++){
                colSum += matrix[i][j];
            }
            if(colSum > maxColSum){
                maxColSum = colSum;
                colIndex = j;
            }
        }

        //compare the maximum row sum and maximum column sum and print the result
        if(maxRowSum > maxColSum){
            System.out.println("Largest sum is in Row " + rowIndex + " with sum " + maxRowSum);
        } else {
            System.out.println("Largest sum is in Column " + colIndex + " with sum " + maxColSum);
        }
    }

    public static void main(String[] args){
        int[][] mat= {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        largestColOrRow(mat);
    }
    
}
