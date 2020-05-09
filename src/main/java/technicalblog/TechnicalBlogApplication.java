package technicalblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import technicalblog.service.PostService;

@SpringBootApplication

//@ComponentScan({"technicalblog.service.PostService","technicalblog.model.Post"})
//
//public class TechnicalBlogApplication extends SpringBootServletInitializer {
//
//    @Override protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//        return builder.sources(TechnicalBlogApplication.class);
//    }
//
//    public static void main(String[] args) {
//        SpringApplication.run(TechnicalBlogApplication.class, args);
//    }
//
//}

//@ComponentScan
public class TechnicalBlogApplication {

    public static void main(String [] args){
        SpringApplication.run(TechnicalBlogApplication.class, args);
    }

}
