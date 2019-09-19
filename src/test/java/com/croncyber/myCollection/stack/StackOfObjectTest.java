package com.croncyber.myCollection.stack;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;




@DisplayName("Testing stack functional")
public class StackOfObjectTest {

    private StackOfObject stackOfObject;
    public Object a;

    @Before
    public void newStack() {
        stackOfObject = new StackOfObject(10);

    }


    @Test
    public void isEmpty_NotEmpty() {
        stackOfObject.push("@");
        assertFalse(stackOfObject.isEmpty());
    }

    @Test
    public void isEmpty() {
        assertTrue(stackOfObject.isEmpty());
    }


    @Test
    public void push() {
        stackOfObject.push(a);
    }


    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void pop() {
        stackOfObject.pop();
    }

}