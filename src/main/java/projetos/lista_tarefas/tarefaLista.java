package projetos.lista_tarefas;

import java.util.Scanner;

// mano isso aqui não e dificil não pega a visão!!
public class tarefaLista {

    // aqui é onde a lista de tarefas é criada, e onde as tarefas são armazenadas
    static java.util.List<String> tarefa = new java.util.ArrayList<>();

    // aqui é onde a tarefa é adicionada à lista, e onde é exibida uma mensagem de confirmação para o usuário
    static void lista(String tarefaa) {
        tarefa.add(tarefaa);
    }

    // aqui é onde a tarefa é adicionada à lista, e onde é exibida uma mensagem de confirmação para o usuário
    static void adicionar(String tarefa) {
        System.out.println("Tarefa adicionada: " + tarefa);
        lista(tarefa);
    }

    // aqui é onde a tarefa é removida da lista, e onde é exibida uma mensagem de confirmação para o usuário
    static void remover(String tarefaRemover) {
        for (String lista : tarefa) {
            if (tarefaRemover.equals(lista)) {
                tarefa.remove(lista);
                System.out.println("Tarefa removida: " + lista);
            }
        }
    }

    // aqui é onde a tela de opções é exibida para o usuário escolher o que deseja fazer, e onde as opções são tratadas para adicionar, exibir ou remover tarefas da lista
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

            case 3:
                System.out.println("Digite a tarefa que deseja remover:");
                scanner.nextLine();
                String tarefaRemover = scanner.nextLine();

                for (String t : tarefa) {
                    if (tarefaRemover.equals(t)) {
                        remover(tarefaRemover);
                    } else {
                        System.out.println("Tarefa não encontrada: " + tarefaRemover);
                    }
                }
                break;

            default:
                System.err.println("Opção inválida. Por favor, escolha uma opção válida.");
                break;
        }
    }

    // aqui é o main, onde o programa começa a ser executado e onde a tela de opções é exibida para o usuário escolher o que deseja fazer
    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Adicionar tarefa\n2. Exibir tarefas\n3. Remover tarefa:");
            exibirTela();

        }
    }
}
