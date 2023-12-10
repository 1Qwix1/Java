import java.util.ArrayList;
import java.util.List;

public class Stack {
    private List<Integer> stackList; 
    private int top;

    // Конструктор
    public  Stack() {
        stackList = new ArrayList<>();
        top = -1; 
    }

    // Метод для добавления элемента в стек 
    public void push(int value) {
        stackList.add(value);
        top = stackList.size() - 1;
        System.out.println("Добавлен элемент: " + value);
    }

    // Метод для удаления элемента из стека 
    public int pop() {
        if (top >= 0) {
            int value = stackList.remove(top--);
            System.out.println("Удален элемент: " + value);
            return value;
        } else {
            System.out.println("Стек пуст");
            return -1; 
        }
    }

    // Метод для получения верхнего элемента стека без удаления
    public int peek() {
        if (top >= 0) {
            return stackList.get(top);
        } else {
            System.out.println("Стек пуст");
            return -1; 
        }
    }

    // Метод для проверки, пуст ли стек
    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {

        int size = 12;
        Stack stack = new Stack();

        for(int i  = 1 ; i <= size;i++){
            stack.push(i);
        }
        

        System.out.println("Верхний элемент стека: " + stack.peek());

        stack.pop();
        stack.pop();

        System.out.println("Стек пуст: " + stack.isEmpty());
    }
}