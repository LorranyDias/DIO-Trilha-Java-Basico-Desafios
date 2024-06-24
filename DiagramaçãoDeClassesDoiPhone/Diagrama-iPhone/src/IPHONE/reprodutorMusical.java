package IPHONE;
import java.util.Scanner;

class ReprodutorMusical extends iPhone {

    Scanner scanner = new Scanner(System.in);

    void Tocar() {
        System.out.println("Tocando música...");
    }

    void Pausar() {
        System.out.println("Pausando música...");
    }

    void SelecionarMusica(String nomeDaMusica) {
        System.out.println("Selecionando música: " + nomeDaMusica);
    }

    public static void main(String[] args) {
        ReprodutorMusical meuReprodutor = new ReprodutorMusical();

        int opcao;

        do {
            mostrarMenu();
            System.out.print("Digite a opção desejada: ");
            opcao = meuReprodutor.scanner.nextInt();
            meuReprodutor.scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    meuReprodutor.Tocar();
                    break;
                case 2:
                    meuReprodutor.Pausar();
                    break;
                case 3:
                    System.out.print("Digite o nome da música: ");
                    String nomeDaMusica = meuReprodutor.scanner.nextLine();
                    meuReprodutor.SelecionarMusica(nomeDaMusica);
                    break;
                case 0:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        meuReprodutor.scanner.close();
    }

    static void mostrarMenu() {
        System.out.println("Menu do Reprodutor Musical:");
        System.out.println("1. Tocar");
        System.out.println("2. Pausar");
        System.out.println("3. Selecionar Música");
        System.out.println("0. Sair");
    }
}