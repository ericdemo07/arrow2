
--products
CREATE TABLE IF NOT EXISTS product (product_id INT PRIMARY KEY auto_increment, type VARCHAR(25), brand VARCHAR(25), model VARCHAR(50), serial VARCHAR(50), price DECIMAL(20, 2));

--enduser/customer
CREATE TABLE IF NOT EXISTS enduser (username VARCHAR(25) PRIMARY KEY, password VARCHAR(25), flag_enabled BOOLEAN);

--roles and responsibilities
CREATE TABLE IF NOT EXISTS roles (username VARCHAR(25), role INT);
