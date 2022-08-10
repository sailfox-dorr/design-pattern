package com.dorr.dev.pattern.princple.mingle.observerproxy;

//产品管理类（工厂类）
public class ProductManager {        //是否可以创建一个产品
    private boolean isPermittedCreate = false;        //建立一个产品

    public Product createProduct(String name) {            //首先修改权限，允许创建
        isPermittedCreate = true;
        Product p = new Product(this, name);            //产生一个创建事件
        new ProductEvent(p, ProductEventType.NEW_PRODUCT);
        return p;
    }        //销毁产品

    public void abandonProduct(Product p) {            //产生一个删除事件
        new ProductEvent(p, ProductEventType.DEL_PRODUCT);
        p = null;
    }        //修改产品

    public void editProduct(Product p, String name) {
        p.setName(name);            //产生一个修改事件
        new ProductEvent(p, ProductEventType.EDIT_PRODUCT);
    }        //获取是否可以创建一个产品

    public boolean isCreateProduct() {
        return isPermittedCreate;
    }        //克隆一个产品

    public Product clone(Product p) {            //产生一个克隆事件
        new ProductEvent(p, ProductEventType.CLONE_PRODUCT);
        return p.clone();
    }
}