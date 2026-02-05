package prova;

public class prova1 {

    /*
    Questão 1: Correção de Erros;
    O código abaixo apresenta erros de compilação. Identifique os erros e reescreva o método para que
    ele retorne a média de dois números inteiros como um número decimal (double). 
    
    public int calcularMedia(int n1, int n2) {
        int media = (n1 + n2) / 2;
        return "A média é: " + media;
    }
     */
    
    // resposta

    public double calcularMedia(double n1, double n2) {
        double media = (n1 + n2) / 2;
        return media;
    }
    public static void main(String[] args) {
        double n1 = 10.0;
        double n2 = 9.0;
        prova1 p = new prova1();
        double resul = p.calcularMedia(n1, n2);
        System.out.println("A média é: " + resul);
    }

}
