package banca de revista;

public class Revista extends Produto {
    private String editora;

    public Revista(int codigo, String nome, String editora){
        super(codigo, nome);
        this.editora = editora;
    }

    // ! ENCAPSULAMENTO

    public String getEditora(){
        return editora;
    }

    public void setEditora(String editora){
        this.editora = editora;
    }
}
