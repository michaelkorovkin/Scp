package util;

public class NumberUtills {
    /**
     * Number utils
     */
    public NumberUtills (){

    }

    /**
     * Is number prime
     * @param number - nubmer fpr checl
     * @return is prime - true, false - is not prime
     */
    public boolean isPrimeNumber (Integer number) {
        boolean ret = true;
        for (int i = 2; i<=number-1; i++) {
            int temp = number % i;
            if (temp == 0) {
                ret = false;
                return ret;
            }
        }
        return ret;
    }

}
