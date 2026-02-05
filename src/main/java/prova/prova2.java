package prova;

public class prova2 {
    /*
    Questão 2: Estrutura de Decisão
    Crie um método chamado verificarNota. Ele deve receber um double como parâmetro.
    Se a nota for maior ou igual a 7, retorne a String "Aprovado".
    Se a nota for entre 5 (inclusive) e 7, retorne "Recuperação".
    Se for menor que 5, retorne "Reprovado".

    resposta:
    */

    public double verificarNota(double a, double b){
        double resultado = (a+b)/2;
        return resultado;
    }

    public static void main (String[] args){
        prova2 p = new prova2();
        double nota1 = 4.0;
        double nota2 = 9.0;

        String a = (p.verificarNota(nota1,nota2) >= 7.0)? "Aprovado":
        ( p.verificarNota(nota1, nota2)>=5)?"Recuperação":"Reprovado";

        System.out.println("Resultado:" + a);
    }
}
