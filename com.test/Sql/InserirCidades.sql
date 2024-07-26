
select * from `estados2`

INSERT into cidade 
    (nome, area, estado_id)
values(
    'Santa de tiriri',
    795, 
    24
)

INSERT into cidade 
    (nome, area, estado_id)
values(
    'Niteroi',
    133.99, 
    23
)

INSERT into cidade 
    (nome, area, estado_id)
values(
    'Goiania', 
    920.06,
    (select id from estados2 where sigla = 'GO')
)


INSERT into cidade 
    (nome, area, estado_id)
values(
    'karuaru', 
    920.06,
    (select id from estados2 where sigla = 'AC')
)

DELETE  FROM `cidade` WHERE id = 1

select * from cidade