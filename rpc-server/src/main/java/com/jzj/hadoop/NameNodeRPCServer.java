package com.jzj.hadoop;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;

import java.io.IOException;

public class NameNodeRPCServer implements ClientProtocols {

    public void mkdir(String path) {
        System.out.println("执行创建文件夹"+path);
    }


    public static void main(String[] args) throws IOException {
        RPC.Server server = new RPC.Builder(new Configuration())
                .setBindAddress("localhost")
                .setPort(9999)
                .setProtocol(ClientProtocols.class)
                .setInstance(new NameNodeRPCServer())
                .build();

        server.start();

    }
}
