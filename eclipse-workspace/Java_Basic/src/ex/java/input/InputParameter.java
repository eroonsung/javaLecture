package ex.java.input;

public class InputParameter {
	public static void main(String[] args) {
		//java -cp . ex.java.input.InputParameter 100 200 300
		
		System.out.println("Length: "+ args.length); //length: 3
		
		System.out.println(args[0]); // 100
		System.out.println(args[1]); // 200
		System.out.println(args[2]); // 300
		
		System.out.println(args[0] instanceof String); // true
		System.out.println(args[1] instanceof String); // true
		System.out.println(args[2] instanceof String); // true
		
		// 숫자화 해주기
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		
		System.out.println(a + b + c); // 600
 	}
}
