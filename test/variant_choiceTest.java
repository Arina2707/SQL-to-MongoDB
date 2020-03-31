/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Arrays;
import java.util.Collection;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

/**
 *
 * @author Arina27
 */

@RunWith(Parameterized.class)
public class variant_choiceTest {
    
    private String passedResult;
    private String expectedResult;    
    
    
    public variant_choiceTest(String passedResult, String expectedResult) {
        this.passedResult = passedResult;
        this.expectedResult = expectedResult;
    } 
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
       
    
    
    @Parameterized.Parameters
    public static Collection primeNumbers() {
      return Arrays.asList(new Object[][] {
         { "SELECT * FROM sales LIMIT 10", "db.sales.find({}).limit(10)" },
         { "SELECT name, surname FROM collection" , "db.collection.find({}, {name: 1, surname: 1})" },
         { "SELECT * FROM collection SKIP 5 LIMIT 10", "db.collection.find({}).skip(5).limit(10)" },
         { "SELECT * FROM customers WHERE age > 22", "db.customers.find({age: {$gt: 22}})" },
         { "SELECT name, surname, age, city FROM collection WHERE name <> Arina SKIP 2 LIMIT 7", "db.collection.find({name: {$ne: Arina}}, {name: 1, surname: 1, age: 1, city: 1}).skip(2).limit(7)" },
         { "SELECT age, city FROM collection WHERE age = 27", "db.collection.find({age: {$eq: 27}}, {age: 1, city: 1})"},
         { "SELECT * FROM sales WHERE total < 35000", "db.sales.find({total: {$lt: 35000}})"}
      });
    }

    /**
     * Test of handle_variant method, of class variant_choice.
     */
    @Test
    public void testHandle_variant() {
        System.out.println("Passed successfully. The result is:");

        String result;
        variant_choice instance = new variant_choice(passedResult);
        result = instance.handle_variant();
        System.out.println(passedResult+" ----> "+result);
        assertEquals(expectedResult, result);
                
    }
    
}
