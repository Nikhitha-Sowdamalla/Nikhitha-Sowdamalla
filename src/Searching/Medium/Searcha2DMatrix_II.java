package Searching.Medium;

public class Searcha2DMatrix_II {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Check if the matrix is empty
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int numRows = matrix.length;
        int numCols = matrix[0].length;

        // Start from the top-right corner
        int i = 0;
        int j = numCols - 1;

        while (i >= 0 && i < numRows && j >= 0 && j < numCols) {
            if (target == matrix[i][j]) {
                return true; // Target found
            } else if (target < matrix[i][j]) {
                j--; // Move left
            } else {
                i++; // Move down
            }
        }

        return false; // Target not found
    }

}

//------------------------------------------------------------------------------------------------------------

//public class Searcha2DMatrix_II {
//  public boolean searchMatrix(int[][] matrix, int target) {
//  for(int i=0;i<matrix.length;i++)
//  {
//      for(int j=0;j<matrix[i].length;j++)
//      {
//          if(matrix[i][j]==target)
//          {
//              return true;
//          }
//      }
//  }

//  return false;
 
//}
//}