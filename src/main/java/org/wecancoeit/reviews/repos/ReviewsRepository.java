package org.wecancoeit.reviews.repos;

import org.springframework.data.repository.CrudRepository;
import org.wecancoeit.reviews.entities.Console;
import org.wecancoeit.reviews.entities.Reviews;

import java.util.Optional;

public interface ReviewsRepository extends CrudRepository<Reviews,Long> {
   // Optional<Reviews> findByNameIgnoreCase(String name);
}


