package com.dorr.dev.pattern.princple.mingle.commandandresponsechain.ls;

import com.dorr.dev.pattern.princple.mingle.commandandresponsechain.CommandVO;
import com.dorr.dev.pattern.princple.mingle.commandandresponsechain.FileManager;

public class LS extends AbstractLS {        //最简单的 ls命令

    protected String echo(CommandVO vo) {
        return FileManager.ls(vo.getCommandName());
    }        //参数为空

    protected String getOperateParam() {
        return super.DEFAULT_PARAM;
    }
}