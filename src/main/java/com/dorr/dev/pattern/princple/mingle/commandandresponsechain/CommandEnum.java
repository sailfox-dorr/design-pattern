package com.dorr.dev.pattern.princple.mingle.commandandresponsechain;

import java.util.ArrayList;
import java.util.List;

public enum CommandEnum {
    ls("com.dorr.dev.pattern.princple.mingle.commandandresponsechain.LSCommand");
    private String value = "";        //定义构造函数，目的是与Data(value)类型相匹配

    private CommandEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }        //返回所有的



    public static List<String> getNames() {
        CommandEnum[] commandEnum = CommandEnum.values();
        List<String> names = new ArrayList<String>();
        for (CommandEnum c : commandEnum) {
            names.add(c.name());
        }
        return names;
    }
}