CREATE TABLE Cliente (
  cod_cliente INT ,
  nome VARCHAR(45) ,
  telefone VARCHAR(45) ,
  rua VARCHAR(45) ,
  bairro VARCHAR(45) ,
  numero VARCHAR(45) ,
  complemento VARCHAR(45) ,
  CEP VARCHAR(45) ,
  PRIMARY KEY (cod_cliente));


CREATE TABLE local_evento (
  cod_local INT ,
  nome_local VARCHAR(45) ,
  descricao VARCHAR(45) ,
  PRIMARY KEY (cod_local));



CREATE TABLE Evento(
  cod_evento INT,
  descricao VARCHAR(45) ,
  data DATE,
  horario VARCHAR(45) ,
  valor FLOAT,
  Local_cod_Local1 INT,
  Cliente_cod_cliente INT ,
  PRIMARY KEY (cod_evento),
  CONSTRAINT fk_Evento_Local
    FOREIGN KEY (Local_cod_local1)
    REFERENCES local_evento (cod_local)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_Evento_Cliente1
    FOREIGN KEY (Cliente_cod_cliente)
    REFERENCES Cliente (cod_cliente)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);



CREATE TABLE  Reserva (
  cod_reserva INT,
  data DATE ,
  horario VARCHAR(45),
  Cliente_cod_cliente INT ,
  Evento_cod_Evento INT ,
  PRIMARY KEY (cod_reserva),
  CONSTRAINT fk_Reserva_Cliente1
    FOREIGN KEY (Cliente_cod_cliente)
    REFERENCES Cliente (cod_cliente)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_Reserva_Evento
    FOREIGN KEY (Evento_cod_Evento)
    REFERENCES Evento (cod_evento)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

