package numbers;

/**
 *
 * @author Santigo Giraldo Mejia
 * 
 * programa que imprima los números del 1 al 100. Pero para los múltiplos de 3, 
 * imprima" Fizz "en lugar del número y para los múltiplos de 5 imprima" Buzz ". 
 * Para los números que son múltiplos de 3 y 5, imprima" FizzBuzz "
 */
public class Numbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Multiple multiple = new Multiple();
        System.out.println("-------MULTIPLES-------");
        for (int i = 1; i <= 100; i++) {
            System.out.println(multiple.validateMultiple(i));
        }
    }

}
