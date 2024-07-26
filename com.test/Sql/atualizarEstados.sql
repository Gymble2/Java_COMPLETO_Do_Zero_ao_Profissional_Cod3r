update `estados2`
set nome = 'Sao paulo'
WHERE sigla = 'SP'

select nome from estados2 where sigla = 'SP'

update `estados2`
    set nome = 'Amapa', 
        populacao = 12.32
    WHERE sigla = 'AP'


select  nome, sigla, populacao
    from `estados2`
    WHERE  sigla ='AC'

SELECT * FROM `estados2` 


update `estados2`
    set populacao = 3.33
    WHERE id = 24