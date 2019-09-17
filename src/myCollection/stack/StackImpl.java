package myCollection.stack;


public class StackImpl {
    public static void main(String[] args) {
        StackOfObject m = new StackOfObject(5);
        m.push("ssss");
        m.push("ssssss");
        m.push("ssssss");
        m.push("ssssss");

        System.out.println(m.pop() + " size: " + m.size());

    }
}
