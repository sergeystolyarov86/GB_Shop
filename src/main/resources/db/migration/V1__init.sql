
create table if not exists products(id bigserial primary key,title varchar(255),cost double);
insert into products (title,cost) values ('apple',85),('milk',75),('bread',56),('juice',125),('water',45),('tea',77),
('banana',47),('beer',55),('potato',46),('jin',129),('lemon',39),('cucumber',67);
