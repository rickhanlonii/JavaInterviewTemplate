
public class Main {

    public static void main(String[] args) {
        try{
            if(Palindrome.isPalindrome(args[0])){
                System.out.println("Is Palindrome");
            } else {
                System.out.println("Is not palindrome");
            }
        } catch (Exception e){
            System.out.println("Is not palindrome");
        }
    }
}
