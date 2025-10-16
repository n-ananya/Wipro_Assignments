package Project10_StringOperationsArrayList;

import java.util.*;

public class StringOperationsArrayList {

    public static ArrayList<String> performOperations(String s1, String s2) {
        ArrayList<String> results = new ArrayList<>();

        // 1️ Replace every alternate character in s1 with s2
        StringBuilder op1 = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if (i % 2 == 0)
                op1.append(s2);  // replace character
            else
                op1.append(s1.charAt(i));  // keep character
        }
        results.add(op1.toString());

        // 2️ If s2 appears more than once in s1, replace last occurrence with reverse(s2), else return s1 + s2
        int firstIndex = s1.indexOf(s2);
        int lastIndex = s1.lastIndexOf(s2);
        if (firstIndex != -1 && firstIndex != lastIndex) {
            String reversedS2 = new StringBuilder(s2).reverse().toString();
            String op2 = s1.substring(0, lastIndex) + reversedS2 + s1.substring(lastIndex + s2.length());
            results.add(op2);
        } else {
            results.add(s1 + s2);
        }

        // 3️ If s2 appears more than once, delete first occurrence, else return s1
        if (firstIndex != -1 && firstIndex != lastIndex) {
            String op3 = s1.substring(0, firstIndex) + s1.substring(firstIndex + s2.length());
            results.add(op3);
        } else {
            results.add(s1);
        }

        // 4️ Divide s2 into two halves and add to beginning and end of s1
        int mid = (s2.length() + 1) / 2; // if odd, extra char goes to first half
        String firstHalf = s2.substring(0, mid);
        String secondHalf = s2.substring(mid);
        String op4 = firstHalf + s1 + secondHalf;
        results.add(op4);

        // 5️ Replace characters in s1 that are present in s2 with '*'
        StringBuilder op5 = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if (s2.contains(String.valueOf(s1.charAt(i)))) {
                op5.append('*');
            } else {
                op5.append(s1.charAt(i));
            }
        }
        results.add(op5.toString());

        return results;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String S1: ");
        String s1 = sc.nextLine();

        System.out.print("Enter String S2: ");
        String s2 = sc.nextLine();

        ArrayList<String> output = performOperations(s1, s2);

        System.out.println("\nOutput:");
        System.out.println(output);

        sc.close();
    }
}

