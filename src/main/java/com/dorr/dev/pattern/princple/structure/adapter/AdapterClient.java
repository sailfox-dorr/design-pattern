package com.dorr.dev.pattern.princple.structure.adapter;

public class AdapterClient {
    public static void main(String[] args) {
      // 适配器模式  将已经有的接口转化为客户端想要的接口

        Target adapter = new Adapter();

        adapter.request();

    }
}
