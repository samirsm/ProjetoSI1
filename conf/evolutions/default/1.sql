# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table carona (
  id                        bigint not null,
  vagas_disponiveis         integer,
  usuario_id                bigint,
  horario_id                bigint,
  tipo                      integer,
  constraint ck_carona_tipo check (tipo in (0,1)),
  constraint uq_carona_horario_id unique (horario_id),
  constraint pk_carona primary key (id))
;

create table endereco (
  id                        bigint not null,
  bairro                    varchar(255),
  rua                       varchar(255),
  constraint pk_endereco primary key (id))
;

create table horario (
  id                        bigint not null,
  dia                       integer,
  hora                      integer,
  constraint pk_horario primary key (id))
;

create table notificacao (
  id                        bigint not null,
  usuario_id                bigint,
  carona_id                 bigint,
  mensagem                  varchar(255),
  tipo                      integer,
  status                    boolean,
  constraint ck_notificacao_tipo check (tipo in (0,1,2,3,4)),
  constraint uq_notificacao_usuario_id unique (usuario_id),
  constraint uq_notificacao_carona_id unique (carona_id),
  constraint pk_notificacao primary key (id))
;

create table solicitacao (
  id                        bigint not null,
  usuario_id                bigint,
  carona_id                 bigint,
  mensagem                  varchar(255),
  status                    boolean,
  notificacao_associada_id  bigint,
  constraint uq_solicitacao_usuario_id unique (usuario_id),
  constraint uq_solicitacao_carona_id unique (carona_id),
  constraint uq_solicitacao_notificacao_assoc unique (notificacao_associada_id),
  constraint pk_solicitacao primary key (id))
;

create table usuario (
  id                        bigint not null,
  nome                      varchar(255),
  matricula                 varchar(255),
  email                     varchar(255),
  senha                     varchar(255),
  numero_de_telefone        varchar(255),
  endereco_alternativo_id   bigint,
  endereco_id               bigint,
  numero_vagas              integer,
  idioma                    varchar(9),
  horarios_cadastrados      boolean,
  constraint ck_usuario_idioma check (idioma in ('PORTUGUES','ENGLISH','ESPANOL','ITALIANO')),
  constraint uq_usuario_endereco_alternativo_ unique (endereco_alternativo_id),
  constraint uq_usuario_endereco_id unique (endereco_id),
  constraint pk_usuario primary key (id))
;


create table carona_usuario (
  carona_id                      bigint not null,
  usuario_id                     bigint not null,
  constraint pk_carona_usuario primary key (carona_id, usuario_id))
;

create table usuario_horario (
  usuario_id                     bigint not null,
  horario_id                     bigint not null,
  constraint pk_usuario_horario primary key (usuario_id, horario_id))
;
create sequence carona_seq;

create sequence endereco_seq;

create sequence horario_seq;

create sequence notificacao_seq;

create sequence solicitacao_seq;

create sequence usuario_seq;

alter table carona add constraint fk_carona_usuario_1 foreign key (usuario_id) references usuario (id) on delete restrict on update restrict;
create index ix_carona_usuario_1 on carona (usuario_id);
alter table carona add constraint fk_carona_horario_2 foreign key (horario_id) references horario (id) on delete restrict on update restrict;
create index ix_carona_horario_2 on carona (horario_id);
alter table notificacao add constraint fk_notificacao_usuario_3 foreign key (usuario_id) references usuario (id) on delete restrict on update restrict;
create index ix_notificacao_usuario_3 on notificacao (usuario_id);
alter table notificacao add constraint fk_notificacao_carona_4 foreign key (carona_id) references carona (id) on delete restrict on update restrict;
create index ix_notificacao_carona_4 on notificacao (carona_id);
alter table solicitacao add constraint fk_solicitacao_usuario_5 foreign key (usuario_id) references usuario (id) on delete restrict on update restrict;
create index ix_solicitacao_usuario_5 on solicitacao (usuario_id);
alter table solicitacao add constraint fk_solicitacao_carona_6 foreign key (carona_id) references carona (id) on delete restrict on update restrict;
create index ix_solicitacao_carona_6 on solicitacao (carona_id);
alter table solicitacao add constraint fk_solicitacao_notificacaoAsso_7 foreign key (notificacao_associada_id) references notificacao (id) on delete restrict on update restrict;
create index ix_solicitacao_notificacaoAsso_7 on solicitacao (notificacao_associada_id);
alter table usuario add constraint fk_usuario_enderecoAlternativo_8 foreign key (endereco_alternativo_id) references endereco (id) on delete restrict on update restrict;
create index ix_usuario_enderecoAlternativo_8 on usuario (endereco_alternativo_id);
alter table usuario add constraint fk_usuario_endereco_9 foreign key (endereco_id) references endereco (id) on delete restrict on update restrict;
create index ix_usuario_endereco_9 on usuario (endereco_id);



alter table carona_usuario add constraint fk_carona_usuario_carona_01 foreign key (carona_id) references carona (id) on delete restrict on update restrict;

alter table carona_usuario add constraint fk_carona_usuario_usuario_02 foreign key (usuario_id) references usuario (id) on delete restrict on update restrict;

alter table usuario_horario add constraint fk_usuario_horario_usuario_01 foreign key (usuario_id) references usuario (id) on delete restrict on update restrict;

alter table usuario_horario add constraint fk_usuario_horario_horario_02 foreign key (horario_id) references horario (id) on delete restrict on update restrict;

# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists carona;

drop table if exists carona_usuario;

drop table if exists endereco;

drop table if exists horario;

drop table if exists notificacao;

drop table if exists solicitacao;

drop table if exists usuario;

drop table if exists usuario_horario;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists carona_seq;

drop sequence if exists endereco_seq;

drop sequence if exists horario_seq;

drop sequence if exists notificacao_seq;

drop sequence if exists solicitacao_seq;

drop sequence if exists usuario_seq;

