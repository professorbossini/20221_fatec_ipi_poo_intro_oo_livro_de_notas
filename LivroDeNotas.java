public class LivroDeNotas{
    
    String nomeDoCurso;

    // public LivroDeNotas(){

    // }

    public LivroDeNotas(String nomeDoCurso){
        nomeDoCurso = nomeDoCurso;
    }
    
    public void exibirMensagem(){
        System.out.printf("Bem vindo ao livro de notas de %s\n", nomeDoCurso);
    } 
}