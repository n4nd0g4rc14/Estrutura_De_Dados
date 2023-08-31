import java.util.Scanner;

class Aritmetica {
    public int somaAlgarismos(int num, int soma) {
        if (num < 1) {
            return soma;
        }
        soma += num % 10;
        return somaAlgarismos(num / 10, soma);
    }

    public int pot(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * pot(x, n - 1);
    }

    public void inverteArray(double[] v, int esq, int dir) {
        if (esq >= dir) {
            return;
        }
        double temp = v[esq];
        v[esq] = v[dir];
        v[dir] = temp;
        inverteArray(v, esq + 1, dir - 1);
    }

    public void mostrarArray(double[] v) {
        for (double valor : v) {
            System.out.print(valor + ", ");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Aritmetica ari = new Aritmetica();
        Scanner leitor = new Scanner(System.in);

        // int valor = leitor.nextInt();
        // int potencia = leitor.nextInt();
        // int resultado = ari.somaAlgarismos(3338, 0);
        // int resultado = ari.somaAlgarismos(valor, 0);
        // int resultado = ari.pot(valor, potencia);
        // System.out.println(resultado);

        double[] vet = {1.2, 4.2, 5.7, 8.9, 4.5};

        ari.mostrarArray(vet);
        ari.inverteArray(vet, 0, vet.length - 1);
        System.out.println();
        ari.mostrarArray(vet);
    }
}
