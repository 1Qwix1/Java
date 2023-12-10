public class Main {
    public static void main(String[] args) {
        System.out.println("Количество аргументов командной строки: " + args.length);

        // Выводим все аргументы командной строки
        for (int i = 0; i < args.length; i++) {
            System.out.println("Аргумент " + (i + 1) + ": " + args[i]);
        }
    }
}
