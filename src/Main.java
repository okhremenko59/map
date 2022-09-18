import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {

    static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor " +
            "incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation " +
            "ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in " +
            "voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non " +
            "proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        int count;
        for (int i = 0; i < text.length(); i++) {
            if (map.containsKey(text.charAt(i))) {
                count = map.get(text.charAt(i));
                count++;
                map.put(text.charAt(i), count);
            } else map.put(text.charAt(i), 1);
        }

        for (Map.Entry<Character, Integer> m : map.entrySet()) {
            System.out.println(m.getKey() + " - " + m.getValue());
        }

        int minMap = Collections.min(map.values());
        int maxMap = Collections.max(map.values());

        System.out.println("Min = " + minMap + " Max = " + maxMap);

    }
}

