import java.util.Arrays;
import java.util.Scanner;

public class Excercise1 {

    public static void printArray (int[] array ){
        for (int i=0;i<array.length;i++){
            System.out.print("\""+array[i]+"\"|");
        }
        System.out.println();
    }
    public static void printEven (int[] array ){
        for (int i=0;i<array.length;i++){
            if(array[i]%2==0){
            System.out.print("\""+array[i]+"\"|");
            }
        }
        System.out.println();
    }
    public static int[] sortArray(int [] array){
        System.out.println("Выберите способ сортировки массива:");
        System.out.println("1: Сортировка выбором");
        System.out.println("2: Сортировка методом sort");
        System.out.println("3: Сортировка пузырьком");
        Scanner param = new Scanner(System.in);
        int num = param.nextInt();
        switch (num) {
            case 1:
                for (int i = 0; i < array.length; i++) {
                    int min = array[i];
                    int min_i = i;
                    for (int j = i + 1; j < array.length; j++) {
                        if (array[j] < min) {
                            min = array[j];
                            min_i = j;
                        }
                    }
                    if (min < array[i]) {
                        int tmp = array[i];
                        array[i] = min;
                        array[min_i] = tmp;
                    }
                }
                break;
            case 2:
                Arrays.sort(array);
                break;
            case 3:
                for (int i=array.length-1;i>0;i--){
                    for(int j=0;j<i;j++){
                        if(array[j]>array[j+1]){
                            int tmp = array[j];
                            array[j]=array[j+1];
                            array[j+1]=tmp;
                        }
                    }
                }
                break;

        }
        return array;
    }
    public static int[] inputArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int [] numArray = new int[10];
        for (int i=0;i<10;i++){
            int num = scanner.nextInt();
            System.out.println("Вы ввели число: "+num);
            numArray[i]=num;
        }
        return numArray;
    }
}
