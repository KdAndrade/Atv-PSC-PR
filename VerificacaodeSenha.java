
import java.util.Scanner;

public class VerificacaodeSenha {

    public static void main(String[] args) {
        Scanner snh = new Scanner(System.in);
        String senhaCorreta = "123456";
        String senha = "";

        System.out.println("Digite a senha: ");
        senha = snh.nextLine();

        if (senha.equals(senhaCorreta)) {
            System.out.println("Senha correta!");
        } else {
            System.out.println("Senha incorreta!");
        }
        while (!senha.equals(senhaCorreta)) {
            System.out.println("Digite a senha: ");
            senha = snh.nextLine();

            if (senha.equals(senhaCorreta)) {
                System.out.println("Senha correta!");
            } else {
                System.out.println("Senha incorreta!");
            }
        }
        snh.close();
    }
}
