class Rotatematrix {
    public static void main(String[] args) {
        int mat[][] = { {1,2,3} , {4,5,6} , {7,8,9}};
        
        //for transpose

        for( int i = 0 ; i < mat.length ; i++){
            for(int j = i ; j < mat[i].length ; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        //row column interchange

        int low = 0;
        int high = mat[0].length - 1;

        while(low < high){

            for(int i = 0 ; i < mat.length ; i++){
                int temp = mat[i][low];
                mat[i][low] = mat[i][high];
                mat[i][high] = temp;
            }
            low++;
            high--;
        }

        for( int i = 0 ; i < mat.length ; i++){
            for(int j = 0 ; j < mat[i].length ; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
