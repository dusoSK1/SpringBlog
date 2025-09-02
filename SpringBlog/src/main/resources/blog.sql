-- H2 SQL dump for SpringBlog
-- Compatible with H2 in-memory database

DROP TABLE IF EXISTS order_config_options;
DROP TABLE IF EXISTS orders;
DROP TABLE IF EXISTS config_options;
DROP TABLE IF EXISTS article_entity;
DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS user_entity;

-- -----------------------------
-- Table structure for article_entity
-- -----------------------------
CREATE TABLE article_entity (
  article_id BIGINT PRIMARY KEY AUTO_INCREMENT,
  content CLOB NOT NULL,
  description VARCHAR(255) NOT NULL,
  title VARCHAR(255) NOT NULL
);


-- -----------------------------
-- Table structure for config_options
-- -----------------------------
CREATE TABLE config_options (
  id BIGINT PRIMARY KEY AUTO_INCREMENT,
  description VARCHAR(255),
  name VARCHAR(255),
  price DOUBLE NOT NULL
);

-- -----------------------------
-- Table structure for orders
-- -----------------------------
CREATE TABLE orders (
  id BIGINT PRIMARY KEY AUTO_INCREMENT,
  total_price DOUBLE NOT NULL,
  user_id BIGINT
);

-- -----------------------------
-- Table structure for order_config_options
-- -----------------------------
CREATE TABLE order_config_options (
  order_id BIGINT NOT NULL,
  config_option_id BIGINT NOT NULL
);

-- -----------------------------
-- Table structure for users
-- -----------------------------
CREATE TABLE users (
  id BIGINT PRIMARY KEY AUTO_INCREMENT,
  email VARCHAR(255),
  password VARCHAR(255),
  role VARCHAR(255),
  username VARCHAR(255)
);

-- -----------------------------
-- Table structure for user_entity
-- -----------------------------
CREATE TABLE user_entity (
  user_id BIGINT PRIMARY KEY AUTO_INCREMENT,
  admin BOOLEAN NOT NULL,
  email VARCHAR(255) NOT NULL,
  password VARCHAR(255) NOT NULL
);

INSERT INTO user_entity (user_id, admin, email, password) VALUES
(1, TRUE, 'dusanstanko123@gmail.com', '$2a$10$OQplQe0WpDd3EWbGMh7UwueJd/bWR7hXwkpBslIJnXpClAQpuk3Hy'),
(3, FALSE, 'dusanstanko@azet.sk', '$2a$10$6Xtp7Jc8XQMAwNMpf8wPWOTK/4HdxaSSeUd8xJU7eWQrF4B0BpZDC');
