package com.dorr.dev.pattern.princple.behavior.visitor;

public interface Element {

    // 接受访问
    void accept(Visitor visitor);

    // 访问时做什么
    void operation(Visitor visitor);

}
