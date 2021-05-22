package love.xihongshi.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * @author LaoLiu <br/>
 * @Description <br/>
 * @create 2021-05-12 21:18 <br/>
 * @since JDK 1.8
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SearchCommodityOrderForm {
    private Long uid;
    private String releaseDate;
    private String cname;
    private String money;
}
