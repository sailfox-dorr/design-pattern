package com.dorr.dev.pattern.princple.mingle.commandandresponsechain.ls;

import com.dorr.dev.pattern.princple.mingle.commandandresponsechain.CommandVO;
import com.dorr.dev.pattern.princple.mingle.commandandresponsechain.FileManager;

public class LS_L extends AbstractLS {
    protected String echo(CommandVO vo) {
        return FileManager.ls_l(vo.getCommandName());
    }        //l参数

    protected String getOperateParam() {
        return super.L_PARAM;
    }
}