package negocio;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
// Classe 'NoDeArvore' representa um nó em uma estrutura de árvore

public class NoDeArvore {

	// armazena o valor associado ao nó da árvore e cria uma lista que armazena os nós
	private String valor;
	private List<NoDeArvore> no;

	// Construtor que cria um  novo nó  com o valor e inicializa a lista
	public NoDeArvore(String valor) {
		this.valor = valor;
		this.no = new ArrayList<>();
	}

	// adiciona um novo nó
	public void adicionarNo(NoDeArvore noDeArvore) {
		no.add(noDeArvore);
	}

	// retorna o valor associado ao nó
	public String getValor() {
		return valor;
	}

	// retorna a lista de nós
	public List<NoDeArvore> getNo() {
		return no;
	}

	// imprime os valores dos nós da árvore
	public void printarPreOrdem() {
		JOptionPane.showMessageDialog(null, valor + " ");
		for (NoDeArvore noDeArvore : no) {
			noDeArvore.printarPreOrdem();
		}
	}

}
