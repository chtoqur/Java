import java.util.*;

public class Exam_Stack {
	public static void main(String[] args) {
		// if (args.length != 1) {
		// 	System.out.println("Usage:java Ex11_3 \"EXPRESSION\"");
		// 	System.out.println("Example:java Ex11_3 \"((2+3)*1)+3\"");
		// 	System.exit(0);
		// }

		Stack st = new Stack();
        System.out.println("===Stack===");
        st.push("0");
        st.push("1");
        st.push("2");

        // st.pop();
        // st.pop();
        // st.pop();

        while (!st.empty())
        {
            System.out.println(st.pop());
        }

        Queue q = new LinkedList<>();
        System.out.println("===Queue===");
        q.offer("0");
        q.offer("1");
        q.offer("2");

        while (!q.isEmpty())
        {
            System.out.println(q.poll());
        }


        

		// String expression = "((3+5)*8-2)"; // args[0];

		// System.out.println("expression:" + expression);

		// try {
		// 	for (int i = 0; i < expression.length(); i++) {
		// 		char ch = expression.charAt(i);

		// 		if (ch == '(') {
		// 			st.push(ch + "");
		// 		} else if (ch == ')') {
		// 			st.pop();
		// 		}
		// 	}

		// 	if (st.isEmpty()) {
		// 		System.out.println("괄호가 일치합니다.");
		// 	} else {
		// 		System.out.println("괄호가 일치하지 않습니다.");
		// 	}
		// } catch (EmptyStackException e) {
		// 	System.out.println("괄호가 일치하지 않습니다.");
		// } // try
	}
}