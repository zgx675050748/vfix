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
public class Demand {
    private Long did;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date releasedate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date enddate;

    private String dstatus;

    private Long uid;

    private String phonenum;

    private String shortcut;

    private String content;

    private String address;

    private User user;
}