package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    Student student = new Student();

    @Test
    public void testPass() {
        assertEquals("Pass", student.checkResult(75));
    }

    @Test
    public void testFail() {
        assertEquals("Fail", student.checkResult(35));
    }

    @Test
    public void testMinimumPassMarks() {
        assertEquals("Pass", student.checkResult(50));
    }

    @Test
    public void testZeroMarks() {
        assertEquals("Fail", student.checkResult(0));
    }

    @Test
    public void testMaximumMarks() {
        assertEquals("Pass", student.checkResult(100));
    }

    @Test
    public void testInvalidNegativeMarks() {
        assertEquals("Invalid Marks", student.checkResult(-5));
    }

    @Test
    public void testInvalidMarksAbove100() {
        assertEquals("Invalid Marks", student.checkResult(110));
    }
}