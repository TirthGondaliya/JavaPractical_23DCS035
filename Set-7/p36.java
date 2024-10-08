class FirstThread extends Thread {
    public FirstThread() {
    super("FIRST");
    }
    
    public void run() {
    System.out.println("Thread FirstThread with priority " + getPriority() + " is running.");
    }
    }
    class SecondThread extends Thread {
    public SecondThread() {
    super("SECOND");
    }
    public void run() {
    System.out.println("Thread SecondThread with priority " + getPriority() + " is running.");
    }
    }
    class ThirdThread extends Thread {
    public ThirdThread() {
    super("THIRD");
    }
    
    public void run() {
    System.out.println("Thread ThirdThread with priority " + getPriority() + " is running.");
    }
    }
    
    public class p36 {
    public static void main(String[] args) {
    FirstThread first = new FirstThread();
    SecondThread second = new SecondThread();
    ThirdThread third = new ThirdThread();
    
    first.setPriority(3);
    second.setPriority(5);
    third.setPriority(7);
    
    first.start();
    second.start();
    third.start();
    
    }
    }
    