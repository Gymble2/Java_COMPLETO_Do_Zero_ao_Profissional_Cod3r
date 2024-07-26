create table if not exists cidade(
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    estado_id INT UNSIGNED NOT NULL,
    area DECIMAL(10,2),
    PRIMARY KEY(id),
    FOREIGN KEY(estado_id) REFERENCES `estados2` (id)
);

create table if not exists teste(
    id INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY
);

Drop table if exists teste;
