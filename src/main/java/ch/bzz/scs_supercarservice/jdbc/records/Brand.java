package ch.bzz.scs_supercarservice.jdbc.records;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "brand")
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "brandId", nullable = false)
    private Integer id;

    @Size(max = 50)
    @NotNull
    @Column(name = "brandName", nullable = false, length = 50)
    private String brandName;

}