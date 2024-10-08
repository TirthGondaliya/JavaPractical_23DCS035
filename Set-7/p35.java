
class Prac_35 {
public static void main(String[] args) {
IncrementThread incrementThread = new IncrementThread();
incrementThread.start();
}
}

class IncrementThread extends Thread {
private int value = 5;

public void run() {
try {
System.out.println("Value before increment: " + value);
Thread.sleep(1000);
value++;
System.out.println("Value after increment: " + value);
} catch (InterruptedException e) {
System.out.println("Thread interrupted: " + e.getMessage());
}
}
}
