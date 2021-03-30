create table if not exists subscriptions (
	id int primary key,
	price decimal(10,2) not null,
	frequency int not null,
	description varchar(255) not null,
);
