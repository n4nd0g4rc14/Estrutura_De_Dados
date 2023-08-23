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

   public void inverteArray(double[] v, int esq, int dir);{
        if (esq >= dir) {
            return;
        }
        double temp = v[esq];
        v[esq] = v[dir];
        v[dir] = temp;
        inverteArray(v, (esq+1), (dir-1));
   }
   public void toString(double[] v){
    for(int i = 0; i < v.length; i++)
        System.out.print(v[i] + ", ")
   }
}

public class Main
{
	public static void main(String[] args) {
		Aritmetica ari = new Aritmetica();
		Scanner leitor = new Scanner(System.in);
		//int valor = leitor.nextInt();
		//int potencia = leitor.nextInt();
		//int resultado = ari.somaAlgarismos(3338, 0);
		//int resultado = ari.somaAlgarismos(valor, 0);
		//int resultado = ari.pot(valor, potencia);
		//System.out.println(resultado);
        double[] vetim = new double[5];
        vetim[0] = 1.2;
        vetim[1] = 4.2;
        vetim[2] = 5.7;
        vetim[3] = 8.9;
        vetim[4] = 4.5;

        ari.toString(vetim);
        ari.inverteArray(vetim, 0, (vetim.length-1));
        System.out.println();
        ari.toString(vetim);
	}
}