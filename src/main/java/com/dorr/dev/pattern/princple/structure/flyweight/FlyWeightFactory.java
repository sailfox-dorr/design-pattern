package com.dorr.dev.pattern.princple.structure.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {
    private FlyWeightFactory() {
    }

    // 池容器  由于池容器的存在 将对象区分了 内部对象和外部对象
    private static Map<String, FlyWeight> cache = new HashMap<String, FlyWeight>();

   // 获取池对象
    public static FlyWeight get(String sts) {

        FlyWeight flyWeight = cache.get(sts);
        if (flyWeight == null) {

            flyWeight = new ConcreteFlyWeight(sts);
            cache.put(sts, flyWeight);
        }
        return flyWeight;
    }
}
