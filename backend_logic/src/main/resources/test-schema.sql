
--products
CREATE TABLE IF NOT EXISTS product (product_id INT PRIMARY KEY auto_increment, type VARCHAR(25), brand VARCHAR(25), model VARCHAR(50), serial VARCHAR(50), price DECIMAL(20, 2));

--enduser/customer
CREATE TABLE IF NOT EXISTS enduser (username VARCHAR(25) PRIMARY KEY, password VARCHAR(25), flag_enabled BOOLEAN);

--roles and responsibilities
CREATE TABLE IF NOT EXISTS roles (username VARCHAR(25), role INT, PRIMARY KEY(username,role));

--roles to path
CREATE TABLE IF NOT EXISTS roletopath (role INT, path VARCHAR(25), PRIMARY KEY(role,path));

CREATE TABLE IF NOT EXISTS shopperproductdetail (shopperId VARCHAR(25), serial VARCHAR(25), supplier VARCHAR(25), invoiceNo VARCHAR(25), orderId VARCHAR(25), dateOfPurchase TIMESTAMP,
   supplierAddress VARCHAR(25), eCommerceSupplier VARCHAR(25), PRIMARY KEY(shopperId,serial));
