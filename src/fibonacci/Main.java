package fibonacci;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		int[] fibonacci = {0, 1, 2, 3, 5, 8, 13}; // Fibonacci removendo os repetidos para verificação
		System.out.println("Digite um número: ");
		number = sc.nextInt();
		int fib = fibonacci(number);
		
		System.out.println("Fibonacci de " + number + " = " + fib);
		
		for(int i = 0; i < fibonacci.length; i++) {
			if(fib == fibonacci[i]) {
				System.out.println("Para o Fibonacci de até 7, o valor está na sequência");
			}
		}
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
