import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<String> simpleList = new ArrayList<>();

        simpleList.add("First element");
        simpleList.add("Second element");
        simpleList.add("Third Element");
        simpleList.add("Dummy element: testings purposes");

        int index = simpleList.indexOf("first element");

        if (index < 0 ) {
            index = 3;
        }

        System.out.println(simpleList.get(index));
    }
}
