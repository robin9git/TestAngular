package com.robin.test.aio;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

import org.junit.Test;

public class AIOTest {
    
    @Test
    public void testServer() throws IOException, InterruptedException {
        SimpleServer server = new SimpleServer(7788);
        
        Thread.sleep(10000);
    }
    
    @Test
    public void testClient() throws IOException, InterruptedException, ExecutionException {
    	Thread.sleep(2000);
//        SimpleClient client = new SimpleClient("localhost", 7788);
        SimpleClient client = new SimpleClient("127.0.0.1", 7788);
        client.write((byte) 11);
    }

}