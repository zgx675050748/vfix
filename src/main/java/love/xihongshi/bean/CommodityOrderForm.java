package love.xihongshi.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CommodityOrderForm {
    private Long ofid;

    private Long cid;

    private Long uid;

    private String address;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date releasedate;

    private Integer count;

    private Double money;

    private String phonenum;

    private String comment;

    private Commodity commodity;

    private User user;
}