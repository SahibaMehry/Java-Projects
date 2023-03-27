public class ArrayListInt {
    //State
    private static final int INITIAL_CAPACITY = 8;
    private static final float CAPACITY_MULTIPLIER= 2.0f;

    private int[] data;
    private int size;

    //Behaviors/ Services
    public ArrayListInt() {
        data = new int[INITIAL_CAPACITY];
        size = 0;
    }

    public int size() {
        return size;
    }

    public int get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }

        return data[index];
    }

    public void set(int index, int value) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        data[index] = value;
    }

    public void add(int value) {
        if (size + 1 > data.length) {
        int[] temp = new int[(int) (data.length * CAPACITY_MULTIPLIER)];
            if (size() >= 0) System.arraycopy(data, 0, temp, 0, size());
        data = temp;
    }
        data[size()] = value;
        ++size;
}


    public void add(int index, int value){
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        }

        if (size + 1 > data.length) {
            int[] temp = new int[(int) (data.length * CAPACITY_MULTIPLIER)];
            System.arraycopy(data, 0, temp, 0, index);
            if (size() - index >= 0) System.arraycopy(data, index, temp, index + 1, size() - index);
            data = temp;
        } else {
            System.arraycopy(data, index, data, index + 1, size() - index);
            }

        data[index] = value;
        ++size;
    }



    public void remove(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        if (size - 1 <= (int) (data.length / (CAPACITY_MULTIPLIER * 2.0f))) {
            int[] temp = new int[(int) (data.length / CAPACITY_MULTIPLIER)];
            System.arraycopy(data, 0, temp, 0, index);
            if (size() - (index + 1) >= 0) System.arraycopy(data, index + 1, temp, index + 1 - 1, size() - (index + 1));
            data = temp;
        } else {
            if (size() - (index + 1) >= 0) System.arraycopy(data, index + 1, data, index + 1 - 1, size() - (index + 1));

        }
        --size;
    }

    public String toString() {
        StringBuilder res = new StringBuilder("[");
        for (int i = 0; i < size(); ++i) {
            res.append(data[i]);
            res.append(i < size() - 1 ? ", " : "]");
        }
        return res.toString();
    }
}