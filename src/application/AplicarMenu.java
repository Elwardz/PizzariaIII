package application;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

    public class AplicarMenu {

        private transient static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {
            titulo(); // Exibe o título "PIZZALOPES" no início
            int opcaoPizza = getRequest(1); // Escolher o tipo de pizza
            int opcaoTamanho = getRequest(2); // Escolher o tamanho da pizza
            int opcaoCondimento = getRequest(3); // Escolher os condimentos

            // Aqui você pode aplicar lógica adicional com base nas escolhas do usuário
            System.out.println("Pedido finalizado com sucesso na PIZZALOPES!");
        }

        // Obtém a solicitação do usuário
        public static int getRequest(int menuAtual) {
            List<String> opcoes = null;
            switch (menuAtual) {
                case 1:
                    // Menu para opções de pizzas
                    opcoes = Arrays.asList("Margarita", "Pepperoni", "Frango com Catupiry", "Quatro Queijos", "Finalizar Pedido");
                    break;
                case 2:
                    // Menu para escolha de tamanhos
                    opcoes = Arrays.asList("Pequena", "Média", "Grande", "Gigante", "Voltar ao menu anterior");
                    break;
                case 3:
                    // Menu para escolha de condimentos
                    opcoes = Arrays.asList("Bacon", "Queijo Extra", "Azeitona", "Cebola", "Sem Condimento", "Voltar ao menu anterior");
                    break;
                default:
                    // Lança uma exceção se a opção for inválida
                    throw new IllegalArgumentException("Opção inválida, tente novamente");
            }

            boolean entradaValida = false;
            int request = -1;
            short contador;

            do {
                contador = 1;
                for (String opcao : opcoes) {
                    // Exibe cada opção numerada no menu
                    System.out.printf("%d - %s\n", contador++, opcao);
                }
                try {
                    // Insere a solicitação de usuário
                    System.out.print("\n-> ");
                    String entrada = sc.nextLine().trim();
                    if (entrada.isEmpty()) {
                        throw new IllegalArgumentException("Valor nulo lançado");
                    }
                    request = Integer.parseInt(entrada);
                    clearScreen();
                    if (request < 1 || request > opcoes.size()) {
                        System.out.println("Valor fora dos parâmetros, digite entre 1 e " + opcoes.size());
                    } else {
                        entradaValida = true;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida, por favor insira um número. Digite enter para tentar novamente.");
                    sc.nextLine();
                } catch (IllegalArgumentException e) {
                    System.err.printf("Entrada inválida, %s, digite enter para tentar novamente.\n", e.getMessage());
                    sc.nextLine();
                }
            } while (!entradaValida || (request < 1) || (request > opcoes.size()));

            clearScreen();
            return request; // Retorna a opção escolhida pelo usuário
        }

        public static void clearScreen() {
            for (int i = 0; i < 50; ++i) System.out.println();
        }

        // Exibe o título personalizado "PIZZALOPES"
        public static void titulo() {
            System.out.println("     ____  ____  ______   _____   ____  ______   _____  ______  ______  ______ \r\n"
                    + "    / __ \\/ __ \\/_  __/  /  __/  / __ \\/_  __/  /  __/ /_  __/ /  __  / /  __  \r\n"
                    + "   / /_/ / / / / / /    / /     / /_/ / / /    / /      / /   / /_/ /_/ /_/ / \r\n"
                    + "  / ____/ /_/ / / /    / /___  / ____/ / /    / /___   / /   / ____/_  ____/ \r\n"
                    + " /_/   /_____/ /_/     \\____/ /_/     /_/     \\____/  /_/   /_/     /_/     \n");
            System.out.println("---------------------------------------------------------------------------");
        }

    }
