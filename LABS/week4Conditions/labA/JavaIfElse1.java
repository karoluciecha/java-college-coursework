// Karol G00436758
import java.lang.reflect.Field;
public class JavaIfElse1 {
    public int num1 = 50;
    void start() throws NoSuchFieldException, SecurityException {
        JavaIfElse1 newObject = new JavaIfElse1();
        Class newClassObject = newObject.getClass();
        Field variable = newClassObject.getField("num1");
        System.out.println(variable.getName() + " variable is: " + num1);
        if (num1 > 50) {
            System.out.println("Value is greater than 50!");
        } else if (num1 <= 50) {
            System.out.println("Value is less or equal to 50!");
        }
	}
    public static void main(String[] args) throws NoSuchFieldException, SecurityException {
        new JavaIfElse1().start();

    }
}