package com.github.abstarctkim;

import com.github.abstractkim.Peter;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class PeterRunner implements ApplicationRunner {
    @Autowired
    Peter peter;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(peter);
    }
}
