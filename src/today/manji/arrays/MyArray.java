package today.manji.arrays;

public class MyArray {

    private int[] array;
    private int count;

    public MyArray(int length) {
        this.array = new  int[length];
    }

    public void print() {
        for (int i = 0; i <count; i++) {
            System.out.println(array[i]);
        }
    }

    public void insert(int number) {
        if (array.length == count) {
            int[] newArray = new int[count * 2];

            for (int i = 0; i < count; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }

        array[count ++] = number;
    }

    public void removeOf(int index) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException();
        }

        for (int i = index; i < count; i++) {
            array[i] = array[i + 1];
        }

        count--;
    }

    public int indexOf(int number) {
        for (int i = 0; i < count; i++) {
            if (array[i] == number){
                return i;
            }
        }

        return -1;
    }

    public static void runTest() {
        MyArray myArray = new MyArray(3);
        myArray.insert(1);
        myArray.insert(2);
        myArray.insert(2);
        myArray.insert(3);
        myArray.insert(34);
        myArray.insert(34);
        myArray.insert(34);
        myArray.insert(34);
        myArray.insert(34);
        myArray.removeOf(3);
        myArray.print();
        System.out.println(myArray.indexOf(3));
    }
}
