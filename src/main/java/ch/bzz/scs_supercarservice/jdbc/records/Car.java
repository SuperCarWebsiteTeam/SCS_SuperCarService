package ch.bzz.scs_supercarservice.jdbc.records;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 50)
    @NotNull
    @Column(name = "carName", nullable = false, length = 50)
    private String carName;

    @NotNull
    @Column(name = "carPicture", nullable = false)
    private byte[] carPicture;

    @NotNull
    @Column(name = "carSpeed", nullable = false)
    private Double carSpeed;

    @NotNull
    @Column(name = "carAcceleration", nullable = false)
    private Double carAcceleration;

    @NotNull
    @Column(name = "carPrice", nullable = false)
    private Double carPrice;

    @NotNull
    @Column(name = "carMotorType", nullable = false)
    private Integer carMotorType;

    @NotNull
    @Column(name = "carBuildYear", nullable = false)
    private LocalDate carBuildYear;

    @NotNull
    @Column(name = "price", nullable = false)
    private Integer price;

}