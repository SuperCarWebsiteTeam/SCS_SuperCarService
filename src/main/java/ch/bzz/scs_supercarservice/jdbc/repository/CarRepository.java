package ch.bzz.scs_supercarservice.jdbc.repository;

import ch.bzz.scs_supercarservice.jdbc.records.Car;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Integer>, JpaSpecificationExecutor<Car> {
    @Query("""
            select c from Car c
            where c.cityKpl = :cityKpl and c.classField = :classField and c.combinationKpl = :combinationKpl and c.cylinders = :cylinders and c.displacement = :displacement and c.drive = :drive and c.fuelType = :fuelType and c.highwayKpl = :highwayKpl and c.make = :make and c.model = :model and c.transmission = :transmission and c.year = :year""")
    List<Car> findByCityKplAndClassFieldAndCombinationKplAndCylindersAndDisplacementAndDriveAndFuelTypeAndHighwayKplAndMakeAndModelAndTransmissionAndYear(@Param("cityKpl") Integer cityKpl, @Param("classField") String classField, @Param("combinationKpl") Integer combinationKpl, @Param("cylinders") Integer cylinders, @Param("displacement") Float displacement, @Param("drive") String drive, @Param("fuelType") String fuelType, @Param("highwayKpl") Integer highwayKpl, @Param("make") String make, @Param("model") String model, @Param("transmission") String transmission, @Param("year") Integer year, Pageable pageable);






}