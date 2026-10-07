package Coding_Practice;

public class Check_Palindrome_String {
    public static void main(String[] args) {
        String str = "MADAM";
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--){
            rev += str.charAt(i);
        }
        if (str.equals(rev)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
