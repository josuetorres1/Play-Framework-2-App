# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table image (
  id                        bigint not null,
  constraint pk_image primary key (id))
;

create table product (
  id                        bigint not null,
  name                      varchar(255),
  description               varchar(255),
  shine                     float,
  price                     float,
  rarity                    integer,
  color                     varchar(255),
  face                      integer,
  image_id                  bigint,
  constraint pk_product primary key (id))
;

create table review (
  id                        integer not null,
  constraint pk_review primary key (id))
;

create sequence image_seq;

create sequence users_id_seq;

create sequence review_seq;

alter table product add constraint fk_product_image_1 foreign key (image_id) references image (id);
create index ix_product_image_1 on product (image_id);



# --- !Downs

drop table if exists image cascade;

drop table if exists product cascade;

drop table if exists review cascade;

drop sequence if exists image_seq;

drop sequence if exists users_id_seq;

drop sequence if exists review_seq;

