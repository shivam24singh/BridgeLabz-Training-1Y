import java.util.*;

public class ReplaceZero {
    public static void main(String[] args) {
        int num = 102030;

        String result = String.valueOf(num).replace('0', '1');

        System.out.println("Original number: " + num);
        System.out.println("Modified number: " + result);
    }
}