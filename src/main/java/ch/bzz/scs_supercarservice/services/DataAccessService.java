package ch.bzz.scs_supercarservice.services;

import ch.bzz.scs_supercarservice.jdbc.repository.CarRepository;
import com.scs.gen.v1.module.Car;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DataAccessService {

    private CarRepository carRepository;

    public DataAccessService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> getCars(Integer cityKpl, String classField, Integer combinationKpl, Integer cylinders, Float displacement, String drive, String fuelType, Integer highwayKpl, String make, String model, String transmission, Integer year, Integer limit) {
        List<ch.bzz.scs_supercarservice.jdbc.records.Car> cars = carRepository.findByCityKplAndClassFieldAndCombinationKplAndCylindersAndDisplacementAndDriveAndFuelTypeAndHighwayKplAndMakeAndModelAndTransmissionAndYear(cityKpl, classField, combinationKpl, cylinders, displacement, drive, fuelType, highwayKpl, make, model, transmission, year, Pageable.ofSize(limit));
        List<Car> responseCars = new ArrayList<>();
        for (ch.bzz.scs_supercarservice.jdbc.records.Car car: cars) {
            Car responseCar = new Car();
            responseCar.setCityKpl(car.getCityKpl());
            responseCar.setPropertyClass(car.getClassField());
            responseCar.setCombinationKpl(car.getCombinationKpl());
            responseCar.setCylinders(car.getCylinders());
            responseCar.setDisplacement(car.getDisplacement());
            responseCar.setDrive(car.getDrive());
            responseCar.setFuelType(car.getFuelType());
            responseCar.setHighwayKpl(car.getHighwayKpl());
            responseCar.setMake(car.getMake());
            responseCar.setModel(car.getModel());
            responseCar.setTransmission(car.getTransmission());
            responseCar.setYear(car.getYear());
            responseCars.add(responseCar);
        }
        return responseCars;
    }

}
