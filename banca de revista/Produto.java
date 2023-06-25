package banca de revista;

public abstract class Produto {

    private int codigo;
    private String nome;
    private int estoque;
    private double valorUnitario;

    public Produto(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }

    // ! ENCAPSULAMENTO

    // @ codigo
    public int getCodigo(){
        return codigo;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo
    }
    // @ nome
    public int getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    // @ estoque
    public int getEstoque(){
        return estoque;
    }

    // @ valorUnitario
    public int getValorUnitario(){
        return valorUnitario;
    }

    public void setCodigo(double valorUnitario){
        this.valorUnitario = valorUnitario;
    }

    // ! MÉTODOS

    public void incluirEstoque(int quantidade){
        estoque = estoque + quantidade;
    }

    public void tirarEstoque(int quantidade){
        if(quantidade <= estoque)
        {
            estoque = estoque - quantidade;
        }
        else
        {
            System.out.println("Estoque indisponível!!")
        }
    }



}
