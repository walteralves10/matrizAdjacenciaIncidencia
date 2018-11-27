
import java.util.Scanner;

public class Matrizes {

    private int vertices;
    private int arestas;

    public static void adjacencia() {
        Scanner leia = new Scanner(System.in);
        Matrizes m = new Matrizes();

        escreve(m);

        int mat[][] = new int[m.getVertices()][m.getArestas()];

        System.out.println("MATRIZ DE ADJACENCIA");

        for (int i = 0; i < m.getVertices(); i++) {
            for (int j = 0; j < m.getArestas(); j++) {
                int aux1 = i, aux2 = j;
                System.out.print("[" + (aux1 += 1) + "]" + "[" + (aux2 += 1) + "]");
                mat[i][j] = leia.nextInt();
            }
            System.out.println("\n");
        }

        System.out.println("MATRIZ DE ADJACENCIA FINAL");
        imprimi(mat, m);

    }

    public static void incidencia() {
        Scanner leia = new Scanner(System.in);
        Matrizes m = new Matrizes();

        escreve(m);

        int mat[][] = new int[m.getVertices()][m.getArestas()];

        System.out.println("MATRIZ DE INCIDENCIA");
        for (int i = 0; i < m.getArestas(); i++) {
            for (int j = 0; j < m.getVertices(); j++) {
                int aux1 = j, aux2 = i;
                System.out.print("[" + (aux1 += 1) + "]" + "[E" + (aux2 += 1) + "]");
                mat[j][i] = leia.nextInt();
            }
            System.out.println("\n");
        }

        System.out.println("MATRIZ DE INCIDENCIA FINAL");
        imprimi(mat, m);
    }

    private static void imprimi(int mat[][], Matrizes m) {
        for (int i = 0; i < m.getVertices(); i++) {
            for (int j = 0; j < m.getArestas(); j++) {
                System.out.print(
                        "| " + mat[i][j] + " |");
            }
            System.out.println("\t");
        }
        System.out.println("\n\n");
    }

    private static void escreve(Matrizes m) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a qtde de vertices");
        m.setVertices(leia.nextInt());

        System.out.println("Digite a qtde de arestas");
        m.setArestas(leia.nextInt());

        System.out.println("vertices: " + m.getVertices()
                + "   aresta: " + m.getArestas());
    }

    public int getVertices() {
        return vertices;
    }

    public void setVertices(int vertices) {
        this.vertices = vertices;
    }

    public int getArestas() {
        return arestas;
    }

    public void setArestas(int arestas) {
        this.arestas = arestas;
    }
}
