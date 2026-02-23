import java.util.Scanner;

public class quest11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número entre 1 e 9 que você deseja saber a tabuada: ");
        int tabuada = scan.nextInt();

        if (tabuada > 9 || tabuada < 0){
            System.out.println("Você só pode digitar um número entre 1 e 9");
        }else{
            for (int i = 0; i <= 10; i++){
                System.out.println(tabuada * i);
            }
        }
    }
}
