
/* A database for tracking companies in which the application was submitted */

package gui;

import backend.Company;
import backend.StandardCompany;

import database.DbConnection;
import java.sql.*;

/**
 * Runs Applications Database by instantiating and starting the CompanyGUI.
 *
 * @author Denis Yakovlev
 * @version October 09 2018
 */
public class CompanyMain {

    /**
     * Driver Method.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {

        System.out.println();

        Company testCompany = new StandardCompany();
        System.out.println(testCompany.getName());
        System.out.println();
        System.out.println("****************************");
        System.out.println();

        System.out.println("TEST 1");
        DbConnection db = new DbConnection();


        System.out.println("TEST 2");

        // CREATE 1 TABLE
        // string includes a new table name and the statement with column to create itself
        String newTable = "test (NUM INTEGER);";

        System.out.println("TEST 3");
        db.createTable(newTable);

        System.out.println("TEST 4");

        // CREATE 2ND TABLE
        // string includes a new table name and the statement with column to create itself
        newTable = "company (NUM INTEGER);";

        System.out.println("TEST 5");
        db.createTable(newTable);

        System.out.println("TEST 6");

        // NEED TO SEE OUTPUT!!!!



                    /*"CREATE TABLE companies " +
                    "(CompanyName VARCHAR(255) PRIMARY KEY  NOT NULL," +
                    " ApplicationDate NUMERIC       NOT NULL, " +
                    " TryNumber INTEGER     NOT NULL, " +
                    " PositionName        CHAR(255), " +
                    " Requirements         CHAR(255), " +
                    " Response INTEGER     NOT NULL, " +
                    " PhoneInterview INTEGER     NOT NULL, " +
                    " OnSiteInterview INTEGER     NOT NULL, " +
                    " MyComment CHAR(255))";*/


        // string includes a new table name and the statement with column to create itself
         String newEntryData = "test VALUES (1);";

        System.out.println("TEST 7");
        db.insertQuery(newEntryData);

        System.out.println("TEST 8");
    } // end main
} // end class
