class Solution {
    public boolean isPalindrome(String s) {

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {

            // Left side non-alphanumeric skip karo
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }

            // Right side non-alphanumeric skip karo
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }

            // Case-insensitive comparison
            if (Character.toLowerCase(s.charAt(i)) !=
                Character.toLowerCase(s.charAt(j))) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}