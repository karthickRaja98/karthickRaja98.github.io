-- drop database if exists kmk_database;
-- create database if not exists kmk_database;

use kmk_database;

drop table if exists seller_points;

create table customer_points(
	seller_point_id int auto_increment,
    seller_point_count int default 0,
    property_sold_count int default 0,
    
    constraint seller_point_id_pk primary key (seller_point_id)
    
);