package ch.bzz.scs_supercarservice.controller;

import ch.bzz.scs_supercarservice.ScsSuperCarServiceApplication;
import ch.bzz.scs_supercarservice.services.DataAccessService;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.scs.gen.v1.module.Car;
import com.scs.gen.v1.controller.V1Api;

import javax.validation.Valid;
import java.util.List;

@RestController
public class CarController implements V1Api {

    @Autowired
    DataAccessService dataAccessService;

    @Override
    public ResponseEntity<List<Car>> getAllCars( String make, String model, String fuelType, Integer year) {

        return new ResponseEntity<>(dataAccessService.getCars(fuelType, make, model, year), HttpStatus.OK);
    }


}
