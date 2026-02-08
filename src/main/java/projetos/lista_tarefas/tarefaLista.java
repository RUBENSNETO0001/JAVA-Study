package projetos.lista_tarefas;

import java.util.Scanner;

public class tarefaLista {

    static java.util.List<String> tarefa = new java.util.ArrayList<>();

    static void lista(String tarefaa) {
        tarefa.add(tarefaa);
    }

    static void adicionar(String tarefa) {
        System.out.println("Tarefa adicionada: " + tarefa);
        lista(tarefa);
    }

    static void exibirTela() {
        Scanner scanner = new Scanner(System.in);

        int opcao = scanner.nextInt();

        switch (opcao) {

            case 1:
                System.out.println("Digite a tarefa que deseja adicionar:");
                scanner.nextLine();
                String nome = scanner.nextLine();

                if (!nome.isEmpty()) {
                    adicionar(nome);
                }
                break;
            case 2:
                System.out.println("Tarefas na lista:");
                for (String t : tarefa) {
                    System.out.println("Tarefa: " + t);
                }

                break;
        }
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Adicionar tarefa/n2. Exibir tarefas");
            exibirTela();

        }
    }
}