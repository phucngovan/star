package com.phuc.star.service.Impl;

import com.phuc.star.model.Star;
import com.phuc.star.repository.StarRepository;
import com.phuc.star.service.StarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class StarServiceImpl implements StarService {
@Autowired
    private StarRepository starRepository;

    @Override
    public Page<Star> fillAll(Pageable pageable) {
        return starRepository.findAll(pageable);
    }

    @Override
    public void save(Star star) {
        starRepository.save(star);

    }

    @Override
    public void remove(Long id) {
        starRepository.deleteById(id);

    }

    @Override
    public Star findById(Long id) {
        return starRepository.findById(id).orElse(null);
    }

    @Override
    public Page<Star> findByName(String name, Pageable pageable) {
        return starRepository.findAllByNameContaining(name,pageable);
    }
}
