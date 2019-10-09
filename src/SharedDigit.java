public class SharedDigit {

    public static boolean hasSharedDigit (int firstNum, int secondNum) {
        if (firstNum < 10 || firstNum > 99 || secondNum < 10 || secondNum > 99) {
            return false;
        }

        int digitFromFirstNum;
        int digitFromSecondNum;
        int originalSecondNum = secondNum;

        while (firstNum > 0) {
            digitFromFirstNum = firstNum % 10;
            secondNum = originalSecondNum;

            while (secondNum > 0) {
                digitFromSecondNum = secondNum % 10;
                if (digitFromFirstNum == digitFromSecondNum) {
                    return true;
                }
                secondNum /= 10;
            }
            firstNum /= 10;
        }
        return false;
    }
}
