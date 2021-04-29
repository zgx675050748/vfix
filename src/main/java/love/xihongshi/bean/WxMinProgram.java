package love.xihongshi.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author LaoLiu <br/>
 * @Description <br/>
 * @create 2021-04-24 14:49 <br/>
 * @since JDK 1.8
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WxMinProgram {
    private String appId;
    private String AppSecret;
}
