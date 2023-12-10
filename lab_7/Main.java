class MyClass<T> {
    private T value;

    public MyClass(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

}

public class Main {

    public static <T> void swap(MyClass<T> a, MyClass<T> b) {
        T temp = a.getValue();
        a.setValue(b.getValue());
        b.setValue(temp);
    }

    public static void main(String[] args) {

        MyClass<Integer> int1 = new MyClass<>(10);
        MyClass<Integer> int2= new MyClass<>(20);

        System.out.println("До обмена:");
        System.out.println("int1: " + int1.getValue());
        System.out.println("int2: " + int2.getValue());

        swap(int1, int2);

        System.out.println("После обмена:");
        System.out.println("int1: " + int1.getValue());
        System.out.println("int2: " + int2.getValue());


        MyClass<String> str1 = new MyClass<>("Aa");
        MyClass<String> str2 = new MyClass<>("Bb");

        System.out.println("До обмена:");
        System.out.println("str1: " + str1.getValue());
        System.out.println("str2: " + str2.getValue());

        swap(str1, str2);

        System.out.println("После обмена:");
        System.out.println("str1: " + str1.getValue());
        System.out.println("str2: " + str2.getValue());
    }

    
}
