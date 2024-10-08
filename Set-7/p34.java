
class Square extends Thread {
int number;

public void setNumber(int number) {
this.number = number;
}

public void run() {
System.out.println("Square of " + number + " is " + (number * number));
}
}

class Cube extends Thread {
int number;

public void setNumber(int number) {
this.number = number;
}

public void run() {
System.out.println("Cube of " + number + " is " + (number * number * number));
}
}

public class p34{
public static void main(String[] args) {
Square square = new Square();
Cube cube = new Cube();

for (int i = 1; i <= 10; i++) {
System.out.println("Checking Number: " + i);
if (i % 2 == 0) {
square.setNumber(i);
square.run();
} else {
cube.setNumber(i);
cube.run();
}
try {
Thread.sleep(1000);
} catch (InterruptedException e) {
e.printStackTrace();
}
}
}
}
