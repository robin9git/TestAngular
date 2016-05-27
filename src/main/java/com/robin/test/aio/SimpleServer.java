package com.robin.test.aio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;
import java.util.concurrent.ExecutionException;



public class SimpleServer {

    public SimpleServer(int port) throws IOException {
        final AsynchronousServerSocketChannel listener = AsynchronousServerSocketChannel.open().bind(new InetSocketAddress(port));

        listener.accept(null, new CompletionHandler<AsynchronousSocketChannel, Void>() {
            public void completed(AsynchronousSocketChannel ch, Void att) {
                // ������һ������
                listener.accept(null, this);

                // ������ǰ����
                handle(ch);
            }

            public void failed(Throwable exc, Void att) {

            }
        });

    }

    public void handle(AsynchronousSocketChannel ch) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(32);
        try {
            ch.read(byteBuffer).get();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ExecutionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        byteBuffer.flip();
        System.out.println(byteBuffer.get());
        // Do something
    }
    
}