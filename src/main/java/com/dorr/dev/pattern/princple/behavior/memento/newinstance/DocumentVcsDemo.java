package com.dorr.dev.pattern.princple.behavior.memento.newinstance;

public class DocumentVcsDemo {
    /**
     *
     * @param args
     *
     *
     * 根据备忘录模式创建的一个版本控制工具
     */
    public static void main(String[] args) {

        Document document = new Document();
        document.setVersion("1.1");
        document.setContent("准备裁员");
        VersionControlSystem vsc = new VersionControlSystem();

        vsc.add(document.save());

        document.setVersion("1.2");
        document.setContent("准备招人");

        vsc.add(document.save());


        document.setVersion("1.3");
        document.setContent("准备杀人");

        vsc.add(document.save());

        document.rollup(vsc.get("1.2"));

        System.out.println(vsc.get("1.2").getContent());
        System.out.println(vsc.get("1.1").getContent());
        System.out.println(document.getVersion());


    }
}
