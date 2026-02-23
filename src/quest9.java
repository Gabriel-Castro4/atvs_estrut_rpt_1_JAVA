import java.util.Scanner;

public class quest9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int login = 1;;login++){
            System.out.println("Digite seu nome: ");
            String nomeUser = scan.next();
            System.out.println("Digite sua senha: ");
            String senhaUser = scan.next();

            if (nomeUser.equalsIgnoreCase(senhaUser)){
                System.out.println("Sua senha não pode ser o seu nome de usuário");
            }else{
                System.out.println("Login realizado com sucesso");
                break;
            }
        }
    }
}
