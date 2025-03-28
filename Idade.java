
import java.util.Scanner;

public class Idade {

    public static void main(String[] args) {
        Scanner scannerjr = new Scanner(System.in);
        // Variáveis para contar as idades em cada grupo
        int sub7 = 0, sub8 = 0, sub9 = 0, sub11 = 0, sub13 = 0, sub15 = 0, sub17 = 0, sub20 = 0;
        // Loop para ler as idades 
        for (int i = 1; i <= 20; i++) {
            System.out.printf("Informe a idade da pessoa %d: ", i);
            int idade = scannerjr.nextInt();
// Verifica se a idade é válida (entre 6 e 20 anos)
            if (idade == 6 || idade == 7) {
                sub7++;
            } else if (idade == 8) {  // Separei a idade 8 do Sub-9 e coloquei apenas o 8 no sub8
                sub8++;
            } else if (idade == 9) {
                sub9++;
            } else if (idade == 10 || idade == 11) {
                sub11++;
            } else if (idade == 12 || idade == 13) {
                sub13++;
            } else if (idade == 14 || idade == 15) {
                sub15++;
            } else if (idade == 16 || idade == 17) {
                sub17++;
            } else if (idade >= 18 && idade <= 20) {
                sub20++;
            }
        }
// Exibe os resultados
        System.out.println("Grupos de idades:");
        System.out.println("Sub-7: " + sub7);
        System.out.println("Sub-8: " + sub8);
        System.out.println("Sub-9: " + sub9);
        System.out.println("Sub-11: " + sub11);
        System.out.println("Sub-13: " + sub13);
        System.out.println("Sub-15: " + sub15);
        System.out.println("Sub-17: " + sub17);
        System.out.println("Sub-20: " + sub20);

        scannerjr.close();
    }
}
