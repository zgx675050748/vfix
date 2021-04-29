package love.xihongshi.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

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

    private Date releasedate;

    private Long salesamount;

    private Long mid;

    private String l1;

    private String l2;

    private String l3;

    private String cintroduce;

    private Merchant merchant;

}