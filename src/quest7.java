import java.util.Scanner;

public class quest7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i;
        int contadorPar = 0;
        int contadorImpar = 0;

        for (i = 1; i <= 10; i++){
            System.out.println(i + "- Insira um número inteiro: ");
            int userNum = scan.nextInt();

            if (userNum % 2 == 0){
                System.out.println(userNum + " É par");
                contadorPar++;
            }else {
                System.out.println(userNum + " É ímpar");
                contadorImpar++;
            }
        }
        System.out.println("A quantidade de número pares são: " + contadorPar);
        System.out.println("A quantidade de número ímpares são: " + contadorImpar);
    }
}
