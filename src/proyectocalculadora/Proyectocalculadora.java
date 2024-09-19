package proyectocalculadora;

public class Proyectocalculadora {

    public static void main(String[] args) {
        calculadora numero = new calculadora();

        numero.setTitle("calculadora(proyecto)");

        numero.setBounds(500, 100, 400, 600);

        numero.setResizable(false);

        numero.panel();

        numero.tex();

        numero.boton();

    }

}
