package main.Strings.Class__Problems;
import java.util.Scanner;
class Palindrome {
    boolean isPalindromeIterative(String text){
        int start = 0;
        int end = text.length() - 1;
        while (start < end){
            if (text.charAt(start) != text.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    boolean isPalindromeRecursive(String text){
        if (text.length() <= 1){
            return true;
        }
        if (text.charAt(0) != text.charAt(text.length() - 1)){
            return false;
        }
        return isPalindromeRecursive(
            text.substring(1, text.length() - 1)
        );
    }

    boolean isPalindromeArrayReversal(String text){
        char[] arr = text.toCharArray();
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        String reversed = new String(arr);
        return text.equals(reversed);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String text = sc.next();
        Palindrome obj = new Palindrome();
        boolean result1 = obj.isPalindromeIterative(text);
        boolean result2 = obj.isPalindromeRecursive(text);
        boolean result3 = obj.isPalindromeArrayReversal(text);
        if (result1){
            System.out.println("Iterative: Palindrome");
        }
        else{
            System.out.println("Iterative: Not Palindrome");
        }
        if (result2){
            System.out.println("Recursive: Palindrome");
        }
        else{
            System.out.println("Recursive: Not Palindrome");
        }
        if (result3){
            System.out.println("Array Reversal: Palindrome");
        }
        else{
            System.out.println("Array Reversal: Not Palindrome");
        }
    }
}
