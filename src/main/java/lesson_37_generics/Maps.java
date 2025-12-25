package lesson_37_generics;

import java.util.LinkedHashMap;
import java.util.Map;

public class Maps {

    public static class MergeMaps {

        public static Map<String, Integer> mergeMaps(Map<String, Integer> map1, Map<String, Integer> map2) {
            Map<String, Integer> result = new HashMap<>();

            for (String key : map1.keySet()) {
                result.put(key, map1.get(key));
            }

            for (String key : map2.keySet()) {
                int sum = result.getOrDefault(key, 0) + map2.get(key);
                result.put(key, sum);
            }

            return result;
        }

        static void main() {

            Map<String, Integer> map1 = new LinkedHashMap<>();
            map1.put("a", 3);
            map1.put("c", 4);

            Map<String, Integer> map2 = new LinkedHashMap<>();
            map2.put("b", 2);
            map2.put("c", 3);

            Map<String, Integer> merged = mergeMaps(map1, map2);

            System.out.println(merged);
        }
    }
}
