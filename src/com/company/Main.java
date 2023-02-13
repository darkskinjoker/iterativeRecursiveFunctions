package com.company;

public class Main {
    public static boolean ifArrayContains6Recursive(int[] nums, int index) {
        // Check if we have reached the end of the array
        if (index >= nums.length) {
            return false;
        }
        // Check if the current element is a 6
        if (nums[index] == 6) {
            return true;
        }
        // Move to the next element in the array and continue the search
        return ifArrayContains6Recursive(nums, index+1);
    }
    public static boolean ifArrayContains6Iterative(int[] nums) {
        // iterate over each element in the array using a for loop
        for (int i = 0; i < nums.length; i++) {
            // check if the current element is equal to 6
            if (nums[i] == 6) {
                // if it is, immediately return true
                return true;
            }
        }
        // if the loop finishes without finding a 6, return false
        return false;
    }
    public static String allStarRecursive(String str) {
        // base case; if the string has length 0 or 1, returns the original string
        if (str.length() < 2) {
            return str;
        }

        // recursive case; returns the first character of the string, followed by "*", followed by the result of recursively calling the function with the rest of the string
        return str.charAt(0) + "*" + allStarRecursive(str.substring(1));
    }
    public static String allStarIterative(String str) {
        // create a string builder to build the result string
        StringBuilder result = new StringBuilder();

        // iterate over each character in the string, except the last one
        for (int i = 0; i < str.length() - 1; i++) {
            // append the current character and a "*" to the result string
            result.append(str.charAt(i));
            result.append("*");
        }

        // append the last character to the result string
        if (str.length() > 0) {
            result.append(str.charAt(str.length() - 1));
        }

        // convert the string builder to a string and return it
        return result.toString();
    }
    public static int sumDigitsRecursive(int n) {
        if (n == 0) { // base case: the sum of the digits of 0 is 0
            return 0;
        } else { // recursive case: add the last digit to the sum and recurse with the last digit removed
            return n % 10 + sumDigitsRecursive(n / 10);
        }
    }
    public static int sumDigitsIterative(int n) {
        int sum = 0; // initialize a variable to store the sum of digits
        while (n > 0) { // continue while there are still digits left
            sum += n % 10; // add the last digit to the sum
            n /= 10; // remove the last digit
        }
        return sum; // return the sum of digits
    }

    public static void main(String[] args) {
        //1. Given an array of ints, compute if the array contains a 6.
        int[] nums1 = {1, 6, 4};
        int[] nums2 = {1, 4};
        int[] nums3 = {6};
        System.out.println(ifArrayContains6Iterative(nums1));
        System.out.println(ifArrayContains6Iterative(nums2));
        System.out.println(ifArrayContains6Iterative(nums3));
        System.out.println();

        int[] nums = {1, 6, 4};
        boolean result = ifArrayContains6Recursive(nums, 0);
        System.out.println(result);
        nums = new int[] {1, 4};
        result = ifArrayContains6Recursive(nums, 0);
        System.out.println(result);
        nums = new int[] {6};
        result = ifArrayContains6Recursive(nums, 0);
        System.out.println(result);
        System.out.println();

        //2. Given a string, compute a new string where all the adjacent chars and not separated by a "*".
        System.out.println(allStarRecursive("hello"));
        System.out.println(allStarRecursive("abc"));
        System.out.println(allStarRecursive("ab"));
        System.out.println();

        System.out.println(allStarIterative("hello"));
        System.out.println(allStarIterative("abc"));
        System.out.println(allStarIterative("ab"));
        System.out.println();

        //3. Given a non-negative int n, return the sum of its digits.
        System.out.println(sumDigitsIterative(126));
        System.out.println(sumDigitsIterative(49));
        System.out.println(sumDigitsIterative(12));
        System.out.println();

        System.out.println(sumDigitsRecursive(126));
        System.out.println(sumDigitsRecursive(49));
        System.out.println(sumDigitsRecursive(12));
        System.out.println();

    }
}
