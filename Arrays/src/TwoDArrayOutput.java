public class TwoDArrayOutput {
    public static void main(String[] args) {
        int num[][]= new int [3][2];

        num[0][0]=1;
        num[0][1]=12;
        num[1][0]=3;
        num[1][1]=5;
        num[2][0]=11;
        num[2][1]=33;

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
