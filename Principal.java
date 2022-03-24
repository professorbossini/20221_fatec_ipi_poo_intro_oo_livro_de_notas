import static javax.swing.JOptionPane.showInputDialog;
public class Principal {
    public static void main(String[] args) {
        String nomeDoCurso = showInputDialog("Digite o nome do curso");
       LivroDeNotas livro = new LivroDeNotas();
       livro.nomeDoCurso = nomeDoCurso;
       livro.exibirMensagem();

       LivroDeNotas livro2 = new LivroDeNotas();
       livro2.nomeDoCurso = showInputDialog("Digite o segundo nome");
       livro2.exibirMensagem();

       LivroDeNotas.exibirMensagem();
       JOptionPane.showInputDialog("");

    }
}
