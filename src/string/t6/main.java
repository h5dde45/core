package string.t6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {
    public static void main(String[] args) {
       String s="some text";
        System.out.println(Pattern.matches("some text",s));

         Pattern pattern=Pattern.compile("some text");
        Matcher matcher=pattern.matcher(s);
        System.out.println(matcher.matches());

    }
}
