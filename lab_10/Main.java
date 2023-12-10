public class Main {
    public static void main(String[] args) {
        try {
            Triple<Integer> A = new Triple<>(123, 1234, 5345);
            System.out.println("Min: " + A.min());
            System.out.println("Max: " + A.max());
            System.out.println("Mean: " + A.mean());

            Triple<String> B = new Triple<>("asdfs", "bsd", "cs");
            System.out.println("Min: " + B.min());
            System.out.println("Max: " + B.max());
            System.out.println("Mean: " + B.mean());

        } catch (UnsupportedOperationException e) {
            System.out.println("Unsupported operation: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}