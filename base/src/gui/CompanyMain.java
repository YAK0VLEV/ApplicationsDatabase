
/* A database for tracking companies in which the application was submitted */

package gui;

import backend.Company;
import backend.StandardCompany;

import database.DbConnection;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Runs Applications Database by instantiating and starting the CompanyGUI.
 *
 * @author Denis Yakovlev
 * @version October 13 2018
 */
public class CompanyMain extends Application {

    /**
     * Driver Method.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {


        launch(args);

        // for testing functionality in console
        //consoleTests();

        // CHECK field for company name should not be UNIQUE
        // id for the company (I think) can be / must be  UNIQUE

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

    } // end main

    /**
     *
     */
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("view.fxml"));
        primaryStage.setTitle("test by using OpenJDK + OpenJFX");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    } // end start

    /**
     * Main method to test the functionality in the console
     */
    private static void consoleTests() {

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
        String newTable = "test (digit INTEGER, title TEXT);";

        System.out.println("TEST 3");
        db.createTable(newTable);

        System.out.println("TEST 4");

        // CREATE 2ND TABLE - to check if it handles an existing table with the same name
        // string includes a new table name and the statement with column to create itself
        newTable = "test (NUM INTEGER);";

        System.out.println("TEST 5");
        db.createTable(newTable);

        System.out.println("TEST 6");

        // CREATE 3RD TABLE
        // string includes a new table name and the statement with column to create itself
        newTable = "company (digit INTEGER, companyName TEXT);";

        System.out.println("TEST 7");
        db.createTable(newTable);

        System.out.println("TEST 8");


        // ADDING 2 ENTRIES
        // string includes a new table name and the statement with column to create itself
        String newEntryData = "test VALUES (1, \"fir\");";

        System.out.println("TEST 9");

        db.insertQuery(newEntryData);

        System.out.println("TEST 10");

        newEntryData = String.format("test VALUES (%d, %s);", 15, "\"seco\"");
        db.insertQuery(newEntryData);

        System.out.println("==============    1    =============");

        // DISPLAY DB CONTENT
        String newSelect = "test;";
        db.selectQuery(newSelect);

        System.out.println("=============    2    ==============");

        // UPDATE ENTRIES WHERE digit == 1
        String newUpdate = "test SET title = \"how are you\" where digit = 1;";
        db.updateQuery(newUpdate);

        // DISPLAY DB CONTENT
        newSelect = "test;";
        db.selectQuery(newSelect);

        System.out.println("===========    3     ================");

        // DELETE ENTRIES WHERE digit == 1
        String newDelete = "test where digit = 1;";
        db.deleteQuery(newDelete);

        // DISPLAY DB CONTENT
        newSelect = "test;";
        db.selectQuery(newSelect);

    } // end consoleTests

} // end class
