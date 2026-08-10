class Solution {
    public int maxVowels(String s, int k) {

        int i = 0;
        int j = 0;
        int maxV = 0;
        int count = 0;

        while (j < s.length()) {

            // Add the character entering the window
            if (isVowel(s.charAt(j))) {
                count++;
            }

            // When window size becomes k
            if (j - i + 1 == k) {

                maxV = Math.max(maxV, count);

                // Remove the character leaving the window
                if (isVowel(s.charAt(i))) {
                    count--;
                }

                i++;
            }

            j++;
        }

        return maxV;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i'
                || c == 'o' || c == 'u';
    }
}