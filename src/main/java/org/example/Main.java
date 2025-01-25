package org.example;

import java.util.Stack;

public class Main {

    // Palindrom kontrolü için metod
    public static boolean checkForPalindrome(String input) {
        if (input == null || input.isEmpty()) return false;

        // Geçersiz karakterleri kaldır ve küçük harfe çevir
        StringBuilder cleanInput = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleanInput.append(Character.toLowerCase(c));
            }
        }

        // Stack kullanarak tersini kontrol et
        int length = cleanInput.length();
        for (int i = 0; i < length / 2; i++) {
            if (cleanInput.charAt(i) != cleanInput.charAt(length - i - 1)) {
                return false;
            }
        }

        return true;
    }

    // Decimal'den Binary'ye çevirme metodu
    public static String convertDecimalToBinary(int number) {
        if (number == 0) return "0";

        Stack<Integer> stack = new Stack<>();
        while (number > 0) {
            stack.push(number % 2);
            number /= 2;
        }

        StringBuilder binary = new StringBuilder();
        while (!stack.isEmpty()) {
            binary.append(stack.pop());
        }

        return binary.toString();
    }
}
