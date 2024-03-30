package com.esrabudak.odev1.repository;

import com.esrabudak.odev1.entity.Kitap;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface KitapRepository extends JpaRepository<Kitap, Long> {
}
