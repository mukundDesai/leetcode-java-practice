import java.util.*;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        arr.sort(Comparator.naturalOrder());

        System.out.println(arr.get(arr.size() - 1) - arr.get(0) - arr.size());
        sc.close();
    }
}
