package lista1;  

public class Lista1 {

 

    public static void main(String[] args) {
       //instanciar obj1
       Produto obj1= new Produto();

       //instanciar obj2
       Produto obj2= new Produto();

 

       // adiciona valores para obj1
       obj1.codigo = 1;
       obj1.nome= "Sabonete";
       obj1.descricao= "Dove Creme";
       obj1.qtde=10;
       obj1.preco= 1.8f;

       // adiciona valores para obj2
       obj2.codigo = 2;
       obj2.nome = "Sabão";
       obj2.descricao = "Neutro";
       obj2.qtde =20;
       obj2.preco = 1.2f;

       //exibe os dados do obj1
       obj1.exibeDados();
       
       //exibe os dados do obj2
       obj2.exibeDados();
       
       obj1.comprar(5);
       obj2.comprar(8);
       
       //exibe os dados do obj1
       obj1.exibeDados();
       
       //exibe os dados do obj2
       obj2.exibeDados();
       
       obj1.vender(3);
       obj2.vender(40);
       
       //exibe os dados do obj1
       obj1.exibeDados();
       
       //exibe os dados do obj2
       obj2.exibeDados();
       
       
    }
}