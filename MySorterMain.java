package ntou.cs.sorter;

public class MySorterMain {
    public static void main(String[] args) {
        double input[] = { 100, 10.10, 2.1, 2.0, 1.1, 1.0 };
        MySorter sorter = new MySorter();

        sorter.sort(input);
        for (double i: input) {
            System.out.print(i + " ");
        }
    }
}