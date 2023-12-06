package ecuacionescuadradas;

/**
 *
 * @author iagof
 */
public class EcuacionesSegundoGrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /**
       * Declaramos las variables que vamos a utilizar
       */
        int a = 1;
        int b = -2;
        int c = -15;
        /**
         * Separamos en dos operaciones donde en una hacemos la razin cuadrada sobre el resultado de  una
         * mientras el resultado se divide entre 2*a y asi se calculan los valores de X1 y X2
         */
        double x1 = (-b + (Math.sqrt(Math.pow(b, 2) - 4 * a * c))) / (2 * a);
        double x2 = (-b - (Math.sqrt(Math.pow(b, 2) - 4 * a * c))) / (2 * a);

        System.out.print("El resultado de X1 es :" + x1);
        System.out.print("El resultado de X2 es :" + x2);

    }
}
