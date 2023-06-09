SET FOREIGN_KEY_CHECKS = 0;

CREATE DATABASE IF NOT EXISTS `superCarStorage` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;

USE `superCarStorage`;

CREATE TABLE car(
                    id INT(11) NOT NULL AUTO_INCREMENT,
                    carName VARCHAR(50) NOT NULL,
                    brand INT(11) NOT NULL,
                    carPicture LONGBLOB NOT NULL,
                    carSpeed DOUBLE NOT NULL,
                    carAcceleration DOUBLE NOT NULL,
                    carPrice DOUBLE NOT NULL,
                    carMotorType INT NOT NULL,
                    carBuildYear DATE NOT NULL,
                    price INT(11) NOT NULL,
                    PRIMARY KEY (id)
);

CREATE TABLE brand(
                      brandId INT(11) NOT NULL AUTO_INCREMENT,
                      brandName VARCHAR(50) NOT NULL,
                      PRIMARY KEY (brandId)
);

ALTER TABLE car ADD FOREIGN KEY (brand) REFERENCES brand(brandId);
