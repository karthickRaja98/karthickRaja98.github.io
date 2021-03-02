-- drop database if exists kmk_database;
-- create database if not exists kmk_database;

use kmk_database;

drop table if exists seller;

create table seller(
   seller_id int auto_increment,
   seller_name varchar(50) not null,
   seller_email varchar(100) not null,
   seller_age int not null,
   seller_dob date,
   seller_gender varchar(6) not null ,
   seller_address_id int not null,
   phone_number varchar(10) not null,
   date_of_joining date not null,
   property_id int,
   
   constraint seller_gender_check check(seller_gender in('Male','Female')),
   constraint seller_id_pk primary key (seller_id),
   constraint seller_address_id_fk foreign key (seller_address_id) 
   references address(address_id),
   constraint seller_property_id_fk foreign key (property_id) references property(property_id)
);

insert into seller (seller_id, seller_name,
seller_email, seller_age, seller_dob, seller_gender, seller_address_id, 
phone_number, date_of_joining, property_id)  
values (201, 'Karthick Raja M', 'karthickraja@gmail.com', 23, 
'1998-02-02', 'Male', 401, 9994872299, curdate(), 303);

commit;
select * from seller;