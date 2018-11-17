package com.phuc.star.repository;

import com.phuc.star.model.Star;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface StarRepository extends PagingAndSortingRepository<Star,Long> {
    Page<Star> findAllByNameContaining(String name, Pageable pageable);
}
