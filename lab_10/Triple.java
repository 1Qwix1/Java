public class Triple<T extends Comparable<T>> {
    private T first;
    private T second;
    private T third;

    public Triple() {}

    public Triple(T first, T second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() {
        return this.first;
    }

    public T getSecond() {
        return this.second;
    }

    public T getThird() {
        return this.third;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    public void setThird(T third) {
        this.third = third;
    }

    public T min() {
        return minOfThree(first, second, third);
    }

    public T max() {
        return maxOfThree(first, second, third);
    }

    public double mean() {
        if (first instanceof Number && second instanceof Number && third instanceof Number) {
            double meanValue = ((Number) first).doubleValue() + ((Number) second).doubleValue() + ((Number) third).doubleValue();
            return meanValue / 3;
        } else {
            throw new UnsupportedOperationException("Среднее значение можно найти только для числовых значений");
        }
    }

    private T minOfThree(T a, T b, T c) {
        return minofTwo(minofTwo(a, b), c);
    }

    private T maxOfThree(T a, T b, T c) {
        return maxofTwo(maxofTwo(a, b), c);
    }

    private T minofTwo(T a, T b) {
        return a.compareTo(b) < 0 ? a : b;
    }

    private T maxofTwo(T a, T b) {
        return a.compareTo(b) > 0 ? a : b;
    }
}