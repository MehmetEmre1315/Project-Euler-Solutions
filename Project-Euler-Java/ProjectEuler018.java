public class ProjectEuler018 {
    public String run() {
        String triangle =
                """
                        75
                        95 64
                        17 47 82
                        18 35 87 10
                        20 04 82 47 65
                        19 01 23 75 03 34
                        88 02 77 73 07 63 67
                        99 65 04 28 06 16 70 92
                        41 41 26 56 83 40 80 70 33
                        41 48 72 33 47 32 37 16 94 29
                        53 71 44 65 25 43 91 52 97 51 14
                        70 11 33 28 77 73 17 78 39 68 17 57
                        91 71 52 38 17 14 91 43 58 50 27 29 48
                        63 66 04 68 89 53 67 30 73 16 69 87 40 31
                        04 62 98 27 23 09 70 98 73 93 38 53 60 04 23""";
        String[] lines = triangle.split("\n");
        int[][] numbers = new int[15][15];
        for (int i = 0; i < lines.length; i++) {
            String eachLine = lines[i];
            String[] each2DigitNumberStringArray = eachLine.split(" ");
            for (int j = 0; j < each2DigitNumberStringArray.length; j++) {
                int a = Integer.parseInt(each2DigitNumberStringArray[j]);
                numbers[i][j] = a;
            }
        }

        for (int i = numbers.length - 2; i >= 0; i--) {
            for (int j = numbers.length - 1; j >= 0; j--) {
                if (numbers[i][j] != 0) {
                    numbers[i][j] = Math.max(numbers[i][j] + numbers[i+1][j], numbers[i][j] + numbers[i+1][j+1]);
                }
            }

        }

        System.out.println("Answer: " + numbers[0][0]);
        return Integer.toString(numbers[0][0]);
    }
    public static void main(String[] args) {
        new ProjectEuler018().run();
    }
}