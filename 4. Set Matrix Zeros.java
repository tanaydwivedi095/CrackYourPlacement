class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> rows = new HashSet<>();
        Set<Integer> cols = new HashSet<>();
        // FOR FINDING THE ROWS AND COLUMNS THAT HAVE A ZERO
        for(int row=0; row<matrix.length; row++){
            for(int col=0; col<matrix[0].length; col++){
                if(matrix[row][col]==0){
                    rows.add(row);
                    cols.add(col);
                }
            }
        }
        // FOR SETTING ALL THE ROWS AS 0
        for(int row: rows){
            for(int col=0; col<matrix[0].length; col++){
                matrix[row][col] = 0;
            }
        }
        // FOR SETTING ALL THE COLUMNS AS 0
        for(int col: cols){
            for(int row=0; row<matrix.length; row++){
                matrix[row][col] = 0;
            }
        }
    }
}
