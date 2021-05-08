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
public class CommodityComment {
    private Long ccid;

    private Long cid;

    private Long uid;

    private String content;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date releasedate;

    private String l1;

    private String l2;

    private String l3;
}