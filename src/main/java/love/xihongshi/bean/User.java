package love.xihongshi.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    private Long uid;

    private String wid;

    private String nickName;

    private String avatarUrl;

    private Integer gender;

    private String province;

    private String city;

    private Integer userFlag;

    private Integer workerFlag;

    private Integer merchantFlag;
}