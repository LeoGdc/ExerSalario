import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		double ano, V;
		String name;

		System.out.println("Qual seu o nome do vendedor?");
		name = leitor.next();

		System.out.println(
				"Quantos o vendedor tem de contribuição?");
		ano = leitor.nextDouble();

		System.out.println("Qual o valor total de vendas ele fez?");
		V = leitor.nextDouble();

		System.out.println("Parabens " + name);

		if (ano >= 1) {
			if (V >= 20000) {
				System.out.println("sua comissão é de " + V * 10 / 100);
			} else {
				System.out.println("sua comissão é de " + V * 5 / 100);
			}

		} else {
			System.out.println("sua comissão é " + V * 3 / 100);
		}

		leitor.close();

	}

}
