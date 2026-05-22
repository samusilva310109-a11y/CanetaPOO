import model.Caneta;

public class Main {
    public static void main(String[] args) {

        Caneta c1 = new Caneta("Azul", "Bic Crystal");
//        c1.cor = "Vermelho";
//        c1.modelo = "BIC Crystal";
//        c1.setPonta(0.5);
//        c1.tampar(); //pode ser considerado um método modificador, pois ele altera o estado do atributo "tampada"
          c1.mostrarStatus();
    }

}
