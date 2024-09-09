import javax.naming.InsufficientResourcesException;

class InsufficientBalanceException extends Exception {
    void InsufficientBalanceException(String message) {
   
    }
}

public class p26 {
    public static void main(String[] args) throws InsufficientResourcesException {
        try {
            withdraw(1000, 500);
        } catch (InsufficientBalanceException e) {

            e.printStackTrace();
        }
    }

    public static void withdraw(int balance, int amount) throws InsufficientBalanceException {
        if (balance < amount) {
            throw new InsufficientBalanceException();
        } else {
            System.out.println("Withdrawal successful");
        }
    }
}