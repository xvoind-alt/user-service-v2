create table "users"
(
    id bigserial primary key not null,
    name text not null,
    email text unique not null
);

