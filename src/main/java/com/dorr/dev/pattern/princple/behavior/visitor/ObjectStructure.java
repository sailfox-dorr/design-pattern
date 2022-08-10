package com.dorr.dev.pattern.princple.behavior.visitor;

import java.util.Vector;

public class ObjectStructure {


    private Vector<Element> elements = new Vector<>();



    public void add(Element element){

        elements.add(element);
    }

    public void action(Visitor visitor){

        for (Element element : elements) {
            element.accept(visitor);
        }
    }


}
