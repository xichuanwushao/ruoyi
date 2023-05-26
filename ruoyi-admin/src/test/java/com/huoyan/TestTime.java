package com.huoyan;

/**
 * @author : wuxiao
 * @date : 11:52 2022/12/14
 */

import com.ruoyi.RuoYiApplication;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author
 * @date 2022/9/19 8:25
 * @remark
 */

@SpringBootTest(classes = RuoYiApplication .class)
public class TestTime {


    @Test
    public void testhourTime(){
    }


    @Test
    public void testhourTime2(){
    }

    @Test
    public void fun8(){
        List<String> list = new ArrayList<>();
        list.add("赵云");
        list.add("黄忠");
        list.add("马超");
        list.add("关羽");
        list.add("张飞");
        // 筛选出不是“关羽” 的集合
        list = list.stream().filter(e -> !"关羽".equals(e)).collect(Collectors.toList());
        System.out.println("method4|list=" + list);

    }


    @Test
    public void testhourTime3(){
        System.out.println("method4|list=" );
    }
}
