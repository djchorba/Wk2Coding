
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//5.a A while loop that prints all even numbers from 0 to 100
		System.out.println("Q5.a");
		int i = 0;
		while (i<=100) {
			 System.out.println(i);
			 i=i+2;
		 }
		 System.out.println("-----");
		//5.b A while loop that prints every 3rd number going backwards from 100 until we reach 0
		System.out.println("Q5.b");
		int x = 100;
		while (x >=0) {
			System.out.println(x);
			x=x-3;
		}
		System.out.println("-----");
		//5.c A for loop that prints every other number from 1 to 100
		System.out.println("Q5.c");
		for (int w = 1; w <=100; w +=2) {
			System.out.println(w);
		}
		System.out.println("-----");
		//5.d A for loop that prints every number from 0 to 100, 
		//but if the number is divisible by 3, it prints “Hello” instead of the number, 
		//and if the number is divisible by 5, it prints “World” instead of the number, 
		//and if it is divisible by both 3 and 5, it prints “HelloWorld” instead of the number
		System.out.println("Q5.d");
		for (int d = 0; d <= 100; d++) {
			if (d%3 == 0 && d%5 == 0) {
				System.out.println("HelloWorld");
			}
			else if (d%5 == 0) {
				System.out.println("World");
			} 
			else if (d%3 == 0) {
				System.out.println("Hello");
			} 
			else {
				System.out.println(d);
			}
		}
		
		
	}

}
