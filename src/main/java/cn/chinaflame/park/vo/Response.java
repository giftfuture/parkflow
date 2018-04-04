package cn.chinaflame.park.vo;

import cn.chinaflame.park.model.Const;
import cn.chinaflame.park.util.Util;

public class Response {
	public int err = Const.FAILED.val();
    public int au = Const.UNREGISTERED.val();
    public String code;
    
    public void success() {
    	err = Const.SUCCESS.val();
    }
    
    public void timeout() {
    	err = Const.TIMEOUT.val();
    }
    
    public String toResp() {
    	return Util.toJson(this);
    }
    public String toJson() {
    	return Util.toJson(this);
    }


}
