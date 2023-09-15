public class Main {
    public static void main(String[] args) {
        final double interest = 1.17;
        int ccInitBalance = 5000;
        double monthOne;
        double monthTwo;

        System.out.println("The initial balance is $" + ccInitBalance);
        monthOne = ccInitBalance * interest;
        System.out.println("The balance after one month is $" + monthOne);
        monthTwo = monthOne * interest;
        System.out.println("The balance after two months is $" + monthTwo);

    }
}