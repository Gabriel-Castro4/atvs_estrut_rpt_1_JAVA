import java.util.Scanner;

public class quest10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int soma = 0;
        int i;
        for (i = 1; i <= 5; i++)
        {
            System.out.println(i + "- Insira um número: ");
            int idade = scan.nextInt();
            soma = soma + idade;
            System.out.println(soma);

        }
        System.out.println("Soma das idades: " + soma);
        double mediaIdade = (double) soma / 5;
        System.out.printf("A média de idada é: %.2f%n", mediaIdade);

    }
}
