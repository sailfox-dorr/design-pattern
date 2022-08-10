package com.dorr.dev.pattern.princple.behavior.memento.newinstance;

public class BackUp {

    // 备忘录角色

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

    public BackUp(String content, String version) {
        this.content = content;
        this.version = version;
    }
}
