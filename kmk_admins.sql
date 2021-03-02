-- drop database if exists kmk_database;
-- create database if not exists kmk_database;

use kmk_database;

drop table if exists admins;

create table admins(
   admin_id int auto_increment,
   admin_name varchar(50) not null,
   admin_email varchar(100) not null,
   admin_age int not null,
   admin_dob date,
   admin_gender varchar(6) not null ,
   admin_address_id int not null,
   phone_number varchar(10) not null,
   date_of_joining date not null,
   property_id int,
   
   constraint admin_gender_check check(admin_gender in('Male','Female')),
   constraint admin_id_pk primary key (admin_id),
   constraint admin_address_id_fk foreign key (admin_address_id) 
   references address(address_id),
   constraint property_id_fk foreign key (property_id) references property(property_id)
);

insert into admins (admin_id, admin_name,
admin_email, admin_age, admin_dob, admin_gender, admin_address_id, 
phone_number, date_of_joining, property_id)
values (501, 'Murugan K', 'murugan@gmail.com', 48, 
'1972-08-08', 'Male', 401, 9994872299, curdate(), 301);

insert into admins (admin_id, admin_name,
admin_email, admin_age, admin_dob, admin_gender, admin_address_id, 
phone_number, date_of_joining, property_id) 
values (502, 'Valli M', 'valli@gmail.com', 45, 
'1975-05-01', 'Female', 401, 9994872299, curdate(), 302);

insert into admins (admin_id, admin_name,
admin_email, admin_age, admin_dob, admin_gender, admin_address_id, 
phone_number, date_of_joining, property_id)  
values (503, 'Kavi Priya M', 'kavipriya@gmail.com', 24, 
'1996-05-29', 'Female', 401, 9994872299, curdate(), null);

commit;
select * from admins;