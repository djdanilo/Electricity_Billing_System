-- MySQL Script generated by MySQL Workbench
-- Tue Dec 19 15:56:00 2023
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema ebs
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema ebs
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `ebs` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `ebs` ;

-- -----------------------------------------------------
-- Table `ebs`.`bill`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ebs`.`bill` (
  `meter` VARCHAR(20) NULL DEFAULT NULL,
  `month` VARCHAR(20) NULL DEFAULT NULL,
  `units` VARCHAR(20) NULL DEFAULT NULL,
  `total_bill` VARCHAR(20) NULL DEFAULT NULL,
  `status` VARCHAR(20) NULL DEFAULT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `ebs`.`customer`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ebs`.`customer` (
  `name` VARCHAR(30) NULL DEFAULT NULL,
  `meter` VARCHAR(20) NULL DEFAULT NULL,
  `address` VARCHAR(50) NULL DEFAULT NULL,
  `city` VARCHAR(20) NULL DEFAULT NULL,
  `state` VARCHAR(30) NULL DEFAULT NULL,
  `email` VARCHAR(30) NULL DEFAULT NULL,
  `phone` VARCHAR(20) NULL DEFAULT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `ebs`.`login`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ebs`.`login` (
  `meter_no` VARCHAR(20) NULL DEFAULT NULL,
  `username` VARCHAR(30) NULL DEFAULT NULL,
  `name` VARCHAR(30) NULL DEFAULT NULL,
  `password` VARCHAR(30) NULL DEFAULT NULL,
  `user` VARCHAR(30) NULL DEFAULT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `ebs`.`meter_info`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ebs`.`meter_info` (
  `meter_number` VARCHAR(20) NULL DEFAULT NULL,
  `meter_location` VARCHAR(20) NULL DEFAULT NULL,
  `meter_type` VARCHAR(20) NULL DEFAULT NULL,
  `phase_code` VARCHAR(20) NULL DEFAULT NULL,
  `bill_type` VARCHAR(20) NULL DEFAULT NULL,
  `days` VARCHAR(20) NULL DEFAULT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `ebs`.`tax`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ebs`.`tax` (
  `cost_per_unit` VARCHAR(20) NULL DEFAULT NULL,
  `meter_rent` VARCHAR(20) NULL DEFAULT NULL,
  `service_charge` VARCHAR(20) NULL DEFAULT NULL,
  `service_tax` VARCHAR(20) NULL DEFAULT NULL,
  `swacch_bharat_cess` VARCHAR(20) NULL DEFAULT NULL,
  `fixed_tax` VARCHAR(20) NULL DEFAULT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
