select * from prefeitos;
select * from cidade;

select *
		from cidade c 
		inner join prefeitos p 
		on c.id = p.cidade_id;
select *
		from cidade c 
		left join prefeitos p 
		on c.id = p.cidade_id;
select *
		from cidade c 
		inner join prefeitos p 
		on c.id = p.cidade_id;

select *
		from cidade c 
		right join prefeitos p 
		on c.id = p.cidade_id;
select *
		from cidade c 
		left join prefeitos p 
		on c.id = p.cidade_id
	union
select *
		from cidade c 
		right join prefeitos p 
		on c.id = p.cidade_id;
                

