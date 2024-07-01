package com.foundationvip.picpaysimplificado.service;

import com.foundationvip.picpaysimplificado.domain.Wallet;
import com.foundationvip.picpaysimplificado.dto.WalletDto;
import com.foundationvip.picpaysimplificado.exception.WallatDataAlreadyExistsExecption;
import com.foundationvip.picpaysimplificado.repository.WalletRepository;
import org.springframework.stereotype.Service;

@Service
public class WalletService {

    private final WalletRepository walletRepository;

    public WalletService(WalletRepository walletRepository) {
        this.walletRepository = walletRepository;
    }

    public Wallet createWallet(WalletDto walletDto) {
        var walletdb = walletRepository.findByCpfCnpjOrEmail(walletDto.cpfCnpj(), walletDto.email());
        if(walletdb.isPresent()) {
            throw new WallatDataAlreadyExistsExecption("CpfCnpJ or Email already exists");
        }

        return walletRepository.save(walletDto.toWallet());
    }
}
