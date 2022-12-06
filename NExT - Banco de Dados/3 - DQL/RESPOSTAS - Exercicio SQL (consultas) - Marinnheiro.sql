#01 Encontre os nomes e as idades de todos os marinheiros
select nomeMarinheiro, idade from marinheiro;

#02 Encontre todos os marinheiros com uma avaliação bom
select * from marinheiro where avaliacao = 'bom';

#03 Encontre os nomes de marinheiros que reservaram o barco 103
select distinct nomeMarinheiro from marinheiro m join reserva r on m.idMarinheiro = r.idMarinheiro where idBarco = 103;

#04 Encontre os idMarinheiro dos marinheiros que reservaram um barco vermelho
select distinct idMarinheiro from reserva r join barco b on r.idbarco = b.idbarco where cor = 'vermelho' ;

#05 Encontre os nomes dos marinheiros que reservaram um barco vermelho
select distinct nomeMarinheiro from marinheiro m join reserva r on m.idMarinheiro = r.idMarinheiro 
join barco b on r.idbarco = b.idbarco where cor = 'vermelho';

#06 Encontre as cores dos barcos reservados por Lubber
select distinct b.cor from marinheiro m join reserva r on m.idMarinheiro = r.idMarinheiro 
join barco b on r.idbarco = b.idbarco where M.nomeMarinheiro = 'Lubber';

#07 Encontre os nomes dos marinheiros que reservaram pelo menos um barco
Select distinct nomeMarinheiro from marinheiro m join reserva r on m.idMarinheiro = r.idMarinheiro;

#08 Encontre as idades dos marinheiros cujos nomes começam ou terminam com B e têm no mínimo três caracteres.
select idade from marinheiro m where nomeMarinheiro like 'B_%b';

#09 Encontre a idade média de todos os marinheiros
select avg(idade) from marinheiro;

#10 Encontre a idade média dos marinheiros com idade maior que 27
select avg(idade) from  marinheiro where idade > 27;

#11 Encontre o quantidade total de marinheiros
select count(*) from marinheiro;

#12 Encontre o número de nomes diferentes de marinheiros
select count(distinct (nomeMarinheiro)) from marinheiro;

#13 Encontre a idade do marinheiro mais jovem para cada nível de avaliação
select m.avaliacao, min(m.idade) from marinheiro m group by m.avaliacao;

#14 Encontre a idade do marinheiro mais jovem que tenha no mínimo 18 anos para cada nível de avaliação com no mínimo dois marinheiros desse tipo
select avaliacao, min(idade) as minIdade from marinheiro where idade>=18 group by avaliacao having count(*)>1;

#15 Para cada barco vermelho, encontre o número de reservas desse barco
select b.idBarco, count(*) as contagemReserva from reserva r join barco b on r.idbarco = b.idbarco and b.cor = 'vermelho' group by b.idBarco;

#16 Encontre a idade media dos marinheiros de cada nível de avaliação que tenha no mínimo dois marinheiros
select avaliacao, avg(idade) as idadeMedia from marinheiro group by avaliacao having count(*) > 1;

#17 Encontre o id dos marinheiros que tenham idade maior que a média
select idMarinheiro from marinheiro where idade > (select avg(idade) from marinheiro);

#18 Encontre o nome dos marinheiros que realizaram mais de 3 reservas de barcos, cujas cores estejam entre (vermelho, verde, azul).
select nomeMarinheiro, count(*) from marinheiro m join reserva r on m.idMarinheiro = r.idMarinheiro 
join barco b on r.idbarco = b.idbarco where cor in ('vermelho', 'verde', 'azul')
 group by nomeMarinheiro having count(*) > 3 ;

#19 De acordo com as cores dos barcos, selecione a média das idades dos marinheiros que os reservaram
select b.cor, avg(m.idade) from marinheiro m join reserva r on m.idMarinheiro = r.idMarinheiro 
join barco b on r.idbarco = b.idbarco group by b.cor;


