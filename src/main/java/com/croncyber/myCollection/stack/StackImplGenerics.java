package com.croncyber.myCollection.stack;

public class StackImplGenerics<Item> {
    private Item[] a;
    private int N;


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
        T[] temp;
        temp = T
        for (int i = 0; i < N; i++) {
            temp[i] = a[i];
            a = temp;
        }
    }


}
