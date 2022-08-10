package com.dorr.dev.pattern.princple.behavior.visitor;

import com.dorr.dev.pattern.utils.CommonUtils;

public class Element1 implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void operation(Visitor visitor) {

        System.out.println(CommonUtils.getClassName(visitor) + " visited " + CommonUtils.getClassName(this) + " !");
    }


}
