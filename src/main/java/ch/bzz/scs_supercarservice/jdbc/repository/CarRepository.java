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
            where c.cityKpl between :cityKplStart and :cityKplEnd and c.classField = :classField and c.combinationKpl between :combinationKplStart and :combinationKplEnd and c.cylinders = :cylinders and c.displacement = :displacement and c.drive = :drive and c.fuelType = :fuelType and c.highwayKpl between :highwayKplStart and :highwayKplEnd and c.make = :make and c.model = :model and c.transmission = :transmission and c.year = :year""")
    List<Car> findByCityKplBetweenAndClassFieldAndCombinationKplBetweenAndCylindersAndDisplacementAndDriveAndFuelTypeAndHighwayKplBetweenAndMakeAndModelAndTransmissionAndYear(@Param("cityKplStart") Integer cityKplStart, @Param("cityKplEnd") Integer cityKplEnd, @Param("classField") String classField, @Param("combinationKplStart") Integer combinationKplStart, @Param("combinationKplEnd") Integer combinationKplEnd, @Param("cylinders") Integer cylinders, @Param("displacement") Float displacement, @Param("drive") String drive, @Param("fuelType") String fuelType, @Param("highwayKplStart") Integer highwayKplStart, @Param("highwayKplEnd") Integer highwayKplEnd, @Param("make") String make, @Param("model") String model, @Param("transmission") String transmission, @Param("year") Integer year, Pageable pageable);








}