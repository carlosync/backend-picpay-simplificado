package com.foundationvip.picpaysimplificado.repository;

import com.foundationvip.picpaysimplificado.domain.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WalletRepository extends JpaRepository<Wallet, Long> {
}