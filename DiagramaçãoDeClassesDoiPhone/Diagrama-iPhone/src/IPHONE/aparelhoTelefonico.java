package IPHONE;
import java.util.Scanner;

class AparelhoTelefonico extends iPhone { // Herança da classe iPhone

    Scanner scanner = new Scanner(System.in); // Criando um objeto Scanner

    

    void Atender() {
        System.out.println("Atendendo chamada...");
    }

    void IniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    public static void main(String[] args) {
        AparelhoTelefonico meuAparelho = new AparelhoTelefonico();

        int opcao;

        do {
            mostrarMenu();
            System.out.print("Digite a opção desejada: ");
            opcao = meuAparelho.scanner.nextInt();
            meuAparelho.scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Digite o número para ligar: ");
                    String numero = meuAparelho.scanner.nextLine();
                    meuAparelho.FazerLigação(numero); // Chamando o método herdado
                    break;
                case 2:
                    meuAparelho.Atender();
                    break;
                case 3:
                    meuAparelho.IniciarCorreioDeVoz();
                    break;
                case 0:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        meuAparelho.scanner.close();
    }

    static void mostrarMenu() {
        System.out.println("Menu do Aparelho Telefônico:");
        System.out.println("1. Fazer Ligação");
        System.out.println("2. Atender");
        System.out.println("3. Iniciar Correio de Voz");
        System.out.println("0. Sair");
    }

    }
    

