
import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade = sc.nextInt();
		if (idade >= 18) {
			System.out.println("maior de idade");
		} else {
			System.out.println("menor de idade");
		}

	}

}