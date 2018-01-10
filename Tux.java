
public class Tux extends Thread
{
    static String sName = "gg";
    public static void main(String[] aa) {
        Tux tux = new Tux();
        tux.piggy(sName);
        System.out.println("aaa---" + sName);
    }
    public void piggy(String a) {
        a = a + "wiggy";
        System.out.println("sss---" + a);
        start();
        /*try
        {
            Thread.sleep(5000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }*/
        System.out.println("xxx---" + sName);
        
    }
    public void run() {
        for (int i = 0; i < 4; i++)
        {
            sName = sName + " " + i;
        }
        System.out.println("run---" + sName);
    }
}