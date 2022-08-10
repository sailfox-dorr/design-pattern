package com.dorr.dev.pattern.princple.behavior.memento.newinstance;

public class Document {

    // 发起人角色

    private String content;
    private String version;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public BackUp save(){

        // 创建备份
        System.out.println("保存内容");
        return new BackUp(content,version);
    }


    // 恢复备份
    public void rollup(BackUp backUp){
        this.setContent(backUp.getContent());
        this.setVersion(backUp.getVersion());


    }

}
