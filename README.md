<<<<<<< HEAD
# pw3-ingresso

Igor Edgard Rosa Lopez
Gustavo Rodrigues Augusto

create database avaliacao_PW
use avaliacao_PW

create table sessao(
		id_sessao int primary key not null,
		data_sessao date not null,
		horario_sessao time not null,
		preco_sessao numeric,
		sala_sessao varchar(1),
        filme bigint );



CREATE TABLE FILME (
    ID_FILME BIGINT PRIMARY KEY IDENTITY,
    TX_NOME VARCHAR(50) NOT NULL,
    NR_DURACAO INT NOT NULL,
    NR_ANO INT,
    TX_CAPA VARCHAR(300),
    TX_DIRETOR VARCHAR(300),
    TX_ELENCO VARCHAR(300),
    TX_DESCRICAO VARCHAR(500),
    NR_AVALIACAO FLOAT
);

alter table sessao add constraint Fk_FILME_sessao foreign key (filme) references FILME(ID_FILME);
=======
# pw3-ingresso
>>>>>>> 35fcc899f05db4af25e603ea916fae6846c52b15
