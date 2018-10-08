
/* A database for tracking companies in which the application was submitted */

package backend;

import javax.swing.Icon;
import java.util.Date;
// import java.time.format.DateTimeFormatter;
import java.time.*;


/**
    An Abstract super class a company unit.

    @author Denis Yakovlev
    @version October 08 2018
*/
public abstract class AbstractCompany implements Company {

    /**
     * A number of tries to apply to this company.
     */
    private int myTryNumber;

    /**
     * A position to which the application was submitted in this company.
     */
    private String myPosition;

    /**
     * A position requirements description of this company.
     */
    private String myRequirements;

    /**
     * Confirmation if there was a response from this company.
     */
    private boolean myIsResponded;

    /**
     * Confirmation if there was a phone interview with this company.
     */
    private boolean myIsPhoneInterview;

    /**
     * Confirmation if there was an on-site interview with this company.
     */
    private boolean myIsOnsiteInterview;

    /**
     * A date when an application was sent to this company.
     */
    private Date myApplicationDate;

    /**
     * A client comment on this company.
     */
    private String myComment;

    /**
     * A name of this company.
     */
    private String myCompanyName;

    /**
     * A icon of this company.
     */
    private Icon myCompanyIcon;

    /**
     * A company constructor with the specified company name and icon(if available).
     *
     * @param theName is the given company name
     * @param theIcon is the given company icon(if available)
     */
    public AbstractCompany(final String theName,
                           final Icon theIcon) {

        myCompanyName = theName;
        myCompanyIcon = theIcon;
        myTryNumber = 0;
        myPosition = "";
        myRequirements = "";
        myIsResponded = false;
        myIsPhoneInterview = false;
        myIsOnsiteInterview = false;
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        myApplicationDate = java.util.Date
                            .from(now.atZone(ZoneId.systemDefault()).toInstant());
        myComment = "";
    }

    /**
     * Returns a name of this company.
     *
     * @return a name of this company
     */
    @Override
    public String getName() {
        return myCompanyName;
    }

    /**
     * Returns an icon of this company.
     *
     * @return an icon of this company
     */
    @Override
    public Icon getIcon() {
        return myCompanyIcon;
    }

    /**
     * Returns a number of tries to apply to this company.
     *
     * @return a number of tries to apply to this Company
     */
    @Override
    public int getTryNumber() {
        return myTryNumber;
    }

    /**
     * Returns a position description of this company.
     *
     * @return a position description of this company
     */
    @Override
    public String getPosition() {
        return myPosition;
    }

    /**
     * Returns a requirements description of this company.
     *
     * @return a requirements description of this company
     */
    @Override
    public String getRequirements() {
        return myRequirements;
    }

    /**
     * Returns if there was a response from this company.
     *
     * @return if there was a response from this company
     */
    @Override
    public boolean isResponded() {
        return myIsResponded;
    }

    /**
     * Returns if there was a phone interview with this company.
     *
     * @return if there was a phone interview with this company
     */
    @Override
    public boolean isPhoneInterview() {
        return myIsPhoneInterview;
    }

    /**
     * Returns if there was an on-site interview with this company.
     *
     * @return if there was an on-site interview with this company
     */
    @Override
    public boolean isOnsiteInterview() {
        return myIsOnsiteInterview;
    }

    /**
     * Returns a date when an application was sent to this company.
     *
     * @return a date when an application was sent to this company
     */
    @Override
    public Date getApplicationDate() {
        return myApplicationDate;
    }

    /**
     * Returns a client comment on this company.
     *
     * @return a client comment on this company
     */
    @Override
    public String getComment() {
        return myComment;
    }

    /**
     * Sets the first application try to this company.
     */
    @Override
    public void setTryNumber() {
        myTryNumber++;
    }

    /**
     * Sets a number of tries to apply to this company.
     *
     * @param theTry is a number of tries to apply to this Company
     */
    @Override
    public void setTryNumber(int theTry) {
        myTryNumber = theTry;
    }

    /**
     * Sets a position description of this company.
     *
     * @param  thePositionName is a position description of this company
     */
    @Override
    public void setPosition(String thePositionName) {
        myPosition = thePositionName;
    }

    /**
     * Sets a requirements description of this company.
     *
     * @param  theRequirementsList is a requirements description of this company
     */
    @Override
    public void setRequirements(String theRequirementsList) {
        myRequirements = theRequirementsList;
    }

    /**
     * Confirms that there was a response from this company.
     */
    @Override
    public void responded() {
        myIsResponded = true;
    }

    /**
     * Confirms that there was a phone interview with this company.
     */
    @Override
    public void phoneInterview() {
        myIsPhoneInterview = true;
    }

    /**
     * Confirms that there was an on-site interview with this company.
     */
    @Override
    public void onsiteInterview() {
        myIsOnsiteInterview = true;
    }

    /**
     * Sets a date when an application was sent to this company.
     *
     * @param theAppDate is a date when an application was sent to this company
     */
    @Override
    public void setApplicationDate(Date theAppDate) {
        myApplicationDate = theAppDate;
    }

    /**
     * Sets a client comment on this company.
     *
     * @param theComment a client comment on this company
     */
    @Override
    public void setComment(String theComment) {
        myComment = theComment;
    }
}
