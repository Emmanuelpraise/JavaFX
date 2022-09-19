package Practice;

public class Threads {
    public static void main(String[] args) throws InterruptedException {

        for(int i = 60;i>0;i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("You are Done!");
    }
}
