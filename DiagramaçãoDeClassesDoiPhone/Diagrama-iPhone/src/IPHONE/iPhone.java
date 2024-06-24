package IPHONE;
import java.util.Scanner;

public class iPhone {

    Scanner scanner = new Scanner(System.in); // Cria o Scanner

    // ... (seus métodos) ...
    public static void main(String[] args) {
        iPhone meuiPhone = new iPhone(); // Cria um objeto da classe iPhone

        int opcao;

        do { // Loop para mostrar o menu e receber a escolha do usuário
            mostrarMenu();
            System.out.print("Digite a opção desejada: ");
            opcao = meuiPhone.scanner.nextInt(); // Lê a opção do usuário
            meuiPhone.scanner.nextLine(); // Limpa o buffer do Scanner

            switch (opcao) {
                case 1:
                    meuiPhone.LigarTelefone();
                    break;
                case 2:
                    meuiPhone.DesligarTelefone();
                    break;
                case 3:
                    meuiPhone.AumentarVolume();
                    break;
                case 4:
                    meuiPhone.DiminuirVolume();
                    break;
                case 5:
                    meuiPhone.BloquearTela();
                    break;
                case 6:
                    meuiPhone.DesbloquearTela();
                    break;
                case 7:
                    System.out.print("Digite o número de telefone: ");
                    String numero = meuiPhone.scanner.nextLine();
                    meuiPhone.FazerLigação(numero);
                    break;
                case 8:
                    meuiPhone.EncerrarLigação();
                    break;
                case 9:
                    System.out.print("Digite o nome da música: ");
                    String nomeDaMusica = meuiPhone.scanner.nextLine();
                    meuiPhone.TocarMusica(nomeDaMusica);
                    break;
                case 10:
                    System.out.print("Digite a URL: ");
                    String url = meuiPhone.scanner.nextLine();
                    meuiPhone.AbrirNavegador(url);
                    break;
                case 0:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0); // Continua o loop até o usuário escolher a opção 0

        meuiPhone.scanner.close(); // Fecha o Scanner
    }

    static void mostrarMenu() { // Método para mostrar o menu do iPhone
        System.out.println("Menu do iPhone:");
        System.out.println("1. Ligar Telefone");
        System.out.println("2. Desligar Telefone");
        System.out.println("3. Aumentar Volume");
        System.out.println("4. Diminuir Volume");
        System.out.println("5. Bloquear Tela");
        System.out.println("6. Desbloquear Tela");
        System.out.println("7. Fazer Ligação");
        System.out.println("8. Encerrar Ligação");
        System.out.println("9. Tocar Música");
        System.out.println("10. Abrir Navegador");
        System.out.println("0. Sair");
    }

    void LigarTelefone(){

        System.out.println("Ligando Telefone");

    }
    void DesligarTelefone(){

        System.out.println("Desligando Telefone");

    }
    void AumentarVolume() {

        System.out.println("Aumentando volume");
    }

    void DiminuirVolume() {

        System.out.println("Abaixando Volume");

    }
    void BloquearTela(){

        System.out.println("Bloquendo Tela");

    }
    void DesbloquearTela(){

        System.out.println("Desbloqueando Tela");

    }
   void FazerLigação(String numero) { // Recebe o número de telefone como parâmetro
        
        System.out.println("Digitando Número " + numero);
        System.out.println("Fazendo Ligação");

    }
    void EncerrarLigação(){
        System.out.println("Encerrando Ligação");

    }
    void TocarMusica(String nomeDaMusica){
        
        System.out.println("Selecione o Nome Da Música" + nomeDaMusica);
        System.out.println("Tocando Musica");
        
    }
    void AbrirNavegador(String url) { // Recebe a URL como parâmetro

        System.out.println("Digite a URL: " + url);
    }
    
    

}
