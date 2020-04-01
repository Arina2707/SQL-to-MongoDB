# SQL-to-MongoDB

Here is the project for converting SQL queries to MongoDB commands.

The structure is:

1. Main class - where the user can enter the SQL SELECT query.
2. variant_choice class - there the porgram chooses one of the 4 variants of our query and creates objects of the variant1, variant2, variant3, variant4 classes.
4. variant class - the superclass for our variant classes.
5. variant1, variant2, variant3, variant4 classes - the subclasses for our SQL queries transformation.
6. cursors class - the class which contains methods for transforming LIMIT and SKIP queries in SQL.

Also there are test classes:
variant_choiceTest class - the test for the variant_choice class.
TestRunner class - to run our test with several arguments.

1. If you want to test the program, you can run TestRunner.java and there you'll find the result of the successful completion.
2. If you want to enter the SQL query yourself, you have to run the Main class and enter the query (!please, enter it correctly, with all the spaces needed and capital letters of the key words).

NOTE:
For now the project supports only SELECT queries.
For specifying equality condition I am using: 
{ <field>: { $eq: <value> } }, it's the same as { field: <value> }.
