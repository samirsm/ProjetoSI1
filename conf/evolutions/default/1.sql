# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table endereco (
  id                            bigint not null,
  bairro                        varchar(255),
  rua                           varchar(255),
  constraint pk_endereco primary key (id)
);
create sequence endereco_seq;

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
  usuario_id                    bigint,
  horario_id                    bigint,
  tipo                          integer,
  constraint ck_carona_tipo check (tipo in (0,1)),
  constraint uq_carona_horario_id unique (horario_id),
  constraint pk_carona primary key (id)
);
create sequence carona_seq;

create table passageiros (
  carona_id                     bigint not null,
  usuario_id                    bigint not null,
  constraint pk_passageiros primary key (carona_id,usuario_id)
);

create table solicitantes (
  carona_id                     bigint not null,
  usuario_id                    bigint not null,
  constraint pk_solicitantes primary key (carona_id,usuario_id)
);

create table notificacao (
  id                            bigint not null,
  usuario_id                    bigint,
  carona_id                     bigint,
  mensagem                      varchar(255),
  tipo                          integer,
  status                        boolean,
  constraint ck_notificacao_tipo check (tipo in (0,1,2,3)),
  constraint uq_notificacao_usuario_id unique (usuario_id),
  constraint uq_notificacao_carona_id unique (carona_id),
  constraint pk_notificacao primary key (id)
);
create sequence notificacao_seq;

create table usuario (
  id                            bigint not null,
  nome                          varchar(255),
  matricula                     varchar(255),
  email                         varchar(255),
  senha                         varchar(255),
  numero_de_telefone            varchar(255),
  endereco_alternativo_id       bigint,
  endereco_id                   bigint,
  numero_vagas                  integer,
  horarios_cadastrados          boolean,
  idioma                        varchar(255),
  constraint uq_usuario_endereco_alternativo_id unique (endereco_alternativo_id),
  constraint uq_usuario_endereco_id unique (endereco_id),
  constraint pk_usuario primary key (id)
);
create sequence usuario_seq;

alter table horario add constraint fk_horario_usuario_id foreign key (usuario_id) references usuario (id) on delete restrict on update restrict;
create index ix_horario_usuario_id on horario (usuario_id);

alter table carona add constraint fk_carona_usuario_id foreign key (usuario_id) references usuario (id) on delete restrict on update restrict;
create index ix_carona_usuario_id on carona (usuario_id);

alter table carona add constraint fk_carona_horario_id foreign key (horario_id) references horario (id) on delete restrict on update restrict;

alter table passageiros add constraint fk_passageiros_carona foreign key (carona_id) references carona (id) on delete restrict on update restrict;
create index ix_passageiros_carona on passageiros (carona_id);

alter table passageiros add constraint fk_passageiros_usuario foreign key (usuario_id) references usuario (id) on delete restrict on update restrict;
create index ix_passageiros_usuario on passageiros (usuario_id);

alter table solicitantes add constraint fk_solicitantes_carona foreign key (carona_id) references carona (id) on delete restrict on update restrict;
create index ix_solicitantes_carona on solicitantes (carona_id);

alter table solicitantes add constraint fk_solicitantes_usuario foreign key (usuario_id) references usuario (id) on delete restrict on update restrict;
create index ix_solicitantes_usuario on solicitantes (usuario_id);

alter table notificacao add constraint fk_notificacao_usuario_id foreign key (usuario_id) references usuario (id) on delete restrict on update restrict;

alter table notificacao add constraint fk_notificacao_carona_id foreign key (carona_id) references carona (id) on delete restrict on update restrict;

alter table usuario add constraint fk_usuario_endereco_alternativo_id foreign key (endereco_alternativo_id) references endereco (id) on delete restrict on update restrict;

alter table usuario add constraint fk_usuario_endereco_id foreign key (endereco_id) references endereco (id) on delete restrict on update restrict;


# --- !Downs

alter table horario drop constraint if exists fk_horario_usuario_id;
drop index if exists ix_horario_usuario_id;

alter table carona drop constraint if exists fk_carona_usuario_id;
drop index if exists ix_carona_usuario_id;

alter table carona drop constraint if exists fk_carona_horario_id;

alter table passageiros drop constraint if exists fk_passageiros_carona;
drop index if exists ix_passageiros_carona;

alter table passageiros drop constraint if exists fk_passageiros_usuario;
drop index if exists ix_passageiros_usuario;

alter table solicitantes drop constraint if exists fk_solicitantes_carona;
drop index if exists ix_solicitantes_carona;

alter table solicitantes drop constraint if exists fk_solicitantes_usuario;
drop index if exists ix_solicitantes_usuario;

alter table notificacao drop constraint if exists fk_notificacao_usuario_id;

alter table notificacao drop constraint if exists fk_notificacao_carona_id;

alter table usuario drop constraint if exists fk_usuario_endereco_alternativo_id;

alter table usuario drop constraint if exists fk_usuario_endereco_id;

drop table if exists endereco;
drop sequence if exists endereco_seq;

drop table if exists horario;
drop sequence if exists horario_seq;

drop table if exists carona;
drop sequence if exists carona_seq;

drop table if exists passageiros;

drop table if exists solicitantes;

drop table if exists notificacao;
drop sequence if exists notificacao_seq;

drop table if exists usuario;
drop sequence if exists usuario_seq;

