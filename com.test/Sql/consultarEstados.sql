SELECT * FROM `estados2` 

SELECT nome,sigla 
    FROM `estados2`
    WHERE  regiao = 'Sul'


SELECT nome,regiao,populacao 
    FROM `estados2`
    WHERE  populacao >= 10
        order by populacao desc

