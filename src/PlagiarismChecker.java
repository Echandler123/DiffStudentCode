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
        String currentLongest = "";
        int[][] arr = new int[doc1.length()][doc2.length()];
        int longest = 0;
        for(int i = 1; i <= doc1.length(); i++) {
            for(int j = 1; j <= doc2.length(); j++ ) {
                if(doc1.charAt(i - 1) == doc2.charAt(j -1)) {
                        arr[i][j]  = arr[i-1][j-1] +1;
                    }
                else {
                    if(arr[i-1][j] > arr[i][j-1]) {
                        arr[i][j] = arr[i-1][j];
                    }
                    else {
                        arr[i][j] = arr[i][j-1];
                    }
                }
            }
        }
        return arr[doc1.length()][doc2.length()];
    }
}
