package com.java.qrcode.generator.ports;

public interface StoragePorts {
    String uploadFile(byte[] file, String fileName, String contentType);
}
