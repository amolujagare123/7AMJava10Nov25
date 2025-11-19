package ArraysDemo.TwoDimention;

public class IntArrayTwoD2 {

    public static void main(String[] args) {

        int[][] a = {
                {23,33,43},
                {22,32,42},
                {13,23,33},
                {26,36,46},
        };


        int row = a.length;
        int col = a[0].length;

        for(int i=0;i<row;i++)
        {
            for(int j =0 ; j < col ; j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }


    }
}
