package love.xihongshi.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Merchant {
    private Long mid;

    private String mname;

    private String status;

    private String address;

    private String principalname;

    private String idcard;

    private String phonenum;

    private Long uid;

    private String l2;

    private String l3;

    private User user;


}