import java.io.*;
public class SuperStack {

    Stack stack = new Stack();

    public static void main(String args[]) {
       /* String[] operations = new String[]{"push 4",
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
                                            "pop"};*/
       String[] operations = new String[300];
       int noOfInputs=0,i = 0;
       try {
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           noOfInputs = Integer.parseInt(br.readLine());
           i = 0;
           while (i < noOfInputs) {
               operations[i++] = br.readLine();
               if (!validateCommand(operations[i-1])) {
                   System.out.println("Invalid command");
                   System.exit(0);
               }
           }
       }
       catch (IOException e) {
           e.printStackTrace();
       }
       new SuperStack().superStack(operations, noOfInputs);
    }

    private void superStack(String[] operations, int length) {
        int i = 0;


        while (i<length) {
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

    static boolean validateCommand(String command) {
        if (command.contains("push")
        || command.contains("pop")
        || command.contains("inc")) {
            return true;
        }
        return false;
    }

}