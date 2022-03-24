public class LivroDeNotas{
    
    private String nomeDoCurso;

    public String getNomeDoCurso(){
        return nomeDoCurso;
    }

    public void setNomeDoCurso(String nomeDoCurso){
        this.nomeDoCurso = nomeDoCurso;
    }

    public void exibirMensagem(){
        System.out.printf("Bem vindo ao livro de notas de %s\n", this.nomeDoCurso);
    } 
}