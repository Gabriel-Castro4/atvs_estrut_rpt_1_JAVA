import java.util.Scanner;

public class quest8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número entre 0 e 20: ");
        int n1 = scan.nextInt();
        System.out.println("Digite outro número entre 0 e 20: ");
        int n2 = scan.nextInt();

        if(n1 > 20 || n2 > 20 || n1 < 0 || n2 < 0){
            System.out.println("Você só pode escolher números entre 0 e 20");
        }
        else if (n1 < n2){
            for (;n1 < n2; n1++){
                System.out.println(n1);
            }
        }else if (n2 < n1){
            for (; n2 < n1; n2++){
                System.out.println(n2);
            }
        }

        System.out.println("==============");
        System.out.println("Agora utilizando o while:  ");

        System.out.println("Digite um número entre 0 e 20: ");
        int num1 = scan.nextInt();
        System.out.println("Digite outro número entre 0 e 20: ");
        int num2 = scan.nextInt();

        if(num1 > 20 || num2 > 20 || num1 < 0 || num2 < 0){
            System.out.println("Você só pode escolher números entre 0 e 20");
        }
        else if (num1 < num2)
        {
            while (num1 < num2){
                System.out.println(num1);
                num1++;
            }
        }else {
            while (num2 < num1){
                System.out.println(num2);
                num2++;
        }
    }
    }
}
