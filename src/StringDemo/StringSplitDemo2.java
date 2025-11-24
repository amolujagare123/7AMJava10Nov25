package StringDemo;

public class StringSplitDemo2 {

    public static void main(String[] args) {
        String str = "This will work if we try";
        String[] stArr = str.split("i");

        for (int i=0;i<stArr.length ; i++)
        {
            System.out.println(stArr[i]);
        }

    }
}
