package com.foundationvip.picpaysimplificado.repository;

import com.foundationvip.picpaysimplificado.domain.WalletType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WalletTypeRepository extends JpaRepository<WalletType, Long> {
}
