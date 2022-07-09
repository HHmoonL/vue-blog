package com.lnw.vueblog.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 刘 乃伟
 * @version 1.0
 * @des
 * @date 2022/7/9
 */
@Data
public class ComResult implements Serializable {
    private String code;
    private String msg;
    private Object data;
    public static ComResult succ(Object data) {
        ComResult m = new ComResult();
        m.setCode("200");
        m.setData(data);
        m.setMsg("操作成功");
        return m;
    }
    public static ComResult succ(String mess, Object data) {
        ComResult m = new ComResult();
        m.setCode("200");
        m.setData(data);
        m.setMsg(mess);
        return m;
    }
    public static ComResult fail(String mess) {
        ComResult m = new ComResult();
        m.setCode("-1");
        m.setData(null);
        m.setMsg(mess);
        return m;
    }
    public static ComResult fail(String mess, Object data) {
        ComResult m = new ComResult();
        m.setCode("-1");
        m.setData(data);
        m.setMsg(mess);
        return m;
    }
}
