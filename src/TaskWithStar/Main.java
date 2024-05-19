package TaskWithStar;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String brackets = "([{()}[]])([])";
        Deque<String> check = new ArrayDeque();
        char[] bracket = brackets.toCharArray();
        for (char element : bracket) {
            if (!check.isEmpty() && (element == ']' || element == ')' || element == '}')) {
                Matcher balance = Pattern.compile("\\[\\]|\\(\\)|\\{\\}").matcher(check.getLast() + element);
                if (balance.matches()) {
                    check.removeLast();
                    continue;
                } else {
                    System.out.println(brackets + " - не сбалансирован!");
                    return;
                }
            }
            check.addLast(String.valueOf(element));
        }
        if (!check.isEmpty()) {
            System.out.println(brackets + " - не сбалансирован!");
        } else {
            System.out.println(brackets + " - сбалансирован!");
        }
    }
}


