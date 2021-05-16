package stackqueue_q2;

public class Node {

    private char name;
    private int priority;
    private boolean wanted;

    public Node(char name, int priority, boolean wanted) {
        this.name = name;
        this.priority = priority;
        this.wanted = wanted;
    }
    
    public char getName() {
        return this.name;
    }

    public int getPriority() {
        return this.priority;
    }

    public boolean isWanted() {
        return this.wanted;
    }

}
