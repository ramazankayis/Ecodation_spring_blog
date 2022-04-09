
-- create database
CREATE SCHEMA `springboot` DEFAULT CHARACTER SET utf8 COLLATE utf8_turkish_ci ;

-- databse chooise
use springboot;

-- Insert
INSERT INTO `springboot`.`admin` (`name`, `surname`) VALUES ('ramazan2', 'kayis2');
-- delete

-- update

-- select

-- PrimaryKey : birincil anahtar(esas anahtar)
-- ForeignKey : ikincil anahtar (başkasının primary key)

-- create table
CREATE TABLE `springboot`.`admin` (
`id` INT NOT NULL AUTO_INCREMENT,
`name` VARCHAR(150) NULL DEFAULT 'adi girilmedi',
`surname` VARCHAR(150) NULL DEFAULT 'soyadi girilmedi',
`created_date` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
PRIMARY KEY (`id`));

