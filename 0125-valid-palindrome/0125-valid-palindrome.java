class Solution {
    public boolean isPalindrome(String s) {
    
    //clean text
    //check string for palindrome

    StringBuilder cleanedText = new StringBuilder();

    for (char c : s.toCharArray()) {
        if (Character.isLetterOrDigit(c)) {
            cleanedText.append(Character.toLowerCase(c));
        }
    }

    String processedText = cleanedText.toString();

    int left = 0;
    int right = processedText.length() - 1;

    while (left < right) {
        if (processedText.charAt(left) != processedText.charAt(right)) {
            return false;
        }
        left ++;
        right --;
    }
        return true;
    }
}
