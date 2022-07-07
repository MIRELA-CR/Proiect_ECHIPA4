create table t_city(
code int,
city varchar(50),
country varchar(50),
total_museums int
);

create table t_museum(
id int,
name varchar(50),
address varchar(70),
visitor int,
type varchar(50),
city varchar(50)
);