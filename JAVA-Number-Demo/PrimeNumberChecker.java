public class PrimeNumberChecker {

    public boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int number = 23;

        PrimeNumberChecker checker = new PrimeNumberChecker();

        if (checker.isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } 
        else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
