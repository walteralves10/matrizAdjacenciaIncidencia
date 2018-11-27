
import java.util.Scanner;

public class Main {

    public static void menu() {
        boolean saida = true;
        while (saida) {

            Scanner leia = new Scanner(System.in);
            String printa = "DIGITE O TIPO DA MATRIZ: \n"
                    + "1 - MATRIZ ADJACENTE\n"
                    + "2 - MATRIZ INCIDENCIA\n"
                    + "OU \n0 - PARA SAIR :";
            System.out.println(printa);
            int auxMatriz = leia.nextInt();
            switch (auxMatriz) {
                case 1:
                    Matrizes.adjacencia();
                    break;
                case 2:
                    Matrizes.incidencia();
                    break;
                case 0:
                    saida = false;
                    break;
                default:
            }
        }
    }

    public static void main(String[] args) {
        menu();
    }

}
