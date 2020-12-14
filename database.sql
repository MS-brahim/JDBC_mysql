CREATE DATABASE IF NOT EXISTS test;
CREATE TABLE IF NOT EXISTS youcode_test (
    id              INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name            VARCHAR(10) NOT NULL,
    description     VARCHAR(30) NOT NULL,
    CIN             VARCHAR(8) NOT NULL
)
