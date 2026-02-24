package OOPSArrayLoop;

/**
 * OOPSBannerApp UC4 - Array & Loops Implementation
 * * This version improves modularity by storing banner lines in a String array.
 * It replaces repetitive print statements with an enhanced for-loop for traversal,
 * ensuring the code is scalable and easier to maintain.
 *
 * @author Reeju
 * @version 4.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {
        String gap = "   ";

        // UC4 Requirement: Storing banner lines in a String array using String.join()
        String[] bannerLines = {
            String.join(gap, " *** ", " *** ", "**** ", " ****"),
            String.join(gap, "* *", "* *", "* *", "* "),
            String.join(gap, "* *", "* *", "* *", "* "),
            String.join(gap, "* *", "* *", "**** ", " *** "),
            String.join(gap, "* *", "* *", "* ", "    *"),
            String.join(gap, "* *", "* *", "* ", "    *"),
            String.join(gap, " *** ", " *** ", "* ", "**** ")
        };

        // UC4 Requirement: Using a loop to print the array elements
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}