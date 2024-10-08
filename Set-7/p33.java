
class SumThread extends Thread {
int start;
int end;
int[] numbers;
int partialSum;

public SumThread(int start, int end, int[] numbers) {
this.start = start;
this.end = end;
this.numbers = numbers;
}

public void run() {
partialSum = 0;
for (int i = start; i < end; i++) {
partialSum += numbers[i];
}
}

public int getPartialSum() {
return partialSum;
}
}
public class p33 {
public static void main(String[] args) {
int N = 4;
int n = 2;

if (N < n) {
System.out.println("N should be greater than or equal to n.");
return;
}

int[] numbers = new int[N];
for (int i = 0; i < N; i++) {
numbers[i] = i + 1;
}

SumThread[] threads = new SumThread[n];
int chunkSize = N / n;
int remainder = N % n;

int start = 0;
for (int i = 0; i < n; i++) {
int end = start + chunkSize + (i < remainder ? 1 : 0);
threads[i] = new SumThread(start, end, numbers);
threads[i].start();
start = end;
}

int totalSum = 0;
try {
for (SumThread thread : threads) {
thread.join();
totalSum += thread.getPartialSum();
}
} catch (InterruptedException e) {
e.printStackTrace();
}

System.out.println("The total sum is: " + totalSum);
}
}

