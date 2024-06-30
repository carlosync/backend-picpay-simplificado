package com.foundationvip.picpaysimplificado.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "tb_wallet")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Wallet {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "full_name")
    private String fullName;

    @Column(unique = true)
    private String email;

    @Column(name = "cpf_cnpj", unique = true)
    private String cpfCnpj;

    private String password;

    private BigDecimal balance = BigDecimal.ZERO;

    @ManyToOne
    @JoinColumn(name = "wallet_type_id")
    private WalletType walletType;
}
