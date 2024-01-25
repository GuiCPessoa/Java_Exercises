import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int senha_correta = 2002;
		int senha = sc.nextInt();

		while (senha != senha_correta) {
			System.out.println("Senha Invalida");
			senha = sc.nextInt();
		}

		System.out.println("Acesso permitido");
		sc.close();

	}

}
