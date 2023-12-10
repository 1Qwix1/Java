public class Main  {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Hello";
        String str = str1 + "," + str2;/*Соединение строк*/
                 
        System.out.println(str+"\n");

        System.out.println("Длина строки: " + str.length()); // Выводит длину строки (количество символов)
        System.out.println("Символ на позиции 7: " + str.charAt(6)+"\n"); // Выводит символ на указанной позиции (индексация с нуля)

        System.out.println("Все символы в верхнем регистре: " + str.toUpperCase()); // Преобразует все символы к верхнему регистру
        System.out.println("Все символы в нижнем регистре: " + str.toLowerCase()); // Преобразует все символы к нижнему регистру
        System.out.println("Замена символа 'o' на 'e': " + str.replace('o', 'e')+"\n"); // Заменяет указанный символ на другой символ

        System.out.println("Позиция первого вхождения символа 'a': " + str.indexOf('a')); // Возвращает позицию первого вхождения символа
        System.out.println("Позиция последнего вхождения символа 'a': " + str.lastIndexOf('a')+"\n"); // Возвращает позицию последнего вхождения символа

        System.out.println("Строка начинается с 'Hello': " + str.startsWith("Hello")); // Проверяет, начинается ли строка с указанной подстроки(boolean value)
        System.out.println("Строка оканчивается на 'Hello': " + str.endsWith("Hello")); // Проверяет, оканчивается ли строка на указанную подстроку(boolean value)
        System.out.println("Строка содержит 'Ja': " + str.contains("Ja")+"\n"); // Проверяет, содержит ли строка указанную подстроку(boolean value)

        String[] words = str.split(","); // Разделяет строку по указанному разделителю и возвращает массив подстрок
        System.out.println("Подстроки после разделения:");
        System.out.println(words[0]);
        System.out.println(words[1]);
    }
}