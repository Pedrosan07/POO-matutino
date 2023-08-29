package lista1;

 

 

public class Produto {
    // Java é tipado, variáveis possuem tipo de dados 
    //tipos de dados primitivos (int, float, double, boolean)
    //tipo de dados de classe (String, Float, Integer,Double)
    public int codigo;
    public String nome;
    public String descricao;
    public int qtde;
    public float preco;

    //comprar produto
    public void comprar(int x){
        this.qtde = this.qtde + x;
    }
    
    public void vender(int x){
        if (x <= this.qtde){
            this.qtde = this.qtde - x;
        }
        else {
            System.out.println("Estoque insuficiente");
        }
    }
    
    public void exibeDados() {
        // Exibir os dados do objeto que chama o método
         System.out.println(" Código " + this.codigo + " Nome " + this.nome + 
               " Descrição " + this.descricao + " Qtde " + this.qtde+ " Preço " + 
                 this.preco);
    }
}
