# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table carona (
  id                        bigint not null,
  vagas_disponiveis         integer,
  tipo                      integer,
  constraint ck_carona_tipo check (tipo in (0,1)),
  constraint pk_carona primary key (id))
;

create table endereco (
  bairro                    varchar(255),
  rua                       varchar(255))
;

create table notificacao (
  id                        bigint not null,
  mensagem                  varchar(255),
  tipo                      integer,
  status                    boolean,
  constraint ck_notificacao_tipo check (tipo in (0,1,2,3)),
  constraint pk_notificacao primary key (id))
;

create sequence carona_seq;

create sequence notificacao_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists carona;

drop table if exists endereco;

drop table if exists notificacao;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists carona_seq;

drop sequence if exists notificacao_seq;

