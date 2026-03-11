class Solution {
    public int strStr(String haystack, String needle) {
        // If needle is empty, return 0 by problem definition
        if (needle.length() == 0) return 0;

        int hayLen = haystack.length();
        int needleLen = needle.length();

        // Loop through haystack, only up to a point where needle can fit
        for (int i = 0; i <= hayLen - needleLen; i++) {
            // Check substring of haystack starting at i
            if (haystack.substring(i, i + needleLen).equals(needle)) {
                return i; // Found first occurrence
            }
        }
        return -1; // Not found
    }
}