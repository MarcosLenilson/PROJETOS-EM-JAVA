package banca de revista;

public class Doce extends Produto {
    private String marca;

    public Doce(int codigo, String nome, String marca){
        super(codigo, nome);
        this.marca = marca;
    }

    // ! ENCAPSULAMENTO

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }
}
