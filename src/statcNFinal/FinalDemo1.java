package statcNFinal;

public class FinalDemo1 {

     /*final*/ int speed = 200;

    void change()
    {
        speed = 300;
    }

    public static void main(String[] args) {

        FinalDemo1 ob = new FinalDemo1();
        ob.change();
        System.out.println(ob.speed);
    }
}
