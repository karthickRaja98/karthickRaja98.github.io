-- drop database if exists kmk_database;
-- create database if not exists kmk_database;

use kmk_database;

drop table if exists customer_points;

create table customer_points(
	customer_point_id int auto_increment,
    customer_point_count int default 0,
    property_purchased_count int default 0,
    
    constraint customer_point_id_pk primary key (customer_point_id)
    
);