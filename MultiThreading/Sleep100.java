public class Sleep100 {
    public static void main(String[] args){
        Thread t= Thread.currentThread();
        System.out.println("Current thread is: "+ t);
        t.setName("Demo Thread");
        System.out.println("After changing the name: "+ t);
        try{
            for(int n =100; n>0;n--){
                System.out.println(n);
                Thread.sleep(6000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Thread Interrupted");
        }
    }
}
