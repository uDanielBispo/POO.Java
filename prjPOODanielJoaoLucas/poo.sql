create table tbPessoa(
cpf varchar2(14),
nome varchar2(40),
endereco varchar2(40),
cidade varchar2(20),
uf varchar2(2),
cep varchar2(8),
ddd varchar2(2),
telefone varchar2(9),
constraint pk_cpf primary key (cpf)
);

create table tbCliente(
idCliente number primary key,
cpfCliente varchar2(14),
limiteCred number,
limiteDisp number,
constraint fk_cpfCliente foreign key (cpfCliente) references tbPessoa(cpf)
);

CREATE TABLE tbVendedor(
idVendedor number primary key,
cpfVendedor VARCHAR2(14),
salarioBase NUMBER,
taxaComissao NUMBER,
CONSTRAINT fk_vendedor foreign key (cpfVendedor) references tbPessoa(cpf)
);

CREATE TABLE tbProduto(
codigo number,
descricao varchar2(100),
qtdeDisp number,
preco number,
estoqueMin number,
CONSTRAINT pk_produto PRIMARY KEY (codigo)
);

CREATE TABLE tbPedido(
  NUMERO VARCHAR2(4),
  DTEMISSAO VARCHAR2(10),
  DTPAGTO VARCHAR2(10),
  FORMAPAGTO VARCHAR2(7),
  SITUACAO varchar2(5),
  Cliente number,
  Vendedor number,
  CONSTRAINT fk_pedidoCliente FOREIGN KEY (Cliente) REFERENCES tbCliente(idCliente),
  CONSTRAINT fk_pedidoVendedor FOREIGN KEY (Vendedor) REFERENCES tbVendedor(idVendedor),
  CONSTRAINT pk_tbPedido PRIMARY KEY (NUMERO)
);

CREATE TABLE tbItemPedido(
SEQ NUMBER,
QTDEVENDIDA NUMBER,
NUMPEDIDO VARCHAR2(4),
CODPROD NUMBER,
CONSTRAINT pk_itemPedido PRIMARY KEY (SEQ)
);

create sequence seq_cliente
start with 1
increment by 1;

create sequence seq_vendedor
start with 1
increment by 1;

select * from tbPessoa;
select * from tbCliente;
select * from tbVendedor;
select * from tbProduto;
select * from tbPedido;
select * from tbItemPedido;

drop table tbProduto;
drop table tbVendedor;
drop table tbCliente;
drop table tbPessoa;
drop table tbPedido;
drop table tbItemPedido;

insert into tbPessoa(cpf,nome,endereco,cidade,uf,cep,ddd,telefone) values('889.545.418-52','Lucas Ferreira','Serra bonita','Sorocaba','SP','18050600','15','997651019');
insert into tbPessoa(cpf,nome,endereco,cidade,uf,cep,ddd,telefone) values('789.545.418-52','Lucas Ferreira','Serra bonita','Sorocaba','SP','18050600','15','997651019');
insert into tbPessoa(cpf,nome,endereco,cidade,uf,cep,ddd,telefone) values('689.545.418-52','Lucas Ferreira','Serra bonita','Sorocaba','SP','18050600','15','997651019');
insert into tbPessoa(cpf,nome,endereco,cidade,uf,cep,ddd,telefone) values('589.545.418-52','Lucas Ferreira','Serra bonita','Sorocaba','SP','18050600','15','997651019');
insert into tbPessoa(cpf,nome,endereco,cidade,uf,cep,ddd,telefone) values('389.545.418-52','Lucas Ferreira','Serra bonita','Sorocaba','SP','18050600','15','997651019');

insert into tbCliente (idCliente, cpfCliente,limiteCred,limiteDisp) values(seq_cliente.nextval,'889.545.418-52',1000,1000);
insert into tbCliente (idCliente, cpfCliente,limiteCred,limiteDisp) values(seq_cliente.nextval,'789.545.418-52',1000,1000);
insert into tbCliente (idCliente, cpfCliente,limiteCred,limiteDisp) values(seq_cliente.nextval,'689.545.418-52',1000,1000);
insert into tbCliente (idCliente, cpfCliente,limiteCred,limiteDisp) values(seq_cliente.nextval,'589.545.418-52',1000,1000);
insert into tbCliente (idCliente, cpfCliente,limiteCred,limiteDisp) values(seq_cliente.nextval,'489.545.418-52',1000,1000);

INSERT INTO tbVendedor VALUES(seq_vendedor.nextval,'389.545.418-52', 10, 10);

INSERT INTO TBPEDIDO VALUES ('1', '10/10/2010', '10/10/2011', 'A prazo', 'true', 1, 1);
INSERT INTO TBITEMPEDIDO VALUES (1, 1,'1', 1);
INSERT INTO TBITEMPEDIDO VALUES (2, 2,'1', 1);

alter table tbPedido update column 

SELECT * FROM tbPessoa 
INNER JOIN tbCliente
ON tbPessoa.cpf = tbCliente.cpfCliente
WHERE cpfCliente = '111.111.111-11';

SELECT * FROM tbPessoa 
INNER JOIN tbVendedor
ON tbPessoa.cpf = tbVendedor.cpfVendedor
WHERE cpfVendedor = '111.111.111-11';


SELECT NUMERO, DTEMISSAO, DTPAGTO, FORMAPAGTO, SITUACAO, CPFCLIENTE,LIMITECRED,LIMITEDISP,CPFVENDEDOR,SALARIOBASE,TAXACOMISSAO FROM tbPedido PD
INNER JOIN TBCLIENTE C
ON PD.CLIENTE = C.IDCLIENTE
INNER JOIN TBVENDEDOR V
ON PD.VENDEDOR = V.IDVENDEDOR
WHERE numero = '1';

SELECT * FROM TBITEMPEDIDO WHERE NUMPEDIDO = '1';
SELECT * FROM TBITEMPEDIDO WHERE NUMPEDIDO = 1;

DELETE FROM tbItemPedido WHERE numpedido='1';
SELECT * FROM tbPedido WHERE vendedor = 21;

DELETE FROM tbItemPedido WHERE numpedido = ?
SELECT * FROM tbItemPedido Where numpedido= 1;