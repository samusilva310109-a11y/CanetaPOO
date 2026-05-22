package model;

public class Panela {
    public boolean ligado;
    public boolean tampada;
    public String cor;
    public String marca;
    public String fonteDeCalor;

    public void mostrarStatus(){
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
        System.out.println("Marca: " + this.marca);
        System.out.println("Fonte de Calor: " + this.fonteDeCalor);
        System.out.println("Ligado: " + this.ligado);
    }

    public void ligar() {
        if (this.ligado == false) {
            System.out.println("Ligando...");
            this.ligado = true;
        }else  {
            System.out.println("A panela já está ligada");
        }
    }

    public void desligar() {
        if (this.ligado == true) {
            System.out.println("Desligando...");
            this.ligado = false;
        }else {
            System.out.println("A panela já está desligada");
        }
    }

    public void tampar() {
        if (this.tampada == false) {
            System.out.println("Tampando...");
            this.tampada = true;
        }else {
            System.out.println("A panela já está tampada");
        }
    }
}
