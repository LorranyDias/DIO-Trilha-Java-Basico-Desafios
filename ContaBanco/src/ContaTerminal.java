//** Conhecer e Importar a Class Scanner
 

import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //int numeroConta;
        //String Agência;
        //String NomeDoClinte;
        //double saldoConta = 1800;
        
        //**Exibir as Mensagens Para os Nossos Usuários
        /* Obter Pela Scanner os Valores Digitados no Terminal
         */

         Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

         System.out.println("Por Favor Digite o Número da Conta: ");
          int Conta = scanner.nextInt();

          System.out.println("Por Favor Digite o Número da Agência");
           String Agência = scanner.next(); 

         System.out.println("Por Favor Digite Seu Nome: ");
          String nomeCliente = scanner.next();

         System.out.println("Por Favor Digite Seu Sobrenome: ");
          String sobrenomeCliente = scanner.next();

         System.out.println("Por Favor Digite o Seu Saldo: ");
          double saldo = scanner.nextDouble();

           //Exibindo a Mensagem da Conta Criada

         System.out.println(" Olá " + (nomeCliente) + (sobrenomeCliente) + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agência + ", conta " + Conta +" e seu saldo " +  saldo + " já está disponível para saque");




    }
}
