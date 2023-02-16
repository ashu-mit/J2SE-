public class MatrixDisplayForEach {
    public static void main(String[] args) {
        int a[][]={
                {1,2,5},
                {5,4,2},
                {7,9,3}
        };
        for (int num[]:a) {
            for (int b:num) {
                System.out.print(b+" ");
            }
            System.out.println();

        }
    }
}
