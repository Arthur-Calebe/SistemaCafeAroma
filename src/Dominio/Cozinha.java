package Dominio;

public class Cozinha {
    private String tipoCafe;
    private double precoCafe;
    private int quantidadeEstoque;

    public Cozinha(String tipoCafe, double precoCafe, int quantidadeEstoque){
        this.tipoCafe = tipoCafe;
        this.precoCafe = precoCafe;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void ImprimirCozinha(){
        System.out.println("Tipo de produto: " + tipoCafe);
        System.out.println("Preço do produto: " + precoCafe);
        System.out.println("Disponível no estoque: " + quantidadeEstoque);
    }

    public boolean vender(int quantidade) {
        if (quantidade <= quantidadeEstoque) {
            quantidadeEstoque -= quantidade;
            System.out.println("Quantidade disponível, compra liberada!!");
            return true;
        } else {
            System.out.println("Não possuímos estoque desse produto, compra negada!!");
            return false;
        }
    }

    public String getTipoCafe() {
        return tipoCafe;
    }

    public void setTipoCafe(String tipoCafe) {
        this.tipoCafe = tipoCafe;
    }

    public double getPrecoCafe() {
        return precoCafe;
    }

    public void setPrecoCafe(double precoCafe) {
        this.precoCafe = precoCafe;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

}
