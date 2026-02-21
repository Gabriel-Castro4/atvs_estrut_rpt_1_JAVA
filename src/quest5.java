import java.util.Scanner;

public class quest5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int soma = 0;

        System.out.println("Digite o total de pessoas: ");
        int numPessoas = scan.nextInt();

        int i;
        for (i = 1; i <= numPessoas; i++)
        {
            System.out.println(i + "- Insira sua idade: ");
            int idade = scan.nextInt();
            soma = soma + idade;
            System.out.println(soma);

        }
        System.out.println("Soma das idades: " + soma);
        double mediaIdade = (double) soma / numPessoas;
        System.out.printf("A média de idada é: %.2f%n", mediaIdade);
    }
}
