package com.croncyber.myCollection.stack;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class StackOfObjectTest {
    private Object[] a;  // stack element
    private int N;
    @Test
    public void isEmptyNotEmpty(){
        StackOfObject stackOfObject = new StackOfObject(1);
        stackOfObject.push("@");
        assertFalse(stackOfObject.isEmpty());
    }

    @Test
    public void isEmpty(){
        StackOfObject stackOfObject = new StackOfObject(1);
        assertTrue(stackOfObject.isEmpty());
    }


    @Test
    public void size() {
    }

    @Test
    public void push() {
    }

    @Test
    public void pop() {
    }
}