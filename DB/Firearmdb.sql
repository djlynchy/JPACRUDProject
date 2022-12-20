-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema firearmdb
-- -----------------------------------------------------
-- First database	
DROP SCHEMA IF EXISTS `firearmdb` ;

-- -----------------------------------------------------
-- Schema firearmdb
--
-- First database	
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `firearmdb` DEFAULT CHARACTER SET utf8 ;
USE `firearmdb` ;

-- -----------------------------------------------------
-- Table `firearm`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `firearm` ;

CREATE TABLE IF NOT EXISTS `firearm` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `caliber` VARCHAR(45) NULL,
  `operation` VARCHAR(45) NULL,
  `action` VARCHAR(45) NULL,
  `capacity` VARCHAR(45) NULL,
  `type` VARCHAR(45) NULL,
  PRIMARY KEY (`id`, `name`))
ENGINE = InnoDB;

SET SQL_MODE = '';
DROP USER IF EXISTS gunowner@localhost;
SET SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
CREATE USER 'gunowner'@'localhost' IDENTIFIED BY 'gunowner';

GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE * TO 'gunowner'@'localhost';

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `firearm`
-- -----------------------------------------------------
START TRANSACTION;
USE `firearmdb`;
INSERT INTO `firearm` (`id`, `name`, `caliber`, `operation`, `action`, `capacity`, `type`) VALUES (1, 'M14', NULL, NULL, NULL, NULL, NULL);

COMMIT;

