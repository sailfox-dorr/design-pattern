package com.dorr.dev.pattern.princple.structure.proxy;

import com.dorr.dev.pattern.princple.structure.proxy.dynamic.JDKProxy;

public class ProxyClient {
    /**
     * @param args 代理模式  职责清晰 扩展性高
     *             代理类可以在运行时才确定需要去代理的真实主题，这是一种强大的功能
     *             <p>
     *             <p>
     *             <p>
     *             1 主题接口类
     *             2 代理主题类
     *             3 实际执行类
     */

    public static void main(String[] args) {
        GamePlayer ga = new GamePlayer("许靖");
//        IGamePlayerProxy iGamePlayerProxy = new IGamePlayerProxy(ga);

        // JDK 动态代理需要 转化为接口
        IGamePlayer g2 = (IGamePlayer) new JDKProxy(ga).getProxyInstance();
        g2.killBoss();
        g2.upgrade();
    }
}
