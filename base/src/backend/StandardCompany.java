/* A database for tracking companies in which the application was submitted */

package backend;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.util.Date;
// import java.time.format.DateTimeFormatter;
import java.time.*;


/**
    A class to create a standard company.

    @author Denis Yakovlev
    @version October 08 2018
*/
public class StandardCompany extends AbstractCompany {

    /**
     * Default Constructor for a new company.
     */
    public StandardCompany() {

        this("Company", new ImageIcon("images/StandardCompanyIcon.gif"));
    } // end default constructor

    /**
     * A Constructor for an entry w/o an icon for a new company.
     */
    public StandardCompany(final String theCompany) {
        this(theCompany, new ImageIcon("images/StandardCompanyIcon.gif"));
    } // emd constructor

    /**
     * Primary constructor to construct a new company.
     *
     * @param theName is a name for the given company
     * @param theIcon is an icon for the given company
     */
    public StandardCompany(final String theName,
                           final Icon theIcon) {
        super(theName, theIcon);
    } // end primary constructor

} // end class
