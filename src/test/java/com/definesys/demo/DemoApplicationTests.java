package com.definesys.demo;

import com.definesys.mpaas.query.MpaasQueryFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
    @Autowired

    private MpaasQueryFactory sw;

    @Test
    void contextLoads() {

    }

}
