-- a)  Recupere a descrição o horário e o valor de todos os eventos agendados para o dia 28/07/2018.

select descricao, horario, valor 
from evento
where data = '2018/09/12';

-- b)  Recupere os dados de todos os locais que não possuem reserva.

select Local_evento.cod_local, Local_evento.descricao, Local_evento.nome_local
from Local_evento 
where Local_evento.cod_local not in 
					(select f.cod_local
					from Local_evento f, reserva r, evento e
					where e.cod_evento = r.Evento_cod_Evento and
					e.Local_cod_Local1 = r.Evento_cod_Evento);
                    

-- c)  Recupere os nomes dos clientes que realizaram ou reservaram eventos com um valor maior do que R$2.000,00 
-- no local de nome “Parque de Exposições”.

select c.nome, c.cod_cliente
from cliente c, evento e, Local_evento  l
where c.cod_cliente = e.Cliente_cod_cliente and
e.Local_cod_local1 = l.cod_local and
e.valor > 2000 and
l.nome_local = 'Parque de Exposições';

-- ou

select c.nome, c.cod_cliente
from cliente c, evento e, Local_evento  l
where c.cod_cliente = e.Cliente_cod_cliente and
e.Local_cod_local1 = l.cod_local and
e.valor > 2000 and
l.cod_local = (select cod_local from Local_evento 
				where nome_local = 'Parque de Exposições');


-- D recupere nome e teleofone dos clientes com reservas para 02/09/2018 no local "Pier"

-- antes da consulta vamos dar um alter table para alterar o nome da coluna de data na tabela reserva
-- para data_reserva - pode ser ai o erro pois data é palavra reservada
-- vamos alterar os parâmetros da consulta para: 2018-11-27 e para o local chamado “Downtown”, isso retorna o João

alter table reserva change data data_reserva date;

select c.nome, c.telefone, c.cod_cliente
from cliente c, evento e, reserva r, Local_evento l
where c.cod_cliente = r.Cliente_cod_cliente and
e.Local_cod_Local1 = l.cod_local and
r.Evento_cod_Evento = e.cod_evento and
r.data_reserva = '2018-11-27' and
l.nome_local like '%Downtown%';


-- e)  Liste a quantidade de clientes que realizaram reservas no local "Centro de Eventos"

select count(r.Cliente_cod_cliente)
from cliente c, reserva r, Local_evento l, evento e
where c.cod_cliente = r.Cliente_cod_cliente and
r.Evento_cod_Evento = e.cod_evento and
e.Local_cod_Local1 = l.cod_local and
l.nome_local = 'Centro de Eventos';


-- f)  Para cada cliente que realizou mais de 1 reserva no local "Downtown", liste o nome e o bairro
-- vamos trocar Downtown por Parque Dona Lindu - isso retorna Maria

select c.nome, c.bairro
from cliente c, reserva r, Local_evento l, evento e
where c.cod_cliente = r.Cliente_cod_cliente and
r.Evento_cod_Evento = e. cod_evento and
e. Local_cod_Local1 = l.cod_local and
l.nome_local = 'Parque Dona Lindu'
group by r.Cliente_cod_cliente
having count(r.Cliente_cod_cliente) > 1;

-- g)  Liste a quantidade eventos realizados por local

select l.nome_local, count(e.cod_evento)
from evento e, Local_evento l
where e.Local_cod_local1 = l.cod_local
group by l.cod_local;

-- h)  Para cada evento que teve menos que 2 reservas, recupere a descrição do evento e o valor

select e.descricao, e.valor
from reserva r, Local_evento l, evento e
where r.Evento_cod_Evento = e.cod_evento
and e.Local_cod_Local1 = l.cod_local
group by e.descricao, e.valor
having count(r.cod_reserva) <2;

-- i)  Recupere o nome dos Clientes, cujo somatório do valor pago por eventos ultrapassa 200,00R$

select c.nome, sum(e.valor)
from cliente c, evento e, reserva r
where c.cod_cliente = e.Cliente_cod_cliente and
r.Cliente_cod_cliente = c.cod_cliente
group by c.cod_cliente
having sum(e.valor) > 200;

-- j)  Retorne os clientes que fizeram reserva no dia 24/04/2018 do local "Salão Maracatu" OU os clientes que fizeram um evento no
-- dia 24/04/2018 no local "Salão Ciranda"

select c.cod_cliente
from cliente c, reserva r, Local_evento l, Evento e
where c.cod_cliente = r.Cliente_cod_cliente and
r.evento_cod_Evento = e.cod_evento and
e.Cliente_cod_cliente = c.cod_cliente and
l.nome_local = 'Salao Maracatu' and 
r.data_reserva = '24/04/2018'
and c.cod_cliente in(select c.cod_cliente
					from cliente c, reserva r, Local_evento l, Evento e
					where c.cod_cliente = r.Cliente_cod_cliente and
					r.evento_cod_Evento = e.cod_evento and
					e.Cliente_cod_cliente = c.cod_cliente and
					l.nome_local = 'Salao Ciranda' and 
					r.data_reserva = '24/04/2018');

-- k)  Para cada evento que teve mais de 3 reservas, apresente o nome do evento e o valor arrecadado com os ingressos

select e.descricao, sum(e.valor)
from reserva r, Local_evento l, evento e
where r.Evento_cod_Evento = e.cod_evento
and e.Local_cod_Local1 = l.cod_local
group by e.descricao, e.valor
having count(r.cod_reserva) >3;


-- l)  Recupere o nome dos eventos cujo valor de ingresso é maior do que o valor da média dos eventos

select e.descricao
from evento e
where e.valor > (select avg(valor)
				 from evento);
		
-- m)  Liste o nome dos locais que não receberam eventos no ano de 2018

select l.nome_local
from Local_evento l
where l.cod_local not in (select distinct(l.cod_local)
							from Local_evento l, reserva r, evento e
							where l.cod_local = e.Local_cod_Local1
                            and year(e.data) = 2018); -- essa funcao extrai apenas o ano de um atributo tipo data
                            
-- n)  Recupere o nome dos locais que já sediaram pelo menos 2 eventos

select l.nome_local
from Local_evento l
where l.cod_local in (select e.local_cod_local1
							from evento e
                            group by e.local_cod_local1
                            having count(e.local_cod_local1) = 2);

-- o)  Retorne os eventos cuja quantidade de reservas foi maior que a média de reservas por evento

select e.descricao, count(r.cod_reserva)
from evento e, reserva r
where r.Evento_cod_Evento = e.cod_evento
group by e.descricao 
having count(r.cod_reserva) > (select avg(r.evento_cod_evento)
								from  reserva r);
                                
-- p)  Liste o nome e telefone dos clientes que não efetuaram nenhuma reserva

select c.cod_cliente, c.nome, c.telefone
from cliente c
where c.cod_cliente not in (select cliente_cod_cliente
							from reserva);


