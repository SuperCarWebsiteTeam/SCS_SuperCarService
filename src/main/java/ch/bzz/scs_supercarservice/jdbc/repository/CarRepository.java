package ch.bzz.scs_supercarservice.jdbc.repository;

import ch.bzz.scs_supercarservice.jdbc.records.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {
}