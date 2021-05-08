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
public class DemandOrderForm {
    private Long ofid;

    private Long did;

    private Long wid;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date releasedate;

    private String status;

    private String l1;

    private String l2;

    private String l3;
}