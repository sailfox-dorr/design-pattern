package com.dorr.dev.pattern.princple.mingle.observerproxy;

public class Beggar extends EventCustomer {
    public Beggar() {
        super(ProductEventType.DEL_PRODUCT);
    }

    public void exec(ProductEvent event) {
        Product p = event.getSource();            //事件类型            ProductEventType type=event.getEventType();            System.out.println("乞丐处理事件："+p.getName()+"销毁，事件类型="+type);        }    }
    }
}