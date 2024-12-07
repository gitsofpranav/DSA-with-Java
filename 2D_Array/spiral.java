public class spiral {
    public static void Sprial_matrix(int[][] matrix) {
        int startRow = 0;
        int startcol = 0;
        int endRow = matrix.length-1;
        int endcol = matrix[0].length-1;

        while(startRow <= endRow && startcol <= endcol) {
            //top
            for(int j=startcol; j<= endcol; j++) {
                System.out.print(matrix[startRow][j]+ " ");
            }

            // right
            for(int i=startRow +1; i<=endRow;i++) {
                System.out.print(matrix[i][endcol]+ " ");
            }

            //bottom
            for(int j=endcol-1; j>=startcol; j--) {
                if(startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j]+ " ");
            }
            //left
            for(int i=endRow-1; i>=startRow+1; i--) {
                if(startcol == endcol) {
                    break;
                }
                System.out.print(matrix[i][startcol]+ " ");
            }
            startRow++;
            startcol++;
            endRow--;
            endcol--;
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8,},
                          {9,10,11,12},
                           {13,14,15,16}};

    Sprial_matrix(matrix);
                        }
}
