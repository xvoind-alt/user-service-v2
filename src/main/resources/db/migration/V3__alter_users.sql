create type users_gender as enum ('male', 'female', 'unknown');

alter table "users"
    add column gender users_gender not null default 'unknown',
    add column phone_number text,
    add column surname text;

alter table "users"
    add column id_new uuid default gen_random_uuid();

alter table "users"
    alter column id_new set not null;

alter table "users"
    drop constraint users_pkey;

alter table "users"
    add primary key (id_new);

alter table "users"
    drop column id;

alter table "users"
    rename column id_new to id;


