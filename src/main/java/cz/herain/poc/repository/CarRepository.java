package cz.herain.poc.repository;

import cz.herain.poc.entity.Car;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;

public interface CarRepository extends ReactiveCrudRepository<Car, String>, ReactiveSortingRepository<Car, String> {
}
