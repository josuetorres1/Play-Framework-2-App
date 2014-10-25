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

create sequence product_seq;

create sequence review_seq;

alter table product add constraint fk_product_image_1 foreign key (image_id) references image (id) on delete restrict on update restrict;
create index ix_product_image_1 on product (image_id);



# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists image;

drop table if exists product;

drop table if exists review;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists image_seq;

drop sequence if exists product_seq;

drop sequence if exists review_seq;

