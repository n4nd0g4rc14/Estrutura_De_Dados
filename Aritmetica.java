//QUESTÃO 01, 02, 03

import java.util.Scanner;

class Aritmetica {
    public int somaAlgarismos(int num, int soma){
        if(num<1){
            return soma;
        }
        soma+=num%10;
        return somaAlgarismos((num/10), soma);
    }
    
    public int pot(int x, int n){
        if(n == 0) {
            return 1;
        }
        return x * pot(x, (n-1));
    }
}

public class Main
{
	public static void main(String[] args) {
		Aritmetica ari = new Aritmetica();
		Scanner leitor = new Scanner(System.in);
		int valor = leitor.nextInt();
		int potencia = leitor.nextInt();
		//int resultado = ari.somaAlgarismos(3338, 0);
		//int resultado = ari.somaAlgarismos(valor, 0);
		int resultado = ari.pot(valor, potencia);
		System.out.println(resultado);
	}
}