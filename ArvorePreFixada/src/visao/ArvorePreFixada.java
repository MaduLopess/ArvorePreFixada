package visao;

import javax.swing.JOptionPane;

import modelagem.Arvore;
import negocio.NoDeArvore;

// classe ArvorePreFixada que deverá interagir com o usuário
public class ArvorePreFixada {

	public static void main(String[] args) {

		// Solicita ao usuário o valor para o nó da raiz da árvore e cria uma nova  instância da classe 'arvore' com esse valor.
		String valorRaiz = JOptionPane.showInputDialog("\n Insira o valor da raíz: ");
		Arvore arvore = new Arvore(valorRaiz);

		// faz referência para o nó raiz da árvore
		NoDeArvore raiz = arvore.getRaiz();

		// Solicita ao usuário o valor para o nó da árvore e cria uma nova instância da
		// classe 'NoDeArvore' com esse valor
		String valorNoUm = JOptionPane.showInputDialog("\n Insira o valor do primeiro nó: ");
		NoDeArvore noUm = new NoDeArvore(valorNoUm);

		String valorNoDois = JOptionPane.showInputDialog("\n Insira o valor do segundo nó: ");
		NoDeArvore noDois = new NoDeArvore(valorNoDois);

		String valorNoTres = JOptionPane.showInputDialog("\n Insira o valor do terceiro nó: ");
		NoDeArvore num3 = new NoDeArvore(valorNoTres);

		String valorNoQuatro = JOptionPane.showInputDialog("\n Insira o valor do quarto nó: ");
		NoDeArvore num4 = new NoDeArvore(valorNoQuatro);

		String valorNoCinco = JOptionPane.showInputDialog("\n Insira o valor do quinto nó: ");
		NoDeArvore num5 = new NoDeArvore(valorNoCinco);

		String valorNoSeis = JOptionPane.showInputDialog("\n Insira o valor do sexto nó: ");
		NoDeArvore num6 = new NoDeArvore(valorNoSeis);

		raiz.adicionarNo(noUm);
		raiz.adicionarNo(noDois);

		noUm.adicionarNo(num3);
		noUm.adicionarNo(num4);

		noDois.adicionarNo(num5);
		noDois.adicionarNo(num6);

		JOptionPane.showMessageDialog(null, "\n IMPRIMINDO PRÉ-ORDEM DA ÁRVORE: ");
		raiz.printarPreOrdem();

	}

}
