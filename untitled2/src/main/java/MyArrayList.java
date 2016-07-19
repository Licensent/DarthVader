/**
 * Created by DarthVader on 11.07.2016.
 */
public class MyArrayList {
    Integer[] a = new Integer[10];

    public void add(int b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == null) {
                a[i] = b;
                if (i == a.length - 1) {
                    createNewsize();
                }
                break;
            }
        }
    }


    public int get(int b) {
        return a[b];
    }

    public void createNewsize() {
        Integer[] b = new Integer[a.length * 3 / 2 + 1];
        for (int s = 0; s < a.length; s++) {
            if (b[s] == null) {
                b[s] = a[s];
            }
        }
        a = b;

    }

    public void remove(int j) {
        for (int b = j; b <= a.length - 1; b++) {
            if (a[b] != null) {
                a[b] = a[b + 1];
            }
        }
    }

}
