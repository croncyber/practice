package com.croncyber.myCollection.stack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class StackOfObjectTest {

    private StackOfObject stackOfObject;

    @Before
    public void newStack() {
        stackOfObject = new StackOfObject(1);
    }


    @Test
    public void isEmptyNotEmpty() {
        stackOfObject.push("@");
        assertFalse(stackOfObject.isEmpty());
    }

    @Test
    public void isEmpty() {
        assertTrue(stackOfObject.isEmpty());
    }


    @Test(expected = IllegalArgumentException.class)
    public void push() {
        stackOfObject.push(null);
    }


    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void pop() {
        stackOfObject.pop();
    }

}