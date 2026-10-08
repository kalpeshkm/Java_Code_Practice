package Coding_Practice;

public class SecondLargest {
    public static void main(String[] args) {

        int[] numbers = {10, 50, 20, 80, 30};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            }
            else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        System.out.println("Second Largest: " + secondLargest);
    }
}
