import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

   
    public static void printClassInfo(Class<?> clazz) {
        System.out.println("Class Name: " + clazz.getName());

        //поля класса
        System.out.println("\nFields:");
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(" -" + field.getType().getSimpleName() + " " + field.getName());
        }

        // методы класса
        System.out.println("\nMethods:");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.print(" -" + method.getReturnType().getSimpleName() + " " + method.getName() + "(");
            Class<?>[] parameterTypes = method.getParameterTypes();
            for (int i = 0; i < parameterTypes.length; i++) {
                System.out.print(parameterTypes[i].getSimpleName());
                if (i < parameterTypes.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(")");
        }

        //конструкторы класса
        System.out.println("\nConstructors:");
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.print(" -" + constructor.getName() + "(");
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            for (int i = 0; i < parameterTypes.length; i++) {
                System.out.print(parameterTypes[i].getSimpleName());
                if (i < parameterTypes.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(")");
        }
    }

    public static void main(String[] args) {
        // информация о классе String
        Class<?> clazz = String.class;
        printClassInfo(clazz);
    }
}