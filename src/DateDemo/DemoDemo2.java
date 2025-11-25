package DateDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoDemo2 {

    public static void main(String[] args) throws ParseException {

        String dateStr = "11/28/2025";
        System.out.println("dateStr="+dateStr);
        SimpleDateFormat sd = new SimpleDateFormat("MM/dd/yyyy");
        Date date = sd.parse(dateStr);
        System.out.println("date="+date);

        String dateStr0= "23-June-2016" ;
        System.out.println("dateStr0="+dateStr0);
        SimpleDateFormat sd0 = new SimpleDateFormat("dd-MMMM-yyyy");
        Date date0 = sd0.parse(dateStr0);
        System.out.println("date="+date0);

        String dateStr1= "23 | June 16  8:34" ;
        System.out.println("dateStr1="+dateStr1);
        SimpleDateFormat sd1 = new SimpleDateFormat("dd | MMMM yy hh:mm");
        Date date1 = sd1.parse(dateStr1);
        System.out.println("date="+date1);

    }
}
