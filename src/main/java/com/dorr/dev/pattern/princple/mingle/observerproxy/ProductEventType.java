package com.dorr.dev.pattern.princple.mingle.observerproxy;

public enum ProductEventType {        // 新建产品
    NEW_PRODUCT(1),        // 删除产品
    DEL_PRODUCT(2),        // 修改产品
    EDIT_PRODUCT(3),        // 克隆一个产品
    CLONE_PRODUCT(4);
    private int value = 0;

    private ProductEventType(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
