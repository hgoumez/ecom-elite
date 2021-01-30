create table product
(
    id   bigint not null
        constraint product_pkey
            primary key,
    name varchar(255),
    description varchar(255),
    price bigint not null
);

alter table product
    owner to postgres;
