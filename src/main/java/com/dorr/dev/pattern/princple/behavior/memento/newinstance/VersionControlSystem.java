package com.dorr.dev.pattern.princple.behavior.memento.newinstance;

import java.util.HashMap;
import java.util.Map;

public class VersionControlSystem {

    // 负责人角色
    private Map<String, BackUp> map = new HashMap<>();


    public void add(BackUp backUp) {

        map.put(backUp.getVersion(), backUp);

    }

    public BackUp get(String version) {

        return map.get(version);

    }


}
