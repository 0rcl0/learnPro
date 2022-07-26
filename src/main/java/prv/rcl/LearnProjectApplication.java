package prv.rcl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("prv.rcl.dao")
public class LearnProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnProjectApplication.class, args);
    }

}
