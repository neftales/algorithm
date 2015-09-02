package sort;

public class Sorting {

    public int[] bubbleSort(int[] array) {
        boolean swap = true;
        int aux;

        while (swap) {
            swap = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    aux = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = aux;
                    swap = true;
                }
            }
        }

        return array;
    }
}
