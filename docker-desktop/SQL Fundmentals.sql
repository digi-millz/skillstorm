-- Get first and last name
SELECT first_name, last_name FROM actor;
-- WHERE Clause
SELECT * FROM film WHERE film_id = 1;
-- Comparision Operators
SELECT * FROM film WHERE replacement_cost <= 12.99;
SELECT * FROM film WHERE replacement_cost <> 12.99;
-- Between Operator
SELECT * FROM payment WHERE amount BETWEEN 0.99 AND 2.99;
SELECT * FROM payment WHERE payment_date BETWEEN "2005-05-20" AND "2005-05-25";
-- LIKE Operator for Patten Match
SELECT * FROM customer WHERE first_name LIKE 'A%'; -- Wildcard % After, Begins with A
SELECT * FROM customer WHERE first_name LIKE '%Z%'; -- Wildcard % Around, Find any
SELECT * FROM customer WHERE first_name LIKE 'MAR_'; -- Wildcard _ Match single charater(s)
-- CRUD --
-- INSERT INTO table_name WHERE PK = #; 
-- UPDATE table_name SET amount = val WHERE PK; 
-- DELETE FROM table_name WHERE PK = #; 
-- DML - Data Manipulation language 
-- INSERT INTO table_name VALUES ()
SELECT * FROM actor;
INSERT INTO actor VALUE (201, 'CHUCK','NORRIS', '1970-01-01 00:00:00');
-- Cartesian Product OR Cross Joins
SELECT * FROM film CROSS JOIN actor;
SELECT * FROM film, actor;
-- Inner Joins
SELECT * FROM city INNER JOIN country ON city.country_id = country.country_id;
SELECT * FROM address INNER JOIN city ON city.city_id = address.city_id INNER JOIN country ON city.country_id = country.country_id;
-- Left|Right Joins
SELECT * FROM customer LEFT JOIN rental ON customer.customer_id = rental.customer_id WHERE first_name = 'Rocky';
-- INSERT INTO customer(first_name, last_name, email, store_id, address_id) VALUES ('Rocky', 'Balboa', 'rocky@gmail.com',1 ,1);
SELECT * FROM customer RIGHT JOIN rental ON customer.customer_id = rental.customer_id WHERE first_name = 'Rocky';
-- DDL - Data Definition Language
-- Add Table
CREATE TABLE hero(
	hero_id SMALLINT AUTO_INCREMENT,
	hero_name VARCHAR(45),
	hit_points SMALLINT,
	attack SMALLINT,
	defense SMALLINT,
	PRIMARY KEY(hero_id)
);
-- Update Table
ALTER TABLE hero ADD COLUMN magic_points SMALLINT;
ALTER TABLE hero RENAME COLUMN magic_points TO mana_points;
-- Remove Table
INSERT INTO hero VALUES(1,'Dan', 100, 200, 300, 100);
SELECT * FROM hero;
DROP TABLE hero;
-- Constraints apply rules to colums
CREATE TABLE hero(
	hero_id SMALLINT AUTO_INCREMENT,
	hero_name VARCHAR(45),
	hit_points SMALLINT,
	attack SMALLINT,
	defense SMALLINT,
	PRIMARY KEY(hero_id)
);
ALTER TABLE hero MODIFY hero_name VARCHAR(45) NOT NULL UNIQUE;
ALTER TABLE hero ADD COLUMN customer_id SMALLINT UNSIGNED;
-- FK Constraint
ALTER TABLE hero ADD FOREIGN KEY (customer_id) REFERENCES customer(customer_id);
DROP TABLE hero;
-- All in one create
CREATE TABLE hero(
	hero_id SMALLINT AUTO_INCREMENT,
	hero_name VARCHAR(45) NOT NULL UNIQUE,
	hit_points SMALLINT CHECK (hit_points > 0),
	attack SMALLINT,
	defense SMALLINT,
	customer_id SMALLINT UNSIGNED NOT NULL,
	PRIMARY KEY(hero_id)
	FOREIGN KEY (customer_id) REFERENCES customer(customer_id)
);
-- Referential Integrity
DELETE FROM country WHERE country_id = 1; -- Will fail because is being used as foreign key
