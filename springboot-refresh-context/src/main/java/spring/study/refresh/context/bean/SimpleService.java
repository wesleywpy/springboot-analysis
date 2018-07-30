package spring.study.refresh.context.bean;

import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

/**
 * 在ApplicationContext的refresh方法中的finishBeanFactoryInitialization方法作为逻辑入口, 实例化当前Bean
 * Created by Format on 2017/5/4.
 */
@Component
public class SimpleService {

    private String name = "simple";

    @PostConstruct
    public void start(){
        System.out.println("SimpleService.start()");
    }

    public SimpleService() {
        System.out.println("------ SimpleService constructor invoke");
    }

    public void test() {
        System.out.println(name);
    }

}
