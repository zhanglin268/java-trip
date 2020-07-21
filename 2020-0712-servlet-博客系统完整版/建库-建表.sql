create database hjb2-blog charset utf8mb4 ;
use hjb2_blog;
--用户表
create table users(
 id int primary key auto_increment,
 username varchar(40) not null unique ,
 );

 create table articles (
    id int primary key auto_increment,
    user_id int not null,
    title text not null,
    publish_at datetime not null,
 );

