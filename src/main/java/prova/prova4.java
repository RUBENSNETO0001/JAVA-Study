package prova;

public class prova4 {
    /* 
    Questão 4: Lógica de Soma e Tipagem
    Crie um método chamado somarOuConcatenar. Ele deve receber dois inteiros.
    Se a soma dos dois for maior que 100, retorne o resultado como String precedido pelo texto "Soma alta: ".
    Caso contrário, retorne apenas o resultado da soma como String. (Dica: Para converter um int para String, use String.valueOf(numero)).

    Resposta:
     */
    public int somarOuConcatenar(int a, int b){
        int res = a + b;
        return res;
    }
    public String verificadorSoma(int a){
        String res = (a >= 100)? "Soma Alta: "+ String.valueOf(a) : "Soma baixa: "+ String.valueOf(a);
        return res;
    }
    public static void main(String[] args) {
        prova4 p = new prova4();

        int numero1 = 20;
        int numero2 = 60;

        int resultado = p.somarOuConcatenar(numero1, numero2);
        System.out.println(p.verificadorSoma(resultado));
    }
}
