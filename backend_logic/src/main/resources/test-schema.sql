
--products
CREATE TABLE IF NOT EXISTS product (product_id INT PRIMARY KEY auto_increment, type VARCHAR(25), brand VARCHAR(25), model VARCHAR(50), serial VARCHAR(50), price DECIMAL(20, 2));

--enduser/customer
CREATE TABLE IF NOT EXISTS enduser (username VARCHAR(25) PRIMARY KEY, password VARCHAR(25), flag_enabled BOOLEAN);

--endusertemp
CREATE TABLE IF NOT EXISTS enduserdetailstemp (user_name VARCHAR(25), password VARCHAR(25), mail_id VARCHAR(25), arrow_phone VARCHAR(40), otp INT, PRIMARY KEY(username,otp));

--enduserdetails
CREATE TABLE IF NOT EXISTS enduserdetails (shopper_id VARCHAR(25) PRIMARY KEY, user_name VARCHAR(25) PRIMARY KEY, mail_id VARCHAR(25), isd_code INT,
 country_code VARCHAR(5), country_name VARCHAR(10), phone BIGINT, gender CHAR(1), birth_year SMALLINT, birth_month SMALLINT, birth_date SMALLINT, flag_enabled BOOLEAN);

--roles and responsibilities
CREATE TABLE IF NOT EXISTS roles (username VARCHAR(25), role INT, PRIMARY KEY(username,role));

--roles to path
CREATE TABLE IF NOT EXISTS roletopath (role INT, path VARCHAR(25), PRIMARY KEY(role,path));

--productdetail
CREATE TABLE IF NOT EXISTS shopperproductdetail (shopperId VARCHAR(25), serial VARCHAR(25), supplier VARCHAR(25), invoiceNo VARCHAR(25), orderId VARCHAR(25), dateOfPurchase VARCHAR(25),
   supplierAddress VARCHAR(25), eCommerceSupplier VARCHAR(25), PRIMARY KEY(shopperId,serial));
