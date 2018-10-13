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

}
