package com.yy.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by 2019/5/18.
 */
@Component
public class MyListener implements ApplicationListener<MyEvent> {
    public void onApplicationEvent(MyEvent event) {
        System.out.println("MyListener receive MyEvent param : "+event.getParam());
    }
}
