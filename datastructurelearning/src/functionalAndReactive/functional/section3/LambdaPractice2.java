package functionalAndReactive.functional.section3;


import functionalAndReactive.functional.section2.MathOperation;

public class LambdaPractice2 {

	public static void main(String[] args) {
		
		MathOperation add = (a, b) -> System.out.println(a+b);
		add.operation(10, 20);
		
		MathOperation multiply = ( a, b) -> System.out.println( a * b);
		multiply.operation(10, 90);

	}

}
