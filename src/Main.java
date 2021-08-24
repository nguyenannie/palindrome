public class Main {
  public static boolean isPalindrome(String input) {
    StringBuilder strippedInput = new StringBuilder();
    for (int i = 0; i < input.length(); i++) {
      if (!isInSpecialChars(input.charAt(i))) {
        strippedInput.append(input.charAt(i));
      }
    }
    StringBuilder reversedInput = new StringBuilder();
    for (int i = strippedInput.length() - 1; i >= 0; i--) {
      reversedInput.append(strippedInput.charAt(i));
    }
    return reversedInput.toString().equals(strippedInput.toString());
  }

  static boolean isInSpecialChars(char c) {
    char[] specialChars = {' ', '.', '?', ','};
    for (int i = 0; i < specialChars.length; i++) {
      if (specialChars[i] == c) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    String input = "tacocat";
    String input2 = "annie";
    String setence = "did hanna see bees? hanna did.";
    String setence2 = "eva can i stab bats in a cave?";
    System.out.println(input + " is palindrome " + isPalindrome(input));
    System.out.println(input2 + " is palindrome " + isPalindrome(input2));
    System.out.println(setence + " is palindrome " + isPalindrome(setence));
    System.out.println(setence2 + " is palindrome " + isPalindrome(setence2));

  }
}
