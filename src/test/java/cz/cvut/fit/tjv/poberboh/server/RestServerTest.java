package cz.cvut.fit.tjv.poberboh.server;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = RestServer.class, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class RestServerTest {

    @Test
    void contextLoads() {
    }
}