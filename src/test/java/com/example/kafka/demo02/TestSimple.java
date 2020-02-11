//package com.example.kafka.demo02;
//
//import com.example.kafka.Application;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.concurrent.TimeUnit;
//
//import static junit.framework.TestCase.assertTrue;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = {Application.class})
//public class TestSimple {
//
//    @Autowired
//    private Listener listener;
//
//    @Autowired
//    private KafkaTemplate<Integer, String> template;
//
//    @Test
//    public void testSimple() throws Exception {
//        template.send("annotated1", 0, "foo");
//        template.flush();
//        assertTrue(this.listener.latch1.await(10, TimeUnit.SECONDS));
//    }
//}
