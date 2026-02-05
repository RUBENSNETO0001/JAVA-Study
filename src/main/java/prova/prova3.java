package prova;

public class prova3 {

    /*
    Questão 3: Switch Case de Calendário:

    Escreva um método chamado getTrimestre que recebe um int representando o mês (1 a 12). Use um switch para retornar:
    "1º Trimestre" para os meses 1, 2 e 3.
    "Outro período" para os demais meses.
    "Mês inválido" caso o número não esteja entre 1 e 12.

    Resposta
     */
    public int getTrimestre(int mes) {
        int a = (mes >= 10) ? 4 : (mes >= 7) ? 3 : (mes >= 4) ? 2 : (mes >= 1) ? 1 : 0;
        return a;
    }

    public String validaMes(int a) {
        switch (a) {
            case 1:
                return "Resultado: 1º Trimestre.";
            case 2:
                return "Resultado: 2º Trimestre.";
            case 3:
                return "Resultado: 3º Trimestre.";
            case 4:
                return "Resultado: 4º Trimestre.";
            default:
                return "Resultado: Mês inválido";
        }
    }

    public static void main(String[] args) {
        prova3 p = new prova3();

        int mes = 5;
        int res = p.getTrimestre(mes);
        System.out.println(p.validaMes(res));
    }
}
