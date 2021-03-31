drop table if exists hellohopper.subscriptions;
create table if not exists hellohopper.subscriptions (
	id varchar(255) primary key,
	title varchar(255),
    description varchar(255),
    thumbnail_url varchar(255),
    quantity int,
    price decimal(10,2)
);

--drop table if exists hellohopper.recipes;
--create table if not exists hellohopper.recipes (
--    id bigint,
--    title varchar(255) primary key,
--    thumbnail_url varchar(255)
--);