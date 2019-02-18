package checksums;

public class LuhnChecksumVerifier implements ChecksumVerifier {
    public boolean verify(String number) {

        int[] cardNumberArray = new int[number.length()];

        for (int i = 0; i < number.length() ; i++) {
            cardNumberArray[i] = Character.getNumericValue(number.charAt(i));
        }

        int sum = 0;
        int j = 0;
        for (int i = cardNumberArray.length-1; i >= 0; i--) {
            int element = cardNumberArray[i];
            j++;
            if (j % 2 == 0) {
                element = element * 2;
                if (element >= 10) {
                    element = element - 9;
                }
            }
            sum = sum + element;
        }

        return sum % 10 == 0;
    }
}
