package com.foundationvip.picpaysimplificado.dto;

import com.foundationvip.picpaysimplificado.domain.Wallet;
import com.foundationvip.picpaysimplificado.domain.WalletType;

public record WalletDto( String fullName,
                         String cpfCnpj,
                         String email,
                         String password,
                         WalletType.EnumWalletType walletType) {


    public Wallet toWallet() {
        return new Wallet(
                fullName,
                cpfCnpj,
                email,
                password,
                walletType.get()
        );
    }
}
