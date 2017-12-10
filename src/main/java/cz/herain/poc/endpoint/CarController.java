package cz.herain.poc.endpoint;

import cz.herain.poc.dto.CarBrandDTO;
import cz.herain.poc.dto.CarDTO;
import cz.herain.poc.dto.CarForm;
import cz.herain.poc.entity.Car;
import cz.herain.poc.entity.CarBrand;
import cz.herain.poc.repository.CarBrandRepository;
import cz.herain.poc.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class CarController {

    private CarRepository carRepository;
    private CarBrandRepository carBrandRepository;

    @Autowired
    public CarController(final CarRepository carRepository, final CarBrandRepository carBrandRepository) {
        this.carRepository = carRepository;
        this.carBrandRepository = carBrandRepository;
    }

    @GetMapping(value = "/api/cars")
    public Flux<CarDTO> getCars() {
        return carRepository.findAll()
                .map(this::mapToDTO);
    }

    @GetMapping(value = "/api/car-brands")
    public Flux<CarBrandDTO> getCarsBrands() {
        return carBrandRepository.findAll()
                .map(this::mapToDTO);
    }

    @PostMapping(value = "/api/cars")
    public Mono<Void> createCar(@RequestBody CarForm carForm) {
        return carRepository.save(this.mapToEntity(carForm))
                .then();
    }

    @PostMapping(value = "/api/car-brands")
    public Mono<Void> createCarBrand(@RequestBody CarBrandDTO carBrandDTO) {
        return carBrandRepository.save(this.mapToEntity(carBrandDTO))
                .then();
    }

    private CarDTO mapToDTO(final Car entity) {
        if (entity == null) {
            return null;
        }

        final CarDTO dto = new CarDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setYear(entity.getYear());
        dto.setBrand(mapToDTO(entity.getCarBrand()));
        return dto;
    }

    private CarBrandDTO mapToDTO(final CarBrand entity) {
        if (entity == null) {
            return null;
        }

        final CarBrandDTO dto = new CarBrandDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setCountry(entity.getCountry());
        return dto;
    }

    private Car mapToEntity(final CarForm form) {
        if (form == null) {
            return null;
        }

        final Car car = new Car();
        car.setId(form.getId());
        car.setName(form.getName());
        car.setYear(form.getYear());
        car.setCarBrand(carBrandRepository.findById(form.getBrandId()).block());
        return car;
    }

    private CarBrand mapToEntity(final CarBrandDTO dto) {
        if (dto == null) {
            return null;
        }

        final CarBrand entity = new CarBrand();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setCountry(dto.getCountry());
        return entity;
    }
}
