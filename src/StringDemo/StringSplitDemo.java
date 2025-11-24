package StringDemo;

public class StringSplitDemo {

    public static void main(String[] args) {
        String str = "This will work if we try";
        String[] stArr = str.split(" ");

        for (int i=0;i<stArr.length ; i++)
        {
            System.out.println(stArr[i]);
        }

    }
}
