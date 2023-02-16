public class JaggedArrayOutput {
    public static void main(String[] args) {
//        int nums[][]=new int [3][];
//        num[0]=new int[4];
//        num[1]=new int[2];
//        num[2]=new int[3];
//
        int nums[][]={
                {3,9,7,5},
                {1,5},
                {8,4,5}
        };
        for(int i=0;i<=2;i++)
        {
            for(int j=0;j<nums[i].length;j++)
            {
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }
}
