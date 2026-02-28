import java.util.Scanner;

public class quest16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double saltoMaior = 0;
        double saltoMenor = 0;
        double mediaSaltos = 0;

        System.out.println("Digite as distâncias do salto do viado: ");

        for (int i = 1; i <= 5; i++){
            double saltos = scan.nextDouble();
            mediaSaltos += saltos;

            if (i == 1){
                saltoMaior = saltos;
                saltoMenor = saltos;
            } else if (saltos > saltoMaior) {
                saltoMaior = saltos;
            } else if (saltos < saltoMenor) {
                saltoMenor = saltos;
            }
        }
        System.out.printf("A média dos saltos é: %.2f\n", mediaSaltos / 5);
        System.out.printf("O maior salto foi: %.2f\n", saltoMaior);
        System.out.printf("O menor salto foi: %.2f\n", saltoMenor);
    }
}
