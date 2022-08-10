package com.dorr.dev.pattern.princple.structure.composite;

import com.dorr.dev.pattern.princple.structure.composite.role.CEO;
import com.dorr.dev.pattern.princple.structure.composite.role.Oridinate;
import com.dorr.dev.pattern.princple.structure.composite.role.Manager;

public class CompositeDemo {
    /**
     *
     * @param args
     *
     *
     * 组合模式   异构数据使用同一种处理模式
     * ■ 需要描述对象的部分和整体的等级结构，如树形菜单、文件和文件夹管理。
     * ■ 需要客户端忽略个体构件和组合构件的区别，平等对待所有的构件。
     *
     */
    public static void main(String[] args) {

        CEO ceo = new CEO("马明哲", 80, 10000000.00);

        Manager ma1 = new Manager("凌海挺", 40, 800000.00);
        Manager ma2 = new Manager("张茜", 32, 200000.00);
        Manager ma3 = new Manager("凌寒", 57, 770000.00);
        ceo.add(ma1);
        ceo.add(ma2);
        ceo.add(ma3);

        Oridinate o1 = new Oridinate("小龙", 32, 50000.00);
        Oridinate o2 = new Oridinate("圭峰", 32, 50000.00);
        Oridinate o3 = new Oridinate("送春", 32, 50000.00);
        Oridinate o4 = new Oridinate("流溪", 32, 50000.00);
        Oridinate o5 = new Oridinate("文理", 32, 50000.00);

        ma1.add(o1);
        ma1.add(o2);

        ma2.add(o3);
        ma2.add(o4);

        ma3.add(o5);

        ceo.operation();

        for (Employee subordinate : ceo.getSubordinates()) {

            subordinate.operation();

            if (subordinate instanceof Composite){

                Composite subordinate1 = (Composite) subordinate;

                for (Employee subordinate1Subordinate : subordinate1.getSubordinates()) {
                    subordinate1Subordinate.operation();
                }
            }
        }

    }
}
