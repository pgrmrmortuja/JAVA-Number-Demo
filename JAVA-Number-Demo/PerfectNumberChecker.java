package number;

public class PerfectNumberChecker {

    public boolean isPerfect(int num) {
        int sum = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == num;
    }

    public static void main(String[] args) {
        int number = 28;

        PerfectNumberChecker checker = new PerfectNumberChecker();

        if (checker.isPerfect(number)) {
            System.out.println(number + " is a Perfect number.");
        } 
        else {
            System.out.println(number + " is not a Perfect number.");
        }
    }
}
