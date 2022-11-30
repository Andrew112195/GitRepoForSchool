
public class testLinkedStack {

	public static void main(String[] args) {
		MyLinkedStack test = new MyLinkedStack();
		
		for(int i = 0; i <= 10; i++) {
			test.push(i);
			System.out.println(test.peek());
		}
		for(int i = 0; i <= 10; i++) {
			test.pop();
			System.out.println(test.toString());
			
		}
		test.push(4);
		System.out.println(test.toString());
	}

}
