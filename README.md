# SQL-to-MongoDB

Here is the project for converting SQL queries to MongoDB commannds.

The structure is:
Main class - where the user can enter the SQL SELECT query.
variant_choice class - there the porgram chooses one of the 4 variants of our query and creates objects of the variant1, variant2, variant3, variant4 classes.
variant class - the superclass for our variant classes.
variant1, variant2, variant3, variant4 classes - the subclasses for our SQL queries transformation.
cursors class - the class which contains methods for transforming LIMIT and SKIP queries in SQL.

Also there are test classes:
variant_choiceTest class - the test for the variant_choice class.
TestRunner class - to run our test with several arguments.

1. If you want to test it, you can run TestRunner.java and there you'll find the result of the successful completion.
2. If you want to enter the SQL query yourself, you have to run the Main class and enter the query.

NOTE:
For now the project supports only SELECT queries, also we can have only one condition for WHERE (= <> < >).
