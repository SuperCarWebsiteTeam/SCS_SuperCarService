package ch.bzz.scs_supercarservice.jdbc.repository;

import ch.bzz.scs_supercarservice.jdbc.records.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Integer>, JpaSpecificationExecutor<Car> {
    @Query("""
            select c from Car c
            where c.fuelType = :fuelType and c.make = :make and c.model like :model and c.year = :year""")
    List<Car> findByFuelTypeAndMakeAndModelLikeAndYear(@Param("fuelType") String fuelType, @Param("make") String make, @Param("model") String model, @Param("year") Integer year);









}