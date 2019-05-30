package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class app {
    public static void main(String[] args) {
        SpringApplication.run(app.class, args);
    }
    @RequestMapping("/hello")
    @ResponseBody
    public String hello()
    {
        return "hello";
    }
    @RequestMapping("/index")
    public String index()
    {
        return "index";
    }

    @RequestMapping("/time")
    @ResponseBody
    public mytime time()
    {
        mytime mytime=new mytime();
        mytime.setTime(System.currentTimeMillis());
        return mytime;
    }
}
