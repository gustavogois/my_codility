package lessons.o01_Iterations;

public class Solution {
    public int solution(int n) {

        String binary = Integer.toBinaryString(n);

        boolean isCounting = false;
        int count = 0, result = 0;
        for (int i = 0 ; i < binary.length() ; i++) {
            if (binary.charAt(i) == '1') {
                if (isCounting) {
                    result = count;
                    count = 0;
                }
                isCounting = !isCounting;
            } else if (isCounting) {
                count++;
            }
        }

        return result;
    }
}
