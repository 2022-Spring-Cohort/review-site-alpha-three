package org.wecancoeit.reviews.repos;

import org.springframework.data.repository.CrudRepository;
import org.wecancoeit.reviews.entities.Console;
import org.wecancoeit.reviews.entities.Manufacturer;

public interface ManufacturerRepository extends CrudRepository<Manufacturer,Long> {
}
