package java_Practice;
public class FindDuplicateCharectersInString {
    public static void main(String[] args) {
        String str = "automation";
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            int count = 1;

            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    count++;
                }
            }

            if (count > 1) {
                System.out.println(chars[i] + " : " + count);
            }
        }
    }
}