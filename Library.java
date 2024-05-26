import java.util.Arrays;

final class Library {

    // Check if n is prime
    public static boolean isPrime (long n) {
        if (n < 2) return false;
        if (n == 2) return true;
        for (long i = 2L; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }


    // Max n value is 9
    // Return n digit pan digital numbers array
    public static int[] nDigitPan (int n) {
        int[] array = new int[100000];
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] panDigitalNumbers = new int[n];
        System.arraycopy(numbers, 0, panDigitalNumbers, 0, n);

        int k = 0;
        for (int i = (int) Math.pow(10, n - 1); i < Math.pow(10, n); i++) {
            String strNumber = String.valueOf(i);
            String[] strDigits = strNumber.split("");
            int[] digits = new int[strDigits.length];
            Arrays.sort(strDigits);

            for (int j = 0; j < strDigits.length; j++) {
                digits[j] = Integer.parseInt(strDigits[j]);
            }

            if (Arrays.equals(digits, panDigitalNumbers)) {
                array[k] = i;
                k++;
            }
        }

        int [] result = new int[k];
        System.arraycopy(array, 0, result, 0, k);

        return result;
    }
}