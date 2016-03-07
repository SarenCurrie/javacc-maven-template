package nz.ac.auckland.se701;

import date.*;

import java.io.StringReader;

/**
 * Created by sarenc on 7/03/16.
 */
public class Main {
    public static void main(String[] args) {
        StringReader sr = new StringReader("32-02-2001 22:34 pm");
        DateParserTokenManager scanner = new DateParserTokenManager(new SimpleCharStream(sr));
        Token t = scanner.getNextToken();
        while (t.kind != DateParserConstants.EOF) {
            System.out.println("Found: " + t.image + "(" + t.kind + ")");
            t = scanner.getNextToken();
        }
    }
}
