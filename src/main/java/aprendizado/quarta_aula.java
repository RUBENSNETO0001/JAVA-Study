package aprendizado;

public class quarta_aula {

    // Métodos em Java
    // Um método é um bloco de código que realiza uma tarefa específica. Ele pode receber parâmetros, executar ações e retornar um valor.
    static void pessoa(String nome, int idade) {
        System.out.println(nome + " tem " + idade + " anos.");
    }

    static float cmd(float a, float b) {
        return a / (b * b);
    }
    
    // Um método pode ser chamado a partir de outro método, como o método main, que é o ponto de entrada do programa.
    static void nomeAnime() {
        String[] nomeanime = {"Naruto", "Goku", "Luffy", "Midoria", "Eren"};
        for (String nome : nomeanime) {
            System.out.println("nome:" + nome);
        }

    }

    // Para chamar um método, basta usar seu nome seguido de parênteses e passar os argumentos necessários.
    public static void main(String[] args) {
        quarta_aula q = new quarta_aula();
        pessoa("Renato", 23);

        System.out.println("Cmd" + cmd(1.50f, 80.2f));
        nomeAnime();
    }
}
