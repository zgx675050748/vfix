package love.xihongshi.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Worker {
    private Long wid;

    private String skill;

    private String wname;

    private String phonenum;

    private Long uid;

    private String address;

    private String l3;

    private User user;
}