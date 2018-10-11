
/* A database for tracking companies in which the application was submitted */

package database;

import java.sql.*;


/**
 Database class to handle a connection between a user interface and a database.

 @author Denis Yakovlev
 @version October 09 2018
 */
public class DbConnection {

    /**
     * A path(URL) to an existing / creation a new database.
     */
    private String myDbPath;

    /**
     * Connection to an existing / creation a new database.
     */
    private Connection myConnect;

    /**
     * A myQuery to run.
     */
    private Statement myQuery;

    /**
     * Connection to an existing / Creation a new table.
     */
    private String myCreateTable;

    /**
     * An myInsert myQuery.
     */
    private String myInsert;

    /**
     * A mySelect myQuery.
     */
    private ResultSet mySelect;

    /**
     * An myUpdate myQuery.
     */
    private String myUpdate;

    /**
     * A myDelete myQuery.
     */
    private String myDelete;

    /**
     * Default constructor to construct a new (or opens the existing) database.
     */
    public DbConnection() {

        // 	Open the file "data.db" in the current directory.
        this("data.db");

    } // end default constructor

    /**
     * Primary constructor to construct a new (or open the existing) database.
     */
    public DbConnection(String theDbURL) {

        myDbPath = theDbURL;
        myCreateTable = "";
        myInsert = "";
        mySelect = null;
        myUpdate = "";
        myDelete = "";


        try {
            // open db connection
            Class.forName("org.sqlite.JDBC");

            myConnect = DriverManager.getConnection("jdbc:sqlite:" + theDbURL);
            myConnect.setAutoCommit(false);
            System.out.println("Opened database successfully");

            // commit and close db connection
            myConnect.commit();
            myConnect.close();

        } catch (Exception e) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }

    } // end primary constructor

    /**
     * Creates a new table.
     */
    public void createTable(String theStatement) {

        try {
            // open db connection
            myConnect = DriverManager.getConnection("jdbc:sqlite:" + myDbPath);
            myConnect.setAutoCommit(false);
            System.out.println("Opened database successfully");

            // make a query
            myQuery = myConnect.createStatement();
            myCreateTable = "CREATE TABLE IF NOT EXISTS " + theStatement; // need to provide a response to a user
            myQuery.executeUpdate(myCreateTable);                         // if a table with that name already exists
            System.out.println("Table created successfully");

            // close query, commit and close db connection
            myQuery.close();
            myConnect.commit();
            myConnect.close();

        } catch (Exception e) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
    } // end createTable

    /**
     * Inserts a new entry into a table.
     */
    public void insertQuery(String theStatement) {

        try {

            // open db connection
            myConnect = DriverManager.getConnection("jdbc:sqlite:" + myDbPath);
            myConnect.setAutoCommit(false);
            System.out.println("Opened database successfully");

            // make a query
            myQuery = myConnect.createStatement();
            myInsert = "INSERT INTO " + theStatement;
            myQuery.executeUpdate(myInsert);
            System.out.println("Record created successfully");

            // close query, commit and close db connection
            myQuery.close();
            myConnect.commit();
            myConnect.close();

        } catch (Exception e) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
    } // end insertQuery


    /**
     * Inserts a new entry into a table.
     */
    public void selectQuery(String theStatement) {

        try {

            // open db connection
            myConnect = DriverManager.getConnection("jdbc:sqlite:" + myDbPath);
            myConnect.setAutoCommit(false);
            System.out.println("Opened database successfully");

            // make a query
            myQuery = myConnect.createStatement();
            mySelect = myQuery.executeQuery("SELECT * FROM " + theStatement);
            System.out.println("Select operation done successfully");


            while ( mySelect.next() ) {
                int digit = mySelect.getInt("digit");
                String title = mySelect.getString("title");

                System.out.println("ID = " + digit);
                System.out.println("NAME = " + title);
                System.out.println();
            }

            /* while ( mySelect.next() ) {
                int id = mySelect.getInt("id");
                String name = mySelect.getString("name");
                int age = mySelect.getInt("age");
                String address = mySelect.getString("address");
                float salary = mySelect.getFloat("salary");

                System.out.println("ID = " + id);
                System.out.println("NAME = " + name);
                System.out.println("AGE = " + age);
                System.out.println("ADDRESS = " + address);
                System.out.println("SALARY = " + salary);
                System.out.println();
            } */

            // close query, commit and close db connection
            myQuery.close();
            mySelect.close();
            myConnect.commit();
            myConnect.close();

        } catch (Exception e) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
    } // end selectQuery

} // end class
