package number;

public class ArmstrongNumberChecker {

    public boolean isArmstrong(int num) {
        int originalNumber = num;
        int sum = 0;
        int digits = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        return sum == originalNumber;
    }

    public static void main(String[] args) {
        int number = 370;

        ArmstrongNumberChecker checker = new ArmstrongNumberChecker();

        if (checker.isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
