-- xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
-- PERSON SERVICE
-- xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

-- dropping schema
drop schema if exists person cascade;

-- creating schema and tables
create schema person;

-- basic tables
-- ==================================================
-- drop table if exists person.person;
create table if not exists person.person (
	id serial primary key,
	first_name varchar(128) not null,
	last_name varchar(128),
	display_name varchar(32),
	email varchar(128) not null unique
);

-- drop table if exists person.address;
create table if not exists person.address (
	id serial primary key,
    person_id integer references person.person,
	address_line1 varchar(128) not null,
	address_line2 varchar(128),
	address_line3 varchar(128),
	country varchar(64) not null,
	state varchar(64) not null,
	city varchar(128) not null,
	zip_code varchar(12) not null
);