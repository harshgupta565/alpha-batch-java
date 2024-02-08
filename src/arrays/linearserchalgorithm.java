package arrays;

public class linearserchalgorithm {
    public static int searchingelements(int numbers[], int keys) {
        for (int i = 0; i< numbers.length; i++) {
            if (numbers[i] == keys)
                return i;
        }
        return -1;
    }

    public static void main(String args[]) {
        int numbers[] = {1, 3, 5, 4, 8, 7, 5, 9, 11, 56, 75, 89, 10};
        int keys = 56;

        int index = searchingelements(numbers, keys );
        if (index == -1) {
            System.out.println("not found");
        } else {
            System.out.println("key ia at index;" + index);
        }
    }
}



