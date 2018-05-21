package numbers;

/**
 *
 * @author Santiago Giraldo Mejia
 */
public class Multiple {
    
    /* Metodo que recibe un numero entero y valida si es múltiplo de 3, 5 o de 
    *  ambos y retorna un string según el resultado.
    */
    public String validateMultiple(Integer number) {
        if ((number % 3 == 0) && (number % 5 == 0)) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return  "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return Integer.toString(number);
        }
    }
}
