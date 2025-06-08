package com.java.qrcode.generator.controller;

import com.java.qrcode.generator.dto.QrCodeGeneratorRequestDTO;
import com.java.qrcode.generator.dto.QrCodeGeneratorResponseDTO;
import com.java.qrcode.generator.service.QrCodeGeneratorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/qrcode")
public class QrCodeController {

    private final QrCodeGeneratorService qrCodeGeneratorService;

    public QrCodeController(QrCodeGeneratorService qrCodeGeneratorService) {
        this.qrCodeGeneratorService = qrCodeGeneratorService;
    }

    @PostMapping
    public ResponseEntity<QrCodeGeneratorResponseDTO> generate(@RequestBody QrCodeGeneratorRequestDTO request) {
        try {
            QrCodeGeneratorResponseDTO response = qrCodeGeneratorService.generateAndUploadQrCode(request.text());
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError()
                    .body(new QrCodeGeneratorResponseDTO("Error generating QR code: " + e.getMessage()));
        }
    }
}
