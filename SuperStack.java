public class SuperStack {

    Stack stack = new Stack();

    public static void main(String args[]) {
        String[] operations = new String[]{"push 4",
                                            "pop",
                                            "push 3",
                                            "push 5",
                                            "push 2",
                                            "inc 3 1",
                                            "pop",
                                            "push 1",
                                            "inc 2 2",
                                            "push 4",
                                            "pop",
                                            "pop"};
        new SuperStack().superStack(operations);
    }

    private void superStack(String[] operations) {
        int i = 0;

        while (i<operations.length) {
            if (operations[i].contains("push")) {
                int operand = Integer.parseInt(operations[i].split(" ")[1]);
                stack.push(operand);
            }
            else if (operations[i].contains("pop")) {
                stack.pop();
            }
            else if (operations[i].contains("inc")) {
                int e = Integer.parseInt(operations[i].split(" ")[1]);
                int k = Integer.parseInt(operations[i].split(" ")[2]);
                increment(k, e);
            }
            stack.print();
            i++;
        }
    }

    // Recursively push and pop to reach the bottom of stack
    // and edit elements
    private int increment(int k, int e) {
        int value, noOfIncrements;
        if (stack.isEmpty()) {
            return 0;
        }
        value = stack.pop();
        noOfIncrements = increment(k, e);
        if (noOfIncrements < e){
            stack.push(value+k);
            noOfIncrements++;
        }
        else {
            stack.push(value);
        }
        return noOfIncrements;
    }


}