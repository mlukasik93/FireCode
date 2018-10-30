public class Ex5 {
    public static void main(String[] args) {
        System.out.println(reverseString("abcdefg"));
    }

    public static String reverseString(String str) {
        String inputString = str;
        String outputString = null;
        if (inputString != ""&& inputString!=null) {
            char[] tab = new char[inputString.length()];
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (i < inputString.length()) {
                tab[i] = inputString.charAt(inputString.length() - i - 1);
                i++;
            }
            for (char n : tab) {
                outputString = sb.append(n).toString();
            }
        } else if (inputString == null) {
            outputString = null;
        } else outputString= "";

        return outputString;
    }
}