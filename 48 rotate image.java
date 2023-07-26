class Solution {
    public void rotate(int[][] matrix) {
      
          for(int i = 0; i < matrix.length; i++){
            int a = 0;
            int b = matrix.length-1;
            while(a <= b){
               int temp = matrix[a][i];
                matrix[a][i] = matrix[b][i];
                 matrix[b][i] = temp;
                 a++;
                 b--;
            }
            
        }

          for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix.length;j++){
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
            }
        }
    }
}
