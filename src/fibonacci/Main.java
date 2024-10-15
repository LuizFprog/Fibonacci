package fibonacci;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.println("Digite um número: ");
		number = sc.nextInt();
		System.out.println("Fibonacci de " + number + " = " + fibonacci(number));
	}
	
	public static int fibonacci(int number) {
		if (number == 0) {
			return 0;
		} else if (number == 1) {
			return 1;
		} else {
			return fibonacci(number - 1) + fibonacci(number - 2);
		}
	}
}
