package bogdan.com;

/**
 * mi-e foame
 *
 */
public class Main {

    public static void main(String[] args) {
        Integer a = 69;
        Integer b = 0;
        try {
            System.out.println(b / a);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Esti vaca, nu poti imparti " + e.getMessage());
        }
        Tips.print("text");
    }
}
