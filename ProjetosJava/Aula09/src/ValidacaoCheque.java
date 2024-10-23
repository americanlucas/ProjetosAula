import java.util.Scanner;

public class ValidacaoCheque {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tamanhoLote = 0;
		double valorLote = 0;
		int qtdCheque = 0;
		double somaValorCheque = 0;
		String opcao = "s";
		
		System.out.println("Digite o tamanho do lote: ");
		tamanhoLote = sc.nextInt();
		System.out.println("Digite o valor do lote: ");
		valorLote = sc.nextDouble();
				
		while (opcao.equalsIgnoreCase("s")){
			System.out.println("Qual o valor do cheque? ");
			somaValorCheque += sc.nextDouble();
			qtdCheque++;
			System.out.println("Tem mais cheque? <S> ou <N>");
			opcao = sc.next();
		}
		sc.close();
		if (qtdCheque == tamanhoLote && somaValorCheque == valorLote) {
			System.out.println("A quantidade e valores estão válidos");
		} else System.out.println("A quantidade ou valores estão inválidos");
	}
}
