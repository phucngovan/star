package com.phuc.star.service;

import com.phuc.star.model.Star;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface StarService {
    Page<Star> fillAll(Pageable pageable);
    void save(Star star);
    void remove(Long id);
    Star findById(Long id);
    Page<Star> findByName(String name,Pageable pageable);


}
