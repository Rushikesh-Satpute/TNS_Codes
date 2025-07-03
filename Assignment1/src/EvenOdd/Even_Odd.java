package EvenOdd;

public class Even_Odd {

	public static void main(String[] args) {
		int[] numbers = {10,12,18,15,64,68,45};
		// TODO Auto-generated method stub
		
		for (int i = 0; i < numbers.length; i++) {
		if (numbers[i] % 2 == 0) {
			System.out.println("Even Number...!");
		}
		else {
			System.out.println("Odd Number...!");
		}
	}

	}

}
