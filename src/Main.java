public class Main {

    public static void main(String[] args) {
        int [] array = Excercise1.inputArray();
        Excercise1.printArray(array);
        int [] sortedArray = Excercise1.sortArray(array);
        Excercise1.printArray(sortedArray);
        Excercise1.printEven(sortedArray);
    }
}
