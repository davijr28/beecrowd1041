import java.util.Scanner;

public class Beecrowd1041 {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner leitor = new Scanner(System.in);
        //declarar variáveis
        float x, y;
        String sequencia;
        String[] partes;

        //ler a sequência
        sequencia = leitor.nextLine();
        partes = sequencia.split(" ");

        //atribuir valores às variáveis
        x = Float.parseFloat(partes[0]);
        y = Float.parseFloat(partes[1]);

        //verificar os valores e mostrar resultado no console
        if (x > 0) {
            if (y > 0) {
                System.out.println("Q1");
            } else if (y < 0) {
                System.out.println("Q4");
            } else {
                System.out.println("Eixo X");
            }
        } else if (x < 0) {
            if (y > 0) {
                System.out.println("Q2");
            } else if (y < 0) {
                System.out.println("Q3");
            } else {
                System.out.println("Eixo X");
            }
        } else {
            if (y == 0) {
                System.out.println("Origem");
            } else {
                System.out.println("Eixo Y");
            }
        }
    }
}
