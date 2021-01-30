create table orders
(
    id bigint not null constraint order_pkey primary key,
    product_id bigint not null,
    amount int,
    customer_first_name varchar(255),
    customer_last_name varchar(255)
);

alter table orders owner to postgres;
