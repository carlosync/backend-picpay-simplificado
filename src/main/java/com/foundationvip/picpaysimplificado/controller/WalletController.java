package com.foundationvip.picpaysimplificado.controller;

import com.foundationvip.picpaysimplificado.domain.Wallet;
import com.foundationvip.picpaysimplificado.dto.WalletDto;
import com.foundationvip.picpaysimplificado.service.WalletService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class WalletController {

    private final WalletService walletService;

    public WalletController(WalletService walletService) {
        this.walletService = walletService;
    }

    @PostMapping("/wallets")
    public ResponseEntity<Wallet> createWallet(@RequestBody WalletDto walletDto) {
        var wallet = walletService.createWallet(walletDto);
        return ResponseEntity.ok(wallet);
    }
}
