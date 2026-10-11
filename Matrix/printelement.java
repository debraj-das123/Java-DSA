package Matrix;

public class printelement {
    public static void main(String[] args) {
        int arr [][] ={
            {1,3,5},
            {7,3,12},
            {56,76,12}
        };

        for(int i =0; i<3; i++){
            for(int j =0; j<3; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
