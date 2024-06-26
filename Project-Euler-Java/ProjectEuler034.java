public class ProjectEuler034 {
    public String run() {
        int answer = 0;
        // The maximum limit is set at 10000000. This limit is arbitrary.
        for (int i = 3; i < 10000000; i++) {
            int[] array = Library.intToArray(i);
            long sum = 0;
            for (int arrayNumber : array) {
                sum += Library.factorial(arrayNumber);
            }
            if (sum == i) {
                answer += i;
                System.out.println(i);
            }
        }

        System.out.println("Sum of all numbers which are equal to the sum of the factorial of their digits:\n" + answer);

        return String.valueOf(answer);
    }

    public static void main(String[] args) {
        new ProjectEuler034().run();
    }
}