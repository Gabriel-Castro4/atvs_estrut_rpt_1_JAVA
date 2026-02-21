import java.util.Scanner;

public class quest4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int perguntas = 1;;perguntas++){
            System.out.println("Digite uma palavra: ");
            String resposta = scan.next();

            if(resposta.equalsIgnoreCase("Sim"))
            {
                System.out.println("Você decidiu continuar");
            }
            else if (resposta.equalsIgnoreCase("Nao")
                    || resposta.equalsIgnoreCase("não"))
            {
                System.out.println("Você decidiu encerrar");
                break;
            }
            else
            {
                System.out.println("Palavra inválida");
            }
        }

    }

}
