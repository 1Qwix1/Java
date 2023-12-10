
import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите 2 параметра: a, b");

        System.out.println("Введите параметр a:");
        int a = in.nextInt();

        System.out.println("Введите параметр b:");
        int b = in.nextInt();


        //Логическоое И (&&)

        if((a > 0) && (b > 0)){
             System.out.println("Значения а и b больше 0"+"\n");
        }
        else if (((a < 0) && (b > 0))) {
            System.out.println("Значение а < 0 , значение b > 0"+"\n");
        }
        else if (((a > 0) && (b < 0))) {
            System.out.println("Значение а > 0 , значение b < 0"+"\n");

        }
        else{
             System.out.println("Значения а и b меньше 0"+"\n");

        }

         //Логическоое ИЛИ (||)
        if((a > 0) || (b > 0)){
             System.out.println("Значения а или b больше 0"+"\n");
        }
        else{
             System.out.println("Значения а или b меньше 0"+"\n");

        }

         // Логическое отрицание

        boolean isTrue = true;
        boolean isFalse = false;

        boolean notTrue = !isTrue;
        boolean notFalse = !isFalse;

        System.out.println("isTrue: " + isTrue);
        System.out.println("notTrue: " + notTrue);

        System.out.println("isFalse: " + isFalse);
        System.out.println("notFalse: " + notFalse+"\n");

        // Тенарная операция 

         System.out.println(a < b ?"a < b": "a > b" + "\n");
         System.out.println(a != b ?"a != b": "a == b" + "\n");

        //Поразрядные логические операции 
        System.out.println("Binary a " + Integer.toBinaryString(a));
        System.out.println("Binary B " + Integer.toBinaryString(b));
        System.out.println("~a: " + ~a + ": "+Integer.toBinaryString(~a));
        System.out.println("a&b: " +(a & b) + ": "+Integer.toBinaryString(a & b));
        System.out.println("a|b: " +(a | b) + ": "+Integer.toBinaryString(a | b));
        System.out.println("a^b: " +(a ^ b) + ": "+Integer.toBinaryString(a ^ b));

        //Операции сдвига
        System.out.println("a>>b: " + (a >> b)+ ": "+Integer.toBinaryString(a >> b));
        System.out.println("a<<b: " + (a << b)+ ": "+Integer.toBinaryString(a << b));
        System.out.println("a>>>b: " + (a >>> b)+ ": "+Integer.toBinaryString(a >>> b));

    }
}