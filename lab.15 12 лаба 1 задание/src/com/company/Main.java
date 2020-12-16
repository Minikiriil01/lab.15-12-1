package com.company;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {

    public static void main(String[] args) {
        String regex = "(\\d+.?\\d*) (EU|RUB|USD)";
        Pattern pattern = Pattern.compile(regex);
        String inp = "1 USD кукукукукукук 2 USD зуйцшгарзшужолмва 2.4 USD efiuewfewfwi 2 EU RUB sdadkewfqg; dsd jaksdjalsdqrewg akdjgeqr ksalkdjreqg 22.003134 RUB";
        Matcher matcher = pattern.matcher(inp);
        while (matcher.find()) {
            System.out.println(matcher.group());

        }
    }
}
