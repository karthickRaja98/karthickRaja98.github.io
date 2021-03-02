-- drop database if exists kmk_database;
-- create database if not exists kmk_database;

use kmk_database;

drop table if exists property;

create table property(
   property_id int auto_increment,
   property_type varchar(20) not null,
   property_address_id int not null,
   
   constraint property_id_pk primary key (property_id),
   constraint property_type_check check (property_type in('Land','Rental','House')),
   constraint property_address_id_fk foreign key (property_address_id) 
   references address(address_id)
   
);

insert into property (property_id, property_type, property_address_id) 
values (301, "Land", 402);

insert into property (property_id, property_type, property_address_id) 
values (302, "House", 403);

insert into property (property_id, property_type, property_address_id) 
values (303, "Land", 406);

commit;
select * from property;