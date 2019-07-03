package main.java.com.stackroute.pe2;
       public class Palindrome{
           //program to check wheather the given string is palindrome or not
        public String checkPalindrome(String string){
            String reverse = "";
            int length;
            length = string.length();
            for(int i=length-1;i>=0;i--) {
                reverse = reverse + string.charAt(i);
            }
            return reverse;
        }
    }