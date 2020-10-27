package ua.com.alevel;

import org.apache.commons.lang3.StringUtils;

/**
 * @author Iehor Funtusov, created 27/10/2020 - 7:46 PM
 */

public class StringTest {

    public void test() {











        String ss = "ytyt";
        System.out.println("ss = " + ss);
        ss = ss.replace("y", "123");
        System.out.println("ss = " + ss);






        System.out.println("ss = " + ss);
        System.out.println("ss = " + ss.length());
        ss = ss.trim();
        System.out.println("ss = " + ss);
        System.out.println("ss = " + ss.length());
        System.out.println("ss = " + ss.isEmpty());
        System.out.println("ss = " + ss.isBlank());

        System.out.println("ss = " + StringUtils.isNotEmpty(ss));
        System.out.println("ss = " + StringUtils.isNotBlank(ss));







        String s = "hgpiffdslkjaf";
        String s1 = "lk;jfdsafd";

        String rev = StringUtils.reverse(s);
        System.out.println("rev = " + rev);

        String[] strings = s1.split(";");
        for (String string : strings) {
            System.out.println("string = " + string);
        }

        StringBuilder builder = new StringBuilder(s);
        StringBuffer buffer = new StringBuffer(s);


//        String name = "Vika";
        String email = "vika@gmail.com";
        String emailReg = "gmail";

        int sobaka = email.indexOf("@");
        String emailSub = email.substring(0, sobaka);
        System.out.println("emailSub = " + emailSub);

        int gmail = email.indexOf(emailReg);
        System.out.println("gmail = " + email.substring(gmail, gmail + emailReg.length()));


        String s2 = s.substring(3, 6);
        System.out.println("s2 = " + s2);

        // startsWith and startsWith
        if (s.startsWith("hgp if")) {
            System.out.println("startsWith");
        } else {
            System.out.println("not startsWith");
        }

        if (s.endsWith("udsaf")) {
            System.out.println("c");
        } else {
            System.out.println("not endsWith");
        }

        // size
        char[] chars = s.toCharArray();
        System.out.println("chars = " + chars.length);
        System.out.println("s = " + s.length());

        // contains
        if (s.contains("G")) {
            System.out.println("contains");
        } else {
            System.out.println("not contains");
        }

        if (StringUtils.containsIgnoreCase(s, "G")) {
            System.out.println("containsIgnoreCase");
        } else {
            System.out.println("not containsIgnoreCase");
        }

        int index = s.indexOf("g");
        System.out.println("index = " + index);

        // equals
        if (s.equals(s1)) {
            System.out.println("equals");
        } else {
            System.out.println("not equals");
        }

        // concat
        s = s + " " + s1;

        System.out.println("s = " + s);
    }
}
