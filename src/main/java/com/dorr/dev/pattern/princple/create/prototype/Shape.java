package com.dorr.dev.pattern.princple.create.prototype;

public abstract class Shape implements Cloneable {

    @Override
    protected Object clone()  {


        Object clone = null ;
        try {
            clone= super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;

    }


     abstract  void draw();




}
