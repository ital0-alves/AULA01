package parte01;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//este comentario é em uma linha
		/*este é
		 * um comentario
		 * em varias linhas
		 */
		//comando saida 
		System.out.println("hello\nworld");
		System.out.println("italo\talves");
		System.out.println(15);
		System.out.print("");
		//Variaveis e constantes
		
		byte idade = 22;
		System.out.println("A idade do aluno é: "+idade+" anos");
		//print formatado o \n é para pular uma linha 
		System.out.printf("a idade do aluno é de: %d anos\n",idade);
		short matricula = 2058;
		System.out.println(matricula);
		int dinheiro = 5;
		System.out.println(dinheiro);
		long saldo = 51234567;
		System.out.println(saldo);
		float sentavos = 2.59f;
		System.out.println(sentavos);
		double valorquebrado = 5.69;
		System.out.println(valorquebrado);
		char letra = 'd';
		System.out.println(letra);
		String texto = "senac reference";
		System.out.println(texto);
		//booleanos
		boolean opcao = true;
		System.out.println(opcao);
		//operações matematica : somar -> + subtrair -> - multiplicar -> *
		// dividir -> / 
		int soma = 30+20;
     	System.out.println(soma);
		int sub = 50-20;
     	System.out.println(sub);
     	int mult = 50*3;
     	System.out.println(mult);
     	int div = 50/2;
     	System.out.println(div);
		int num1 = 20;
		int num2 = 30;
		int adicao = num1+num2;
		System.out.println(adicao);
	//Danzin mongol
		Scanner input = new Scanner(System.in);
		System.out.println("digite um numero:");
		int number = input.nextInt();
		System.out.println(number);
		Scanner frase = new Scanner (System.in);
		System.out.println("digite sua escola");
	    String escola = frase.nextLine();
	    System.out.printf("você estuda no %s", escola);
	}
	

}




