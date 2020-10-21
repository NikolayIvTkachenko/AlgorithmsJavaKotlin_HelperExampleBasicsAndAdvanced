package Base_Algorithms_2.StackLinkedList;

public class AppSample {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(3);

        System.out.println(stack.pop());

        System.out.println(stack.size());

        System.out.println(stack.pop());

        System.out.println(stack.isEmpty());

    }
}
