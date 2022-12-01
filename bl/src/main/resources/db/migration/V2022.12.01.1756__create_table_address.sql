CREATE TABLE address (
                         id bigserial PRIMARY KEY,
                         name character varying(255)
);


COMMENT ON TABLE address IS 'Adreso forma';
COMMENT ON COLUMN address.name IS 'Adreso pavadinimas';

INSERT INTO address (id, name)
VALUES (1, 'Teisininkai'),
       (2, 'Ekonomistai');