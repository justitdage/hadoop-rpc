package com.jzj.hadoop;

public interface ClientProtocols {

    long versionID = 1234L;

    void mkdir(String path);

    void upload(String path);
}
