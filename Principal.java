public class Principal {
    public static void main(String[] args) {
        //variável de referência
        //você não quer chamar de ponteiro
        //mas é um ponteiro
        // Scanner s = new Scanner (System.in);
        // s.nextInt();
        LivroDeNotas livroDeNotas;

        livroDeNotas = new LivroDeNotas();
        livroDeNotas.exibirMensagem();
    }
}
