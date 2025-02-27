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
        String [][] arr = new String[doc1.length()][doc2.length()];
        int longest = 0;
        for(int i =0; i < doc1.length(); i++) {
            for(int j =0; j < doc2.length();j++ ) {
                if(doc1.charAt(i) == doc1.charAt(j)) {

                }
            }
        }
        return 0;
    }
}
