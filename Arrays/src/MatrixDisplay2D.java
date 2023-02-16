public class MatrixDisplay2D {
    public static void main(String[] args) {
        int num[][]={
                {2,4},
                {8,1},
                {2,0}
        };
        for(int i=0;i<=2;i++)
        {
            for(int j=0;j<=1;j++)
            {
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
    }
}
