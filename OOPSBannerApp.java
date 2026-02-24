package OOPSStringJoin;

/**
 * OOPSBannerApp UC3 - String Join Implementation
 *
 * This version refactors the banner display to use the String.join() method,
 * which improves memory efficiency by reducing excessive temporary objects 
 * during the rendering process.
 *
 * @author Reeju
 * @version 3.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {
        // Defining the delimiter for consistent 3-space gaps between letters
        String gap = "   ";

        // Constructing each line of the "OOPS" visual pattern using String.join()
        System.out.println(String.join(gap, " *** ", " *** ", "**** ", " ****"));
        System.out.println(String.join(gap, "* *", "* *", "* *", "* "));
        System.out.println(String.join(gap, "* *", "* *", "* *", "* "));
        System.out.println(String.join(gap, "* *", "* *", "**** ", " *** "));
        System.out.println(String.join(gap, "* *", "* *", "* ", "    *"));
        System.out.println(String.join(gap, "* *", "* *", "* ", "    *"));
        System.out.println(String.join(gap, " *** ", " *** ", "* ", "**** "));
    }
}