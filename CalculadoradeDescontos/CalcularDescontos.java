package CalculadoradeDescontos;

public class CalcularDescontos {

    public void calcula20(){
    double precoproduto;
    precoproduto = 200;
    int desconto = 20;
    double precoCOmDesconto = precoproduto - (precoproduto*desconto/100);
    System.out.println("o Valor do Produto com desconto é "
    +precoCOmDesconto+" R$");
}
public void calcula30(){
    double precoproduto;
    precoproduto = 200;
    int desconto = 30;
    double precoCOmDesconto = precoproduto - (precoproduto*desconto/100);
    System.out.println("o Valor do Produto com desconto é "
    +precoCOmDesconto+" R$");
}
}
