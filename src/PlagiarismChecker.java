/**
 * Plagiarism Checker
 * A tool for finding the longest shared substring between two documents.
 *
 * @author Zach Blick
 * @author Elijah Chandler
 */
public class PlagiarismChecker {

    /**
     * This method finds the longest sequence of characters that appear in both texts in the same order,
     * although not necessarily contiguously.
     * @param doc1 the first document
     * @param doc2 the second
     * @return The length of the longest shared substring.
     */
    public static int longestSharedSubstring(String doc1, String doc2) {
        // Create a 2D array to store the lengths of longest common subsequences
        int[][] arr = new int[doc1.length() + 1][doc2.length() + 1];
        // Traverses the 2D array
        for(int i = 1; i <= doc1.length(); i++) {
            for(int j = 1; j <= doc2.length(); j++) {
                // If the characters are the same, add 1 to the previous diagonal value
                if(doc1.charAt(i - 1) == doc2.charAt(j - 1)) {
                    arr[i][j] = arr[i -1][j- 1] + 1;
                }
                // Otherwise, take the max of the previous row or column
                else {
                    arr[i][j] = Math.max(arr[i - 1][j], arr[i][j - 1]);
                }
            }
        }
        // Return the last value in the 2D array which is the longest common subsequence
        return arr[doc1.length()][doc2.length()];
    }
}
