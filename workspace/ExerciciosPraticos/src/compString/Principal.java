package compString;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = new String("Whatever!");
		String y = new String ();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com uma frase, e tente acertar a que eu estou pensando!");
		y = scan.nextLine();
		
		do{
			if (!x.equals(y)){
				System.out.println("As frases s�o diferentes! Better luck next time!");
				System.out.println("Entre com outra frase, vai que voc� acerta");
				y = scan.nextLine();
			}else if (x.equals(y)){	
				System.out.println("Grande! Voc� � bom nisso!");
			}	
		}while (!x.equals(y));
	}	
}
