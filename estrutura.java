import java.util.Arrays;
import java.util.Scanner;

public class OrdenaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        // Entrada de dados
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Ordenação
        Arrays.sort(numeros);

        // Exibição
        System.out.println("Números em ordem crescente:");
        for (int num : numeros) {
            System.out.println(num);
        }

        scanner.close();
    }
}

/*exercicio 2 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ProdutosPorPreco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto[] produtos = new Produto[10];

        // Entrada de dados
        for (int i = 0; i < produtos.length; i++) {
            System.out.print("Nome do produto " + (i + 1) + ": ");
            String nome = scanner.nextLine();

            System.out.print("Preço do produto " + (i + 1) + ": ");
            double preco = scanner.nextDouble();
            scanner.nextLine(); // limpar o buffer

            produtos[i] = new Produto(nome, preco);
        }

        // Ordenar por preço decrescente
        Arrays.sort(produtos, Comparator.comparingDouble(Produto::getPreco).reversed());

        // Exibir produtos ordenados
        System.out.println("\nProdutos do mais caro para o mais barato:");
        for (Produto p : produtos) {
            System.out.println("Produto: " + p.getNome() + " | Preço: R$" + p.getPreco());
        }

        scanner.close();
    }
}

// Classe auxiliar para armazenar produto e preço
class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
