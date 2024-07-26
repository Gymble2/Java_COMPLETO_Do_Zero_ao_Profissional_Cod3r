select e.nome, c.nome
    from 
        empresas e, 
        empresas_cidades ec, 
        cidade c
    where 
        e.id = ec.empresa_id
    and 
        c.id = ec.cidade_id
    and 
        sede