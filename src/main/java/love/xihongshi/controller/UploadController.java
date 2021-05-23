package love.xihongshi.controller;

import love.xihongshi.bean.Msg;
import love.xihongshi.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @author LaoLiu <br/>
 * @Description <br/>
 * @create 2021-04-26 13:02 <br/>
 * @since JDK 1.8
 */
@Controller
public class UploadController {
    @Autowired
    private UploadService uploadService;

    @RequestMapping("/imgUpload")
    @ResponseBody
    public Msg imgUpload(@RequestParam(name = "upload") MultipartFile img) throws IOException {
        System.out.println("文件开始上传");

        String path = "/home/images/";
        File file = new File(path);
        if(!file.exists()){
            //创建文件夹
            file.mkdirs();
        }

        //说明上传文件项
        //获取到上传文件的名称
        String filename = img.getOriginalFilename();
        //把文件名称设置为唯一值
        String uuid = UUID.randomUUID().toString().replace("-", "");
        filename = uuid+filename;
        //完成文件上传
        img.transferTo(new File(path,filename));

        return Msg.success().add("resPath",
                "https://www.xihongshi.love/images/"+filename);
    }

}
