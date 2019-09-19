package com.croncyber.myCollection.stack;


public class StackImplGenerics<T> {
    private T[] a;
    private int N;

    public StackImplGenerics() {
        a = (T[]) new Object[2];
        N = 0;
    }

    public boolean isEmpty() {
        return N == 0;
    }


    public int size() {
        return N;
    }


    public void push(T item) {
        if (N == a.length) {
            resize(a.length * 2);
        }
        a[N++] = item;
    }

    public T pop() {

        T item = a[--N];
        a[N] = null;
        if (N > 0 && N == a.length / 4) {
            resize(a.length / 2);
        }
        return item;
    }

    private void resize(int max) {
        assert max >= N;
        T[] temp = (T[]) new Object[max];
        if (N >= 0) System.arraycopy(a, 0, temp, 0, N);
        a = temp;
    }
}
