package lista_Lineares;

import javax.swing.JOptionPane;

public class Programa {

	public static void main (String [] args) {
		
	
		Lista f = new Lista ();
		
	
		f.insere_inicio(Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para lista")));
		
		
		f.insere_inicio(60);
		f.insere_inicio(90);
		f.insere_inicio(100);
		f.insere_inicio(110);
		f.insere_inicio(150);
		f.insere_final(1000);
		
		
		JOptionPane.showMessageDialog(null, f.Listar());
		
		
	}
	
	
	
	
	
		
}
