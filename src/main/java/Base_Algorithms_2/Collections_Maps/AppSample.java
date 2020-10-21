package Base_Algorithms_2.Collections_Maps;

import java.util.Map;
import java.util.TreeMap;

public class AppSample {
    public static void main(String[] args) {

        Map<String, Integer> map = new TreeMap<>();
        map.put("Nikolay", 34);
        map.put("Jury", 12);
        map.put("Daniil", 76);
        map.put("Albert", 23);

        System.out.println(map);

    }
}
