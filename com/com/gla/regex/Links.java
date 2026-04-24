package com.gla.regex;

import java.util.regex.*;

public class Links {
    public static void main(String[] args) {
        String text = "Visit https://www.google.com and http://example.org";

        Pattern p = Pattern.compile("https?://[^\\s]+");
        Matcher m = p.matcher(text);

        while (m.find()) {
            System.out.println(m.group());
        }
    }
}