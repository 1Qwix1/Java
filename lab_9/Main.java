import java.lang.reflect.Method;
import java.lang.reflect.Constructor;

public class Main {

    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry", 2022, 25000);

        try {
            String className = "Car";

            Class<?> clazz = Class.forName(className);

            
            Constructor<?> constructor = clazz.getConstructor(String.class, String.class, int.class, double.class);


            Object instance = constructor.newInstance("Toyota", "Camry", 2022, 25000);

            String methodName = "displayInfo";

            Method method = clazz.getMethod(methodName);

            method.invoke(instance);

        } catch (ClassNotFoundException e) {
            System.err.println("Class not found: " + e.getMessage());

        } catch (NoSuchMethodException e) {
            System.err.println("Method not found: " + e.getMessage());

        } catch (Exception e) {
            System.err.println("An error has occurred: " + e.getMessage());

        }
    }
}