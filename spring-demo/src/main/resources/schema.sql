create table t_city(
code int auto_increment,
city varchar(50),
country varchar(50),
total_museums int,
primary key(code)
);

create table t_museum(
id int auto_increment,
name varchar(50),
address varchar(70),
visitor int,
type varchar(50),
city varchar(50),
primary key(id)
);