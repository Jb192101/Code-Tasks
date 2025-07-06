// Link: https://leetcode.com/problems/min-stack/description/

class MinStack {
    List<Integer> stack;
    List<Integer> minElements;

    public MinStack() {
        this.stack = new ArrayList<>();
        this.minElements = new ArrayList<>();
    }

    public void push(int val) {
        stack.add(val);
        if(minElements.isEmpty()) {
            minElements.add(val);
        } else {
            minElements.add(Math.min(minElements.getLast(), val));
        }
    }

    public void pop() {
        stack.removeLast();
        minElements.removeLast();
    }

    public int top() {
        return stack.getLast();
    }

    public int getMin() {
        return minElements.getLast();
    }
}
