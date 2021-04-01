drop table if exists hellohopper.subscriptions;
create table if not exists hellohopper.subscriptions (
    id serial primary key,
    title varchar(255),
    description varchar(255),
    thumbnail_url varchar(255),
    quantity int,
    price decimal(10,2)
);

drop table if exists hellohopper.recipes;
create table if not exists hellohopper.recipes (
    id serial primary key,
    title varchar(255),
    thumbnail_url varchar(255)
);
