package main.music;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component
public class JazzMusic implements Music {
    @PostConstruct
    public void before(){
        System.out.println("Происходит ининцализация");
    }
    @PreDestroy
    public void after(){
        System.out.println("Всё ломаеться");
    }
    @Override
    public String getSong() {
        return "My way";
    }
}
