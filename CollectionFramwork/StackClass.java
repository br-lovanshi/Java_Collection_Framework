package CollectionFramwork;

import java.util.Stack;

public class StackClass {

    public static void main(String[] args) {
        Stack<String> st = new Stack<>();

        st.push("one");
        st.push("two");
        st.push("three");
        st.push("four");

        st.pop();
        st.peek();
        st.isEmpty();
        System.out.println(st);

        System.out.println(st.isEmpty());

        System.out.println(st.peek());
    }
}

