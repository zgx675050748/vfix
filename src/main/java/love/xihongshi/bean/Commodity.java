package love.xihongshi.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Commodity {
    private Long cid;

    private String cname;

    private BigDecimal price;

    private String type;

    private Long amount;

    private String status;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date releasedate;

    private Long salesamount;

    private Long mid;

    private String iconUrl;

    private String l2;

    private String l3;

    private String cintroduce;

    private Merchant merchant;

}