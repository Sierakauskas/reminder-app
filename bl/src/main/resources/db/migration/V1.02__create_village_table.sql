CREATE TABLE VILLAGE (
    id bigserial PRIMARY KEY,
    name character varying(255),
    eldership_id bigserial
);

INSERT INTO VILLAGE (id, name, eldership_id)
VALUES (1, 'Kloniai', 1),
       (2, 'Kuprioniškės', 1),
       (3, 'Liepynai', 1)