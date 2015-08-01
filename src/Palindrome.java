public class Palindrome{

    static boolean isPalindrome(String s) throws Exception{
        if (s == null)
            throw new Exception("String must not be null");

        for (int i = 0; i < s.length() / 2; ++i) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i))
                return false;
        }
        return true;
    }
}
