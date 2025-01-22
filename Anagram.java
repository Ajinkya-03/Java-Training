public class Anagram {
    public static boolean areAnagrams(String str1, String str2) {

        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        // Count characters in str1
        int[] charCount = new int[256]; // Assuming ASCII characters
        for (int i = 0; i < str1.length(); i++) {
            charCount[str1.charAt(i)]++;
        }

        // Check if all counts are zero
        for (int i = 0; i < 256; i++) {
            if (charCount[i] != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String string1 = "listen";
        String string2 = "silent";

        if (areAnagrams(string1, string2)) {
            System.out.println(string1 + " and " + string2 + " are anagrams.");
        } else {
            System.out.println(string1 + " and " + string2 + " are not anagrams.");
        }
    }
}
