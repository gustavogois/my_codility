package lessons.o01_Iterations;

public class Solution {
    public int solution(int n) {

        String binary = Integer.toBinaryString(n);

        int result = binaryGap(binary);

        return result;
    }

    public int binaryGap(String binary) {
        if (binary.length() < 3) {
            return 0;
        }
        boolean isCounting = false;
        int count = 0, result = 0;
        for (int i = 1 ; i < binary.length() - 1; i++) {
            if (startCounting(binary, i)) {
                isCounting = true;
                count++;
            }
            if (endCounting(binary, i)) {
                result = count > result ? count : result;
                count = 0;
                isCounting = false;
            }
            count = shouldIncrement(binary, isCounting, i) ? ++count : count;
        }
        return result;
    }

    private boolean shouldIncrement(String binary, boolean isCounting, int i) {
        return isCounting && binary.charAt(i) == '0';
    }

    private boolean endCounting(String binary, int i) {
        return binary.charAt(i) == '0' && binary.charAt(i + 1) == '1';
    }

    private boolean startCounting(String binary, int i) {
        return binary.charAt(i) == '0' && binary.charAt(i - 1) == '1';
    }
}
