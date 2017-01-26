create sequence group_seq;

create table board (
  id bigint DEFAULT group_seq.nextval PRIMARY KEY ,
  title VARCHAR(50),
  content clob,
  regdate DATE
)