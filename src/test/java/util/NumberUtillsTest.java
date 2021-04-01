package util;

public class NumberUtillsTest {
    private NumberUtills numberUtills = new NumberUtills();

    @org.junit.Test
    public void isPrimeNumber() {
        System.out.println(numberUtills.isPrimeNumber(3));
        System.out.println(numberUtills.isPrimeNumber(4));
        System.out.println(numberUtills.isPrimeNumber(5));
        System.out.println(numberUtills.isPrimeNumber(6));
        System.out.println(numberUtills.isPrimeNumber(7));
        System.out.println(numberUtills.isPrimeNumber(8));
        System.out.println(numberUtills.isPrimeNumber(11));
    }
}
