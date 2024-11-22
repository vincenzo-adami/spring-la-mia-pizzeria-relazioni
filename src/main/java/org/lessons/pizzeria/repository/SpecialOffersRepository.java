package org.lessons.pizzeria.repository;

import org.lessons.pizzeria.model.SpecialOffer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecialOffersRepository extends JpaRepository<SpecialOffer, Long> {

}
