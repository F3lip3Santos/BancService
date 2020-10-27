import java.util.Scanner;

import javax.swing.JOptionPane;  // a idéia é este cara substituir Scanner e System.out.Println

/* a versão 1.0 usa 100% SCANNER e System.out.println
 * 
 * a versão 1.1 vai usar INTERFACE Gráfica
 */
public class ContaData {
	public static void main(String[] args) {
		
		// -- versao 1.0
		//Scanner teclado = new Scanner(System.in);
		int opcao;
		String entrada;
		double valor;
		ContaBancaria c = new ContaBancaria("123.456.789-00","Isidro",1234,9876,1);
		
		do {
			// -- versao 1.0
			//System.out.println("Digite sua opcao 1 - deposito / 2 - saque / 3 - info / -1 - sair");
			//opcao = teclado.nextInt();
			
			// -- versao 1.1
			entrada = JOptionPane.showInputDialog("Digite sua opcao 1 - deposito / 2 - saque / 3 - info / -1 - sair");
			opcao = Integer.parseInt(entrada);// recebo a leitura sempre como String... depois faço a conversão para um número
			
			switch(opcao) {
			case 1:
				// -- versao 1.0
				//System.out.print("Digite o valor a depositar: ");
				//valor = teclado.nextDouble();
				
				// -- versao 1.1
				entrada = JOptionPane.showInputDialog("Digite o valor a depositar");
				valor = Double.parseDouble(entrada);
				c.depositar(valor);
				break;
			case 2:
				// -- versao 1.0
				//System.out.println("Digite o valor a sacar: ");
				//valor = teclado.nextDouble();
				
				// -- versao 1.1
				entrada = JOptionPane.showInputDialog("Digite o valor a sacar");
				valor = Double.parseDouble(entrada);
				boolean res = c.sacar(valor);
				if (res) {
					// -- versao 1.0
					//System.out.println("   SAQUE autorizado!");
					
					// -- versao 1.1
					JOptionPane.showMessageDialog(null, "Saque Autorizado!");
				}
				else {
					// -- versao 1.0
					//System.out.println("   SAQUE Não autorizado!");
					
					// -- versao 1.1
					JOptionPane.showMessageDialog(null, "Saque NÃO Autorizado");
				}
				break;
			case 3:
				// -- versao 1.0
				//System.out.println(c.exibirInfo());
				
				// -- versao 1.1
				JOptionPane.showMessageDialog(null,  c.exibirInfo());
				break;
			case -1:
				// -- versao 1.0
				//System.out.println(" *** OBRIGADO POR FAZER PARTE DO NOSSO BANCO *** ");
				
				// -- versao 1.1
				JOptionPane.showMessageDialog(null, "*** OBRIGADO POR FAZER PARTE DO NOSSO BANCO ***");
				break;
			default:
				// -- versao 1.0
				//System.out.println("ERRO: OPCÃO INVALIDA!");
				
				// -- versao 1.1
				JOptionPane.showMessageDialog(null, "OPCAO INVALIDA");
			}
			
		} while (opcao != -1);
		
		
		
	}

}