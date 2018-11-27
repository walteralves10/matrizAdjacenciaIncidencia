
import java.util.Scanner;


public class Main {

    public static void menu(){
        Scanner leia = new Scanner(System.in);
        String printa = "DIGITE O TIPO DA MATRIZ: \n" 
                + "1 - MATRIZ ADJACENTE\n"
                + "2 - MATRIZ INCIDENCIA";
        System.out.println(printa);
        int auxMatriz = leia.nextInt();
        switch (auxMatriz){
            case 1:
                Matrizes.adjacencia();
                break;
            case 2:
                Matrizes.incidencia();
                break;
            default:
        }
            
    }
    
    public static void main(String[] args) {
        menu();
    }

}
