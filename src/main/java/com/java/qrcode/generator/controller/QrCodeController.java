package com.java.qrcode.generator.controller;

import com.java.qrcode.generator.dto.QrCodeGeneratorRequestDTO;
import com.java.qrcode.generator.dto.QrCodeGeneratorResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/qrcode")
public class QrCodeController {

    @PostMapping
    public ResponseEntity<QrCodeGeneratorResponseDTO> generate(@RequestBody QrCodeGeneratorRequestDTO request) {
        return null;
    }
}
