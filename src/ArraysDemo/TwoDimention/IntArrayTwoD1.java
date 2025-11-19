package ArraysDemo.TwoDimention;

public class IntArrayTwoD1 {

    public static void main(String[] args) {

        int[][] a = new int[4][3];

        a[0][0] = 23;
        a[0][1] = 33;
        a[0][2] = 43;

        a[1][0] = 22;
        a[1][1] = 32;
        a[1][2] = 42;

        a[2][0] = 12;
        a[2][1] = 22;
        a[2][2] = 32;

        a[3][0] = 16;
        a[3][1] = 26;
        a[3][2] = 36;

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
