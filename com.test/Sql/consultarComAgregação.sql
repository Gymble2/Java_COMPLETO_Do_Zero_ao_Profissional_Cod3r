select
    regiao as 'Região',
    sum(populacao) as Total
from `estados2`
GROUP BY regiao
order by Total desc

select
    regiao as 'Região',
    AVG(populacao) as Total
from `estados2`
GROUP BY regiao
order by Total desc