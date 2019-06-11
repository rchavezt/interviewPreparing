package com.interview;

public class countingValleys {
    static int countingValleys(int n, String s) {
        char[] array = s.toCharArray();
        int result = 0, flag = 0, stack = 0;

        for (char a: array) {
            if (a == 'U') {
                stack++;
            } else {
                stack--;
            }

            if (stack < 0 && flag == 0) {
                flag++;
            } else if (stack >= 0 && flag > 0) {
                result++;
                flag--;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(countingValleys(0, "UDDDUDUU"));
    }

//    private static final Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        String s = scanner.nextLine();
//
//        int result = countingValleys(n, s);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
//    }
}
