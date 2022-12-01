import java.util.ArrayList;
import java.util.Collections;
class Main {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(12);
        ar.add(21);
        ar.add(111);
        ar.add(133);
        int summ=0;
        Integer[] myArray = new Integer[ar.size()];
        for (int i = 0; i < ar.size(); i++) {
            myArray[i] = Integer.valueOf(ar.get(i));
            summ=summ+myArray[i];


        }
        System.out.println(Collections.max(ar));
        System.out.println(Collections.min(ar));
        System.out.println(summ/4);
    }
}
