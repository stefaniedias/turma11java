-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema relacional_db
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema relacional_db
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `relacional_db` DEFAULT CHARACTER SET utf8 ;
USE `relacional_db` ;

-- -----------------------------------------------------
-- Table `relacional_db`.`pessoa`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `relacional_db`.`pessoa` (
  `id_pesssoa` INT NOT NULL,
  `nome_pessoa` VARCHAR(45) NULL,
  PRIMARY KEY (`id_pesssoa`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `relacional_db`.`carro`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `relacional_db`.`carro` (
  `idcarro` INT NOT NULL,
  `marca` VARCHAR(45) NULL,
  `ano` VARCHAR(45) NULL,
  `pessoa_id_pesssoa` INT NOT NULL,
  PRIMARY KEY (`idcarro`, `pessoa_id_pesssoa`),
  CONSTRAINT `fk_carro_pessoa`
    FOREIGN KEY (`pessoa_id_pesssoa`)
    REFERENCES `relacional_db`.`pessoa` (`id_pesssoa`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
