package org.example.superbnb.repositories;

import org.example.superbnb.entities.flat.HolidayFlat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HolidayFlatRepository extends JpaRepository<HolidayFlat, Long> {
}
