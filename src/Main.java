public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayStack<Integer> stack = new ArrayStack<>();
        for (int i =0;i<5; i++){
            stack.push(i);
            System.out.println(stack);
        }
        for (int i =0;i<5; i++){
            stack.pop();
            System.out.println(stack);
        }
        System.out.println(new Solution().isValid("((())){{55533}}[[]]"));
        System.out.println(new Solution().isValid("({{}}asdf<asd>[[]])"));
    }
}
