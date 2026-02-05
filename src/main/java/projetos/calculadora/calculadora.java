package projetos.calculadora;

import java.util.Scanner;

public class calculadora {

    // Métodos de operações matemáticas
    static int soma(int a, int b) {
        return a + b;
    }

    static int subtracao(int a, int b) {
        return a - b;
    }

    static int divisao(int a, int b) {
        return a / b;
    }

    static int multiplicacao(int a, int b) {
        return a * b;
    }

    static int resto(int a, int b) {
        return a % b;
    }

    // Método para listar os comandos disponíveis
    static String listaDeComandos() {
        return "Lista de comando\n1 - Soma\n2 - Subtração\n3 - Divisão\n4 - Multiplicação\n5 - Resto";
    }

    static String escolhaDeOperação(int numero1, int numero2, int operação) {
        switch (operação) {
            case 1:
                return "Soma\nResultado:" + soma(numero1, numero2);
            case 2:
                return "Subtração\nResultado:" + subtracao(numero1, numero2);
            case 3:
                return "Divisão\nResultado:" + divisao(numero1, numero2);
            case 4:
                return "Multiplicação\nResultado:" + multiplicacao(numero1, numero2);
            case 5:
                return "Resto\nResultado:" + resto(numero1, numero2);
            default:
                return "Operação inválida";
        }
    }

    // Método principal
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1 = 20;
        int numero2 = 4;

        System.out.println(listaDeComandos());
        int formadeoperação = sc.nextInt();

        System.out.println(escolhaDeOperação(numero1, numero2, formadeoperação));
    }
}
