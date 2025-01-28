-- xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
-- PERSON SERVICE
-- xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

-- dropping schema
drop schema if exists person cascade;

-- creating schema and tables
create schema person;

-- basic tables
-- ==================================================
-- drop table if exists climate.person;
create table if not exists person.person (
	id serial primary key,
	first_name varchar(128) not null,
	last_name varchar(128),
	display_name varchar(32),
	email varchar(128) not null unique
);