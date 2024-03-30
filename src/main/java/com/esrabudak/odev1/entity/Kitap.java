package com.esrabudak.odev1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Kitap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String kitap_adi;
    private String yazar_adi;

    // Getter ve setter metotları
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getkitap_adi() {
        return kitap_adi;
    }

    public void setAd(String kitap_adi) {
        this.kitap_adi = kitap_adi;
    }

    public String getyazar_adi() {
        return yazar_adi;
    }

    public void setYazar(String yazar_adi) {
        this.yazar_adi = yazar_adi;
    }



}
