
import java.util.Scanner;

public class Matrizes {

    private int vertices;
    private int arestas;

    public static void adjacencia() {
        Scanner leia = new Scanner(System.in);
        Matrizes m = new Matrizes();

        escreve(m);

        System.out.println("vertices: " + m.getVertices()
                + "   aresta: " + m.getArestas());

        int mat[][] = new int[m.getVertices()][m.getArestas()];
        
        System.out.println("MATRIZ DE ADJACENCIA");
        for (int i = 0; i < m.getVertices(); i++) {
            for (int j = 0; j < m.getArestas(); j++) {
                System.out.print("[" + i + "]" + "[" + j + "]");
                mat[i][j] = leia.nextInt();
            }
            System.out.println("\n");
        }
        
        
    }

    public static void incidencia() {
        Scanner leia = new Scanner(System.in);
        Matrizes m = new Matrizes();

        escreve(m);

        System.out.println("vertices: " + m.getVertices()
                + "   aresta: " + m.getArestas());

        int mat[][] = new int[m.getVertices()][m.getArestas()];

        for (int i = 0; i < m.getVertices(); i++) {
            for (int j = 0; j < m.getArestas(); j++) {
                System.out.print("[" + i + "]" + "[" + j + "]");
                mat[i][j] = leia.nextInt();
            }
            System.out.println("\n");
        }
    }

    private static void escreve(Matrizes m) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a qtde de vertices");
        m.setVertices(leia.nextInt());

        System.out.println("Digite a qtde de arestas");
        m.setArestas(leia.nextInt());
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
