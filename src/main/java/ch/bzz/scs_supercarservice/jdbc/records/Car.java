package ch.bzz.scs_supercarservice.jdbc.records;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "city_kpl", nullable = false)
    private Integer cityKpl;

    @Size(max = 255)
    @NotNull
    @Column(name = "class", nullable = false)
    private String classField;

    @NotNull
    @Column(name = "combination_kpl", nullable = false)
    private Integer combinationKpl;

    @NotNull
    @Column(name = "cylinders", nullable = false)
    private Integer cylinders;

    @NotNull
    @Column(name = "displacement", nullable = false)
    private Float displacement;

    @Size(max = 3)
    @NotNull
    @Column(name = "drive", nullable = false, length = 3)
    private String drive;

    @Size(max = 50)
    @NotNull
    @Column(name = "fuel_type", nullable = false, length = 50)
    private String fuelType;

    @NotNull
    @Column(name = "highway_kpl", nullable = false)
    private Integer highwayKpl;

    @Size(max = 50)
    @NotNull
    @Column(name = "make", nullable = false, length = 50)
    private String make;

    @Size(max = 50)
    @NotNull
    @Column(name = "model", nullable = false, length = 50)
    private String model;

    @Size(max = 50)
    @NotNull
    @Column(name = "transmission", nullable = false, length = 50)
    private String transmission;

    @NotNull
    @Column(name = "year", nullable = false)
    private Integer year;

}