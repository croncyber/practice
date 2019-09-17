package myCollection.stack;

import org.junit.Test;


public class StackOfObjectTest {
    {
        StackOfObject m = new StackOfObject(1);
        m.push(null);
        m.push("one");
        m.push("two");
        m.push("three");
        m.push(null);
        m.push("four");
        m.push("five");
        m.push("six");
        m.push("seven");
        m.push("eight");


        System.out.println(m.isEmpty());
        System.out.println(m.pop() + " size: " + m.size());
        System.out.println(m.isEmpty());
        System.out.println(m.pop() + " size: " + m.size());
        System.out.println(m.pop() + " size: " + m.size());
        System.out.println(m.pop() + " size: " + m.size());
        System.out.println(m.pop() + " size: " + m.size());
        System.out.println(m.pop() + " size: " + m.size());
        System.out.println(m.pop() + " size: " + m.size());
        System.out.println(m.pop() + " size: " + m.size());
        System.out.println(m.pop() + " size: " + m.size());
        System.out.println(m.isEmpty());


    }

    @Test
    public void pop() {


    }

    @Test
    public void isEmpty() {

    }

    @Test
    public void size() {
    }

    @Test
    public void push() {

    }
}