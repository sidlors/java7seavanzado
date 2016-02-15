package com.mitocode.tema1.test;

import com.mitocode.tema1.Alumno;
import com.mitocode.tema1.Persona;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testAlumno()
    {
    	assertEquals(4, Alumno.sumar(2));
    }
    
    /**
     * Rigourous Test 2
     */
    public void testPersona()
    {
    	assertEquals(3, Persona.sumar(2));
    }
}
