
--cria tabela
create table if not exists empresas(
    --unsigned = não pode mais que 1 / auto_incremente = id++
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    cnpj VARCHAR(12) NOT NULL,
    --chave primaria
    PRIMARY KEY (id),
    --chave unica
    UNIQUE KEY (cnpj)
);
--apaga tabela
Drop table empresas;
--adiciona valores nas tabelas
insert into empresas
    (nome,cnpj)
values
    ('Bradesco',0187200183783),
    ('Nike', 39230089213831),
    ('KaioSorvete', 39238900213831);

--descreve tabela tecnicamente
desc empresas;
--altera o tipo do atributo da tabela
ALTER TABLE empresas MODIFY cnpj VARCHAR(28);
--mostra tabelas
select * from empresas;
select * from cidade;

---Tabela relacionando duas tabelas
create table if not exists empresas_cidades(
    empresa_id INT UNSIGNED NOT NULL,
    cidade_id INT UNSIGNED NOT NULL,
    sede TINYINT(1) NOT NULL,
    primary key (empresa_id, cidade_id)
);

insert into empresas_cidades
    (empresa_id, cidade_id, sede)
values
    (1,2,1),
    (2,5,0),
    (3,6,1),
    (2,3,1);

select * from empresas_cidades