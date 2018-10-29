import java.util.ArrayList;
import java.util.List;

public class Ex4 {

    public static void main(String[] args) {
        String a = "Replace all spaces";
        String b = "ABCD";
        System.out.println(replace(a, b));
    }

    public static String replace(String a, String b) {
        List<Character> list = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        String result=null;
        int i = 0;
        while (i < a.length()) {
            if (a.charAt(i) != ' ') {
                list.add(a.charAt(i));
            } else {
                for (int j = 0; j < b.length(); j++) {
                    list.add(b.charAt(j));
                }
            }
            i++;
        }
        for (Character n : list) {
            result=stringBuilder.append(n).toString();
        }

        return result;
    }

}