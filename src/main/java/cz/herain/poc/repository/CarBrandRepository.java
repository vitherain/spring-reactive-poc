package cz.herain.poc.repository;

import cz.herain.poc.entity.CarBrand;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;

public interface CarBrandRepository extends ReactiveCrudRepository<CarBrand, String>, ReactiveSortingRepository<CarBrand, String> {
}
