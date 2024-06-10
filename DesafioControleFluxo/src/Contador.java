import java.util.Scanner;

public class Contador {
	  public static void main(String[] args) throws Exception {
		 
	   try {
		    	 
	    Scanner terminal = new Scanner(System.in);
		        
	    System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		        
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		        
		//chamando o método contendo a lógica de contagem
		 contar(parametroUm, parametroDois);
		terminal.close();
		            

		} catch (ParametrosInvalidosException E) {
		//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
		  System.out.println( "O segundo parâmetro deve ser maior que o primeiro");
		        }

		    }

		static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		
		    	 
		            
		if (parametroUm >= parametroDois) {
		 throw new ParametrosInvalidosException();
		            
	    }else {
		       
		for (int indice = parametroUm ; indice < parametroDois ; indice++) {
		System.out.println("imprimindo o numero: " + (indice+1) );
		}
		        	
		int contagem = parametroDois - parametroUm;
		        
	     for (int i = 1; i <= contagem; i++) {
		  System.out.println("Imprimindo o número " + i);
	}

		       
	}
	}
   }

