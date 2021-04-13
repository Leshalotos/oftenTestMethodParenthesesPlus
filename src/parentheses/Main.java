package parentheses;
// @autorLesha
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String enter = scanner.nextLine();
            System.out.println(validParentheses(enter));
        }

        public static boolean validParentheses (String parens){
            //if (parens.charAt(0) == ')' || parens.charAt(0) == ']' || parens.charAt(0) == '}') return false;
            char[] str = new char[parens.length()];
            int j = 0;
            for (int i = 0; i < parens.length(); i++) {
                if (parens.charAt(i) == '(') {
                    str[j] = parens.charAt(i);
                    j++;
                } else if (parens.charAt(i) == '[') {
                    str[j] = parens.charAt(i);
                    j++;
                } else if (parens.charAt(i) == '{') {
                    str[j] = parens.charAt(i);
                    j++;
                } else if (parens.charAt(i) == ')') {
                    if (parens.charAt(i) == ')' && (j == 0 || str[j - 1] == '[' || str[j - 1] == '{')) return false;
                    j--;
                } else if (parens.charAt(i) == ']') {
                    if (parens.charAt(i) == ']' && (j == 0 || str[j - 1] == '(' || str[j - 1] == '{')) return false;
                    j--;
                } else if ((parens.charAt(i) == '}' && str[j] == '{') || (parens.charAt(i) == '}')) {
                    if (parens.charAt(i) == '}' && (j == 0 || str[j - 1] == '(' || str[j - 1] == '[')) return false;
                    j--;
                } else continue;
            }
            return j == 0;
        }
    }