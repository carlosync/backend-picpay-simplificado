package com.foundationvip.picpaysimplificado.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_wallet_type")
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class WalletType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;


    public enum EnumWalletType {

        USER(1L, "user"),
        MERCHANT(2L, "merchant");

        EnumWalletType(Long id, String description) {
            this.id = id;
            this.description = description;
        }

        private Long id;
        private String description;

        public WalletType get(){
            return new WalletType(id, description);
        }
    }
}
