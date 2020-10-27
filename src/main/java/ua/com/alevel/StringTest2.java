package ua.com.alevel;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.*;
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

        Character[] charObjectArray = ArrayUtils.toObject(chars);

        String ss = Arrays
                .asList(charObjectArray).
                        stream()
                .distinct()
                .map(character -> character.toString())
                .map(character -> character.toUpperCase())
                .collect(Collectors.joining());

        System.out.println("ss = " + ss);


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
