package com.esrabudak.odev1.controller;

import com.esrabudak.odev1.entity.Kitap;
import com.esrabudak.odev1.service.KitapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/kitaplar")
public class KitapController {

    private final KitapService kitapService;

    @Autowired
    public KitapController(KitapService kitapService) {
        this.kitapService = kitapService;
    }

    @GetMapping
    public ResponseEntity<List<Kitap>> getKitaplar() {
        List<Kitap> kitaplar = kitapService.getKitaplar();
        return new ResponseEntity<>(kitaplar, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Kitap> getKitapById(@PathVariable Long id) {
        Kitap kitap = kitapService.getKitapById(id);
        return new ResponseEntity<>(kitap, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Kitap> addKitap(@RequestBody Kitap kitap) {
        Kitap savedKitap = kitapService.addKitap(kitap);
        return new ResponseEntity<>(savedKitap, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Kitap> updateKitap(@PathVariable Long id, @RequestBody Kitap kitap) {
        Kitap updatedKitap = kitapService.updateKitap(id, kitap);
        return new ResponseEntity<>(updatedKitap, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteKitap(@PathVariable Long id) {
        kitapService.deleteKitap(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
