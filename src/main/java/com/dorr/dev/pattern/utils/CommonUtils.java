package com.dorr.dev.pattern.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommonUtils {

    /**
     * @param t
     * @param <T>
     * @return 获取对象的类名
     */
    public static <T> String getClassName(T t) {
        String[] split = t.getClass().getName().split("\\.");
        return split[split.length - 1];

    }

    public static boolean isChinese(char c) {

        Character.UnicodeBlock ub = Character.UnicodeBlock.of(c);

        if (ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS || ub == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS

                || ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A

                || ub == Character.UnicodeBlock.GENERAL_PUNCTUATION || ub == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION

                || ub == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS) {

            return true;

        }

        return false;

    }

    public static String translateCode(String strName) {
        StringBuilder sb = new StringBuilder();

        char[] ch = strName.toCharArray();

        for (int i = 0; i < ch.length - 1; i++) {

            char c = ch[i];

            if (isChinese(c) == true && isChinese(ch[i + 1]) == false) {

                sb.append(ch[i]).append('\n');

            } else {
                sb.append(ch[i]);
            }
        }
        sb.append(ch[ch.length - 1]);
        return sb.toString();

    }

    public static void main(String[] args) throws IOException {


        while (true){
            System.out.print("dorr@sailfox #  ");
            System.out.println(translateCode(new BufferedReader(new InputStreamReader(System.in)).readLine()));

        }

    }

}
