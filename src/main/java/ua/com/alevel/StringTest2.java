package ua.com.alevel;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Iehor Funtusov, created 27/10/2020 - 9:19 PM
 */
public class StringTest2 {

    String s = "IJKz1oUDuW\n" +
            "RlYIDqz69V\n" +
            "wkLeeNXiGz\n" +
            "hdxrA2Emkq\n" +
            "ILu3xvtCvo\n" +
            "2glzu8ZBlb\n" +
            "KQ6SRqJo0b\n" +
            "Q3zqZu8fmK\n" +
            "0JiLBYuYcg\n" +
            "ZB2yOSo8XT\n";

    char[] chars = s.toCharArray();

    public void run() {
        Map<Character, Integer> map = new HashMap<>();
        for (char aChar : chars) {
            if (map.get(aChar) == null) {
                map.put(aChar, 1);
            } else {
                Integer count = map.get(aChar);
                ++count;
                map.put(aChar, count);
            }
        }

        Map<Character, Integer> topTen =
                map.entrySet()
                        .stream()
                        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                        .collect(Collectors.toMap(
                                Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        topTen.forEach((key, value) -> System.out.println("key: " + key + " value: " + value));
    }
}
