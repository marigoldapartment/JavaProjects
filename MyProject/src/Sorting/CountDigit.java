package Sorting;

public class CountDigit {
    public static void main(String[] args) {
        String  input = "udjAGFUWY821R81Y94480" +
                "eh1ioiour9ufij" +
                "ei 1hruhroiupo";
        mains(input);

    }

    public static void mains(String input) {

        String[] lines = input.split("\\r?\\n");
        char[] character =input.toCharArray();

        for(int j = 0; j <= lines.length; j++) {
            int count = 0;
            for (int i = 0; i < character.length; i++) {
                if (character[i] >= 48 && character[i] <= 57) {
                    count++;
                }
            }
            System.out.println(count);
        }

    }
}
