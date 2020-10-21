package Base_Algorithms_2.StackArray;

public class AppSample {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("Nick");
        stack.push("Michile");

        System.out.println(stack.size());

        System.out.println(stack.pop());

        System.out.println(stack.size());

    }
}
