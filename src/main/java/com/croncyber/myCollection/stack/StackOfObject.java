package main.java.com.croncyber.myCollection.stack;

public class StackOfObject {
    private Object[] a;  // stack element
    private int N;      // stack size

    public StackOfObject(int cap) {
        a = new String[cap];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void push(Object item) {
        if (N == a.length) resize(a.length * 2);
        a[N++] = item;
    }

    public Object pop() {

        Object item = a[--N];
        a[N] = null;
        if (N > 0 && N == a.length / 4) resize(a.length / 2);
        return item;
    }


    private void resize(int max) {
        Object[] temp = new Object[max];
        for (int i = 0; i < N; i++) {
            temp[i] = a[i];
            a = temp;
        }
    }

}