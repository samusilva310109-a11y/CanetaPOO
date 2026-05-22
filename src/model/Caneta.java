package model;

public class Caneta {
    public String modelo;
    public String cor;
    private double ponta;
    private int carga;
    private boolean tampada;

    public Caneta(String cor, String modelo) {
        this.modelo = modelo;
        this.cor = cor;
        tampar();
    }

    public void mostrarStatus(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga + "%");
        System.out.println("Tampada: " + this.tampada);
    }

    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("A caneta está tampada");
        }else{
            System.out.println("Rabiscando...");
        }
    }

    public void tampar(){
        if(this.tampada == false){
            System.out.println("Tampando...");
            this.tampada = true;
        }else {
            System.out.println("Já está tampada");
        }
    }

    public void destampar(){
        if(this.tampada == true){
            System.out.println("Destampando...");
            this.tampada = false;
        }else {
            System.out.println("A caneta já está destampada");
        }
    }

    public void setPonta(double ponta) { //utilizamos métodos modificadores (ou setters) para definir o valor de um atributo sem acessá-lo diretamente
        this.ponta = ponta;
    }

}
