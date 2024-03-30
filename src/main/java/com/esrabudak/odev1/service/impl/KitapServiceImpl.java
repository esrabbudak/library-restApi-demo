package com.esrabudak.odev1.service.impl;

import com.esrabudak.odev1.entity.Kitap;
import com.esrabudak.odev1.repository.KitapRepository;
import com.esrabudak.odev1.service.KitapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KitapServiceImpl implements KitapService {

    private final KitapRepository kitapRepository;

    @Autowired
    public KitapServiceImpl(KitapRepository kitapRepository) {
        this.kitapRepository = kitapRepository;
    }

    @Override
    public List<Kitap> getKitaplar() {
        return kitapRepository.findAll();
    }

    @Override
    public Kitap getKitapById(Long id) {
        return kitapRepository.findById(id).orElse(null);
    }

    @Override
    public Kitap addKitap(Kitap kitap) {
        return kitapRepository.save(kitap);
    }

    @Override
    public Kitap updateKitap(Long id, Kitap kitap) {
        if (kitapRepository.existsById(id)) {
            kitap.setId(id);
            return kitapRepository.save(kitap);
        }
        return null;
    }

    @Override
    public void deleteKitap(Long id) {
        kitapRepository.deleteById(id);
    }
}
