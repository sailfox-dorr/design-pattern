package com.dorr.dev.pattern.princple.mingle.commandandresponsechain.ls;

import com.dorr.dev.pattern.princple.mingle.commandandresponsechain.CommandVO;
import com.dorr.dev.pattern.princple.mingle.commandandresponsechain.FileManager;

public class LS_A extends AbstractLS {        //ls -a命令
    protected String echo(CommandVO vo) {
        return FileManager.ls_a(vo.getCommandName());
    }

    protected String getOperateParam() {
        return super.A_PARAM;
    }
}