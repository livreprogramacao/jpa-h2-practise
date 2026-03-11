CREATE DATABASE test ENCODING 'UTF8';
\C test;

DROP SEQUENCE hibernate_sequence CASCADE;

DROP SEQUENCE user_data_seq CASCADE;
CREATE SEQUENCE user_data_seq START 1;
DROP TABLE user_data CASCADE;
CREATE TABLE user_data (
    id BIGINT DEFAULT nextval('user_data_seq') NOT NULL,
    age INT4,
    location INT4,
    sent_count INT4,
    user_id VARCHAR(255),
    username VARCHAR(255),
    PRIMARY KEY (id)
);

SELECT * FROM user_data;