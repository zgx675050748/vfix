package love.xihongshi.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

/**
 * @author LaoLiu <br/>
 * @Description 通用的返回格式 <br/>
 * @create 2021-03-17 14:08 <br/>
 * @since JDK 1.8
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Msg {
    //状态码
    private int code;
    //提示信息
    private String msg;
    //用户要返回给浏览器的数据
    private Map<String,Object> extend = new HashMap<>();

    public static Msg success(){
        Msg msg = new Msg();
        msg.setCode(100);
        msg.setMsg("处理成功！");
        return msg;
    }

    public static Msg fail(){
        Msg msg = new Msg();
        msg.setCode(200);
        msg.setMsg("处理失败！");
        return msg;
    }

    public Msg add(String key, Object value){
        this.getExtend().put(key,value);
        return this;
    }
}
