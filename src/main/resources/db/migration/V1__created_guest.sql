-- описать SQL скрипт
CREATE TABLE guest
(
    id BIGSERIAL PRIMARY KEY,
    start_time TIMESTAMP WITH TIME ZONE,
    end_time TIMESTAMP WITH TIME ZONE,
    first_name  VARCHAR (15),
    second_name VARCHAR (15),
    last_name VARCHAR (15)
);