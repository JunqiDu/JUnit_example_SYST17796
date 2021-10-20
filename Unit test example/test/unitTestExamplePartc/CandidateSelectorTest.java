/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalexampartc;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Junqi Du
 */
public class CandidateSelectorTest {
    
    public CandidateSelectorTest() {
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

    /**
     * Test of getsQualified method for good, of class CandidateSelector.
     */
    @Test
    public void testGetsQualifiedGood() {
        System.out.println("getsQualified good");
        int yearsExperience = 20;
        double transcriptAverage = 50.1;
        boolean expResult = true;
        boolean result = CandidateSelector.getsQualified(yearsExperience, transcriptAverage);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of getsQualified method for bad, of class CandidateSelector.
     */
    @Test
    public void testGetsQualifiedBad() {
        System.out.println("getsQualified bad");
        int yearsExperience = 10;
        double transcriptAverage = 30.2;
        boolean expResult = false;
        boolean result = CandidateSelector.getsQualified(yearsExperience, transcriptAverage);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of getsQualified method for boundary, of class CandidateSelector.
     */
    @Test
    public void testGetsQualifiedBoundary() {
        System.out.println("getsQualified boundary");
        int yearsExperience = 15;
        double transcriptAverage = 45.0;
        boolean expResult = true;
        boolean result = CandidateSelector.getsQualified(yearsExperience, transcriptAverage);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
