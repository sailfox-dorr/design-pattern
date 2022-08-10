package com.dorr.dev.pattern.princple.mingle.observerproxy;

public class Product implements Cloneable {        //产品名称
    private String name;        //属性是否可以变更
    private boolean canChange = false;        //产生一个新的产品

    public Product(ProductManager manager, String name) {            //允许建立产品
        if (manager.isCreateProduct()) {
            canChange = true;
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (canChange) {
            this.name = name;
        }
    }        //重写克隆方法

    public Product clone() {
        Product p = null;
        try {
            p = (Product) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}