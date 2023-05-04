package KabirClass.Exercise;

public class countDigits {
    public static void main(String[] args) {
        String [] arr = {"Ab1396", "Q2RBS", "G381ac"};
        System.out.println(countDigit(arr));
    }

    public static int countDigit(String[] input) {
        int length = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length(); j++) {
                length++;
            }
        }
        char[] charArray = new char[length];
        int numberOfDigits = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length(); j++) {
                charArray[numberOfDigits] = input[i].charAt(j);

                if (charArray[numberOfDigits] =='1'|| charArray[numberOfDigits] =='2' || charArray[numberOfDigits] =='3'|| charArray[numberOfDigits] =='4' || charArray[numberOfDigits] =='5'|| charArray[numberOfDigits] =='6' || charArray[numberOfDigits] =='7'|| charArray[numberOfDigits] =='8' || charArray[numberOfDigits] =='9'|| charArray[numberOfDigits] =='0') {
                numberOfDigits++;
                }
            }
        }

        return numberOfDigits;
    }
}
