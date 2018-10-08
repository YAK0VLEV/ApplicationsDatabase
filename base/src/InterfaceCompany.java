/* A database for tracking companies in which the application was submitted */

import javax.swing.Icon;
import java.util.Date;

/*
Interface for a company unit.

@author Denis Yakovlev
@version October 08 2018
 */
public interface InterfaceCompany {

    /**
     * Returns a number of tries to apply to this company.
     *
     * @return a number of tries to apply to this Company
     */
    int getTryNumber();

    /**
     * Returns a position description of this company.
     *
     * @return a position description of this company
     */
    String getPosition();

    /**
     * Returns a requirements description of this company.
     *
     * @return a requirements description of this company
     */
    String getRequirements();

    /**
     * Returns if there was a response from this company.
     *
     * @return if there was a response from this company
     */
    boolean isResponded();

    /**
     * Returns if there was a phone interview with this company.
     *
     * @return if there was a phone interview with this company
     */
    boolean isPhoneInterview();

    /**
     * Returns if there was an on-site interview with this company.
     *
     * @return if there was an on-site interview with this company
     */
    boolean isOnsiteInterview();

    /**
     * Returns a date when an application was cent to this company.
     *
     * @return a date when an application was cent to this company
     */
    Date getApplicationDate();

    /**
     * Sets a number of tries to apply to this company.
     *
     * @param theTry is a number of tries to apply to this Company
     */
    void setTryNumber(int theTry);

    /**
     * Sets a position description of this company.
     *
     * @param  thePositionName is a position description of this company
     */
    void setPosition(String thePositionName);

    /**
     * Sets a requirements description of this company.
     *
     * @param  theRequirementsList is a requirements description of this company
     */
    void setRequirements(String theRequirementsList);

    /**
     * Sets if there was a response from this company.
     *
     * @param theResponded is boolean if there was a response from this company
     */
    void setIsResponded(int theResponded);

    /**
     * Sets if there was a phone interview with this company.
     *
     * @param thePhoneInterview is boolean if there was a phone interview with this company
     */
    void setIsPhoneInterview(int thePhoneInterview);

    /**
     * Sets if there was an on-site interview with this company.
     *
     * @param theOnsiteInterview is boolean if there was an on-site interview with this company
     */
    void setIsOnsiteInterview(int theOnsiteInterview);

    /**
     * Sets a date when an application was cent to this company.
     *
     * @param theAppDate is a date when an application was cent to this company
     */
    void setApplicationDate(Date theAppDate);

    /**
     * Returns a name of this company.
     *
     * @return a name of this company
     */
    String getName();


    /**
     * Returns an icon of this company.
     *
     * @return an icon of this company
     */
    Icon getIcon();

}
