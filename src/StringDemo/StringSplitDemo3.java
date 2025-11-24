package StringDemo;

public class StringSplitDemo3 {

    public static void main(String[] args) {
        String str = "This is the moment that is reminding me how important it is to stay focused on what truly is meaningful.";
        String[] stArr = str.split("is");

        for (int i=0;i<stArr.length ; i++)
        {
            System.out.println(stArr[i]);
        }

    }
}
