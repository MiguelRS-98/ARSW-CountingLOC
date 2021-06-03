package edu.escuelaing.arsw.countingLOC;

import junit.framework.TestCase;
import java.util.ArrayList;

/**
 * @author Miguel Ángel Rodríguez Siachoque.
 * This is a Class to make test of countline.java
 */
public class CountlineTest extends TestCase
{
    //First test OK loc in Exampel1.txt
    public void testLocOk1() {
        Countline countline = new Countline();
        ArrayList<String> test = countline.ReadLine("loc", "TestText\\Example1.txt");
        assertEquals(test.size(),5);
    }
    //First test OK phy in Exampel1.txt
    public void testPhyOk1() {
        Countline countline = new Countline();
        ArrayList<String> test = countline.ReadLine("phy", "TestText\\Example1.txt");
        assertEquals(test.size(),12);
    }
    //Second test OK loc in Exampel2.txt
    public void testLocOk2() {
        Countline countline = new Countline();
        ArrayList<String> test = countline.ReadLine("loc", "TestText\\Example2.txt");
        assertEquals(test.size(),8);
    }
    //Second test OK phy in Exampel2.txt
    public void testPhyOk2() {
        Countline countline = new Countline();
        ArrayList<String> test = countline.ReadLine("phy", "TestText\\Example2.txt");
        assertEquals(test.size(),10);
    }
    //First test No OK loc in Exampel1.txt
    public void testLocNoOk1() {
        Countline countline = new Countline();
        try {
            ArrayList<String> test = countline.ReadLine("loc", "TestText\\Example1.txt");
        }
    	catch(Exception e) {
            assertTrue(true);
    	}
    }
    //First test No OK phy in Exampel2.txt
    public void testPhyNoOk1() {
        Countline countline = new Countline();
        try {
            ArrayList<String> test = countline.ReadLine("loc", "TestText\\Example2.txt");
        }
    	catch(Exception e) {
            assertTrue(true);
    	}
    }
    //Second test No OK loc in Exampel3.txt
    public void testLocNoOk2() {
        Countline countline = new Countline();
        try {
            ArrayList<String> test = countline.ReadLine("loc", "TestText\\Example3.txt");
        }
    	catch(Exception e) {
            assertTrue(true);
    	}
    }
    //Second test No OK loc in Exampel1.txt
    public void testPhyNoOk2() {
        Countline countline = new Countline();
        try {
            ArrayList<String> test = countline.ReadLine("loc", "TestText\\Example1.txt");
        }
    	catch(Exception e) {
    		assertTrue(true);
    	}
    }
}
