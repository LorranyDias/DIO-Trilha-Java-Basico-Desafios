import java.util.Scanner;

class NavegadorInternet extends iPhone {

    Scanner scanner = new Scanner(System.in); // Criando um objeto Scanner

    void ExibirPagina(String url){
        System.out.println("Digite a url" + url);
        System.out.println("Abrindo Pagina");
    }

    void AdicionarNovaAba(){
        System.out.println("Abrindo nova Aba");

    }
    void AtualizarPagina(){
        System.out.println("Atualizando Página");

    }
    void FecharAba(String aba) { 
        System.out.println("Selecione a aba a ser fechada: " + aba);
        System.out.println("Fechando aba");

    
public static void main(String[] args) {
     
    NavegadorInternet meuNavegador = new NavegadorInternet();
    
        int opcao;
    
        do {
            mostrarMenu();
            System.out.print("Digite a opção desejada: ");
            opcao = meuNavegador.scanner.nextInt();
            meuNavegador.scanner.nextLine(); 
    
        switch (opcao) {
            case 1:
                System.out.print("Digite a URL: ");
                String url = meuNavegador.scanner.nextLine();
                meuNavegador.ExibirPagina(url); 
                break;
            case 2:
                meuNavegador.AdicionarNovaAba();
                break;
            case 3:
                meuNavegador.AtualizarPagina();
                break;
            case 4:
                System.out.print("Digite o nome da aba a ser fechada: ");
                String aba = meuNavegador.scanner.nextLine();
                meuNavegador.FecharAba(aba);
                break;
            case 0:
                System.out.println("Saindo do programa.");
                break;
                default:
                System.out.println("Opção inválida.");
                }
            } while (opcao != 0);
    
            meuNavegador.scanner.close();
        }
    
        static void mostrarMenu() {
            System.out.println("Menu do Navegador Internet:");
            System.out.println("1. Exibir Página");
            System.out.println("2. Adicionar Nova Aba");
            System.out.println("3. Atualizar Página");
            System.out.println("4. Fechar Aba");
            System.out.println("0. Sair");
        }

    }
}
