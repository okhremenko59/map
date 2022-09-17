import java.util.HashMap;
import java.util.Map;

public class Main {

    static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor " +
            "incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation " +
            "ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in " +
            "voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non " +
            "proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        int all = text.length();
        Map<Character, Integer> map = new HashMap<>();
        int count = 0;
        int summ = 0;
        for (int i = 0; i < text.length(); i++) {
            if (map.containsKey(text.charAt(i))) {
                count = map.get(text.charAt(i));
                count++;
                map.put(text.charAt(i), count);
            } else map.put(text.charAt(i), count);
        }

        for (Map.Entry<Character, Integer> m : map.entrySet()) {
            System.out.println(m.getKey() + " - " + m.getValue());
            summ = summ + m.getValue();
        }
        System.out.println(all + " " + summ);
        System.out.println(text.charAt(0));


    }
}
