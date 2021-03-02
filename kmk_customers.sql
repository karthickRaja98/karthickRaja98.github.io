-- drop database if exists kmk_database;
-- create database if not exists kmk_database;

use kmk_database;

drop table if exists customer;

create table customer(

   customer_id int auto_increment,
   customer_name varchar(50) not null,
   customer_email varchar(100) not null,
   customer_age int not null,
   customer_dob date,
   customer_gender varchar(6) not null ,
   customer_address_id int not null,
   phone_number varchar(10) not null,
   date_of_joining date not null,
   property_search varchar(20) not null,
   
   constraint customer_id_pk primary key (customer_id),
   constraint customer_gender_check check(customer_gender in('Male','Female')),
   constraint property_search_check check (property_search in('Land','Rental','House')),
   constraint customer_address_id_fk foreign key (customer_address_id) 
   references address(address_id)
   
);

insert into customer (customer_id, customer_name,
customer_email, customer_age, customer_dob, customer_gender, customer_address_id, 
phone_number, date_of_joining, property_search) 
values (101, 'John', 'john@gmail.com', 35, 
'1985-08-08', 'Male', 404, 1234567890, curdate(), 'Land');

insert into customer (customer_id, customer_name,
customer_email, customer_age, customer_dob, customer_gender, customer_address_id, 
phone_number, date_of_joining, property_search) 
values (102, 'Martin', 'martin@gmail.com', 50, 
'1970-05-01', 'Male', 405, 1234567890, curdate(), 'House');

commit;
select * from customer;