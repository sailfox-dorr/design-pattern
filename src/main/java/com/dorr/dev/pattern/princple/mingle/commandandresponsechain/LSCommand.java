package com.dorr.dev.pattern.princple.mingle.commandandresponsechain;

import com.dorr.dev.pattern.princple.mingle.commandandresponsechain.ls.AbstractLS;

public class LSCommand extends Command {
    // ls command 为 command 类
    public String execute(CommandVO vo) {            //返回链表的首节点
        return super.buildChain(AbstractLS.class).get(0).handleMessage(vo);
    }
}