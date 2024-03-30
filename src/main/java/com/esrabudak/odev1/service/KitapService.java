package com.esrabudak.odev1.service;

import com.esrabudak.odev1.entity.Kitap;
import com.esrabudak.odev1.repository.KitapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface KitapService {

    List<Kitap> getKitaplar();

    Kitap getKitapById(Long id);

    Kitap addKitap(Kitap kitap);

    Kitap updateKitap(Long id, Kitap kitap);

    void deleteKitap(Long id);

}
