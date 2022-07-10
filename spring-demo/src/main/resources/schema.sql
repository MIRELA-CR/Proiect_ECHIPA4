create table t_city(
id int auto_increment,
name varchar(50),
country varchar(50),
total_museums int,
primary key(id)
);

create table t_museum(
id int auto_increment,
name varchar(50),
address varchar(70),
visitor int,
type varchar(50),
id_city int,
primary key(id),
foreign key(id_city) references t_city(id)
);











