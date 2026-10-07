package Coding_Practice;

public class Check_Prime_Number {
    public static void main(String[] args) {
        int num = 7;
        boolean isPrime = true;
        for (int i = 2; i < num; i++){
            if (num % i == 0){
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime ? "Prime" : "Not Prime");
    }
}
