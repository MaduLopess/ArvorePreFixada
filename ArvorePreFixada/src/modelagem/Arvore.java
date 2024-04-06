package modelagem;

import negocio.NoDeArvore;

// Classe 'Arvore' do pacote modelagem armazena uma árvore fornecendo um método para acessar o nó raiz.
public class Arvore {
	// declaração do atributo do tipo private
	private NoDeArvore raiz;

	// Recebe um valor para a raiz da árvore como parâmetro e cria um novo nó raiz da árvore
	public Arvore(String valorRaiz) {
		this.raiz = new NoDeArvore(valorRaiz);
	}

	// Retorna a referência para o nó raiz da árvore
	public NoDeArvore getRaiz() {
		return raiz;
	}
}
