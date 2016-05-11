# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table horario (
  id                            bigint not null,
  usuario_id                    bigint not null,
  dia                           varchar(255),
  hora                          integer,
  constraint pk_horario primary key (id)
);
create sequence horario_seq;

create table carona (
  id                            bigint not null,
  vagas_disponiveis             integer,
  motorista_id                  bigint,
  horario_id                    bigint,
  tipo                          integer,
  constraint ck_carona_tipo check (tipo in (0,1)),
  constraint uq_carona_motorista_id unique (motorista_id),
  constraint uq_carona_horario_id unique (horario_id),
  constraint pk_carona primary key (id)
);
create sequence carona_seq;

create table notificacao (
  id                            bigint not null,
  usuario_origem_id             bigint,
  carona_id                     bigint,
  mensagem                      varchar(255),
  tipo                          integer,
  status                        boolean,
  constraint ck_notificacao_tipo check (tipo in (0,1,2,3)),
  constraint uq_notificacao_usuario_origem_id unique (usuario_origem_id),
  constraint uq_notificacao_carona_id unique (carona_id),
  constraint pk_notificacao primary key (id)
);
create sequence notificacao_seq;

create table usuario (
  id                            bigint not null,
  carona_id                     bigint not null,
  nome                          varchar(255),
  matricula                     varchar(255),
  email                         varchar(255),
  senha                         varchar(255),
  numero_de_telefone            varchar(255),
  bairro                        varchar(255),
  rua                           varchar(255),
  numero_vagas                  integer,
  horarios_cadastrados          boolean,
  idioma                        varchar(255),
  constraint pk_usuario primary key (id)
);
create sequence usuario_seq;

alter table horario add constraint fk_horario_usuario_id foreign key (usuario_id) references usuario (id) on delete restrict on update restrict;
create index ix_horario_usuario_id on horario (usuario_id);

alter table carona add constraint fk_carona_motorista_id foreign key (motorista_id) references usuario (id) on delete restrict on update restrict;

alter table carona add constraint fk_carona_horario_id foreign key (horario_id) references horario (id) on delete restrict on update restrict;

alter table notificacao add constraint fk_notificacao_usuario_origem_id foreign key (usuario_origem_id) references usuario (id) on delete restrict on update restrict;

alter table notificacao add constraint fk_notificacao_carona_id foreign key (carona_id) references carona (id) on delete restrict on update restrict;

alter table usuario add constraint fk_usuario_carona_id foreign key (carona_id) references carona (id) on delete restrict on update restrict;
create index ix_usuario_carona_id on usuario (carona_id);


# --- !Downs

alter table horario drop constraint if exists fk_horario_usuario_id;
drop index if exists ix_horario_usuario_id;

alter table carona drop constraint if exists fk_carona_motorista_id;

alter table carona drop constraint if exists fk_carona_horario_id;

alter table notificacao drop constraint if exists fk_notificacao_usuario_origem_id;

alter table notificacao drop constraint if exists fk_notificacao_carona_id;

alter table usuario drop constraint if exists fk_usuario_carona_id;
drop index if exists ix_usuario_carona_id;

drop table if exists horario;
drop sequence if exists horario_seq;

drop table if exists carona;
drop sequence if exists carona_seq;

drop table if exists notificacao;
drop sequence if exists notificacao_seq;

drop table if exists usuario;
drop sequence if exists usuario_seq;

