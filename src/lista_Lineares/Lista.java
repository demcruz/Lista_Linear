package lista_Lineares;

public class Lista {

	private No cabeca_lista;

	public void insere_inicio(int conteudo) {
		No novo_no = new No(conteudo);

		if (cabeca_lista == null) {
			cabeca_lista = novo_no;
		} else {
			novo_no.prox = cabeca_lista;
			cabeca_lista = novo_no;
		}

	}

	public void insere_final(int conteudo) {
		No novo_no = new No(conteudo);
		if (cabeca_lista == null) {
			cabeca_lista = novo_no;
		} else {
			No aux;
			aux = cabeca_lista;
			while (aux.prox != null) {
				aux = aux.prox;
			}
			aux.prox = novo_no;
		}
	}

	public String Listar() {
		No aux;
		aux = cabeca_lista;
		String lista = null;

		while (aux != null) {
			lista = lista + " " + aux.info;
			aux = aux.prox;
		}
		if (lista == null) {
			lista = "Lista Vazia";
		}
		return lista;
	}
	
	public void remover_inicio() {
		if (cabeca_lista != null ) {
			cabeca_lista = cabeca_lista.prox;
		}
	}

	public void remover_final() {
		No aux1 = cabeca_lista;
		No aux2 = cabeca_lista;
		if (aux1 == null) {
			System.out.println("Lista vazia");
		} else if (aux1.prox == null) {
			cabeca_lista = null; // a lista só tem um elemento

		} else {
			while (aux1.prox != null) {
				aux1 = aux1.prox; // posiciona aux1 na última posição
			}
			while (aux2.prox != aux1) {
				aux2 = aux2.prox; // posiciona aux2 na penultima posição
			}
			aux2.prox = null; // exclui o último elemento
		}
	}

	public int getQtdElementos() {
		int qtd = 0;
		No aux = cabeca_lista;
		while (aux != null) {
			qtd = qtd++;
			aux = aux.prox;
		}
		return qtd;
	}
	
	public String remover_posicao (int posicao) {
		No aux  = cabeca_lista;
		String msg =" ";
		int qtd_elementos = getQtdElementos();
		
		if (cabeca_lista == null) {
			msg = "Lista vazia";
		}else if (qtd_elementos < posicao) {
			msg ="Menos Elementos do que a posicao requerida";
		}else if (posicao == 1) {
			remover_inicio();
			msg  = " Removido Inicio";
		}else if (posicao == qtd_elementos) {
			remover_final();
			msg = " Removido Final";
		}else {
			for (int i=1; i<posicao; i++) {
				aux = aux.prox;
			}
			No aux2 = aux.prox;
			aux.prox = aux2.prox;
			msg = "Removido Meio";
		}
		return msg;
	}

}
