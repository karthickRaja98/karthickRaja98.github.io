drop database if exists kmk_database;
create database if not exists kmk_database;

use kmk_database;

drop table if exists address;

create table address(
	address_id int auto_increment,
    street_name varchar(150) not null,
    city varchar(25) not null,
    state varchar(25) not null,
    country varchar(25) not null,
    pincode int not null,
    
    constraint address_id_pk primary key (address_id)
    
);

insert into address (address_id, street_name, city, state, country, pincode) 
values (401, "KMK Street", "Madurai", "Tamil Nadu", "India", 625017);

insert into address (address_id, street_name, city, state, country, pincode) 
values (402, "KMK Street", "Madurai", "Tamil Nadu", "India", 625017);

insert into address (address_id, street_name, city, state, country, pincode) 
values (403, "KMK Street", "Madurai", "Tamil Nadu", "India", 625017);

insert into address (address_id, street_name, city, state, country, pincode) 
values (404, "KMK Street", "Madurai", "Tamil Nadu", "India", 625017);

insert into address (address_id, street_name, city, state, country, pincode) 
values (405, "KMK Street", "Madurai", "Tamil Nadu", "India", 625017);

insert into address (address_id, street_name, city, state, country, pincode) 
values (406, "KMK Street", "Madurai", "Tamil Nadu", "India", 625017);

commit;
select * from address;