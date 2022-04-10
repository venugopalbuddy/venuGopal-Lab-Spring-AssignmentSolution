insert into users(username,password) values('suresh','$2a$12$nuKl2ADqvkW599106w0sV.zfWkAoFyW1mXJr6iA9J.imZXTyOLWu2');
insert into users(username,password) values('admin','$2a$12$6/INNItxuTXsG615DX0AXOxD8rP1nCf/foMJMg1EazXDS7wIpbzk.');

insert into roles(name) values('USER');
insert into roles(name) values('ADMIN');


insert into student(first_name,last_Name,country,department) values('Raj','Deep','Ind','B.Tech');
insert into student(first_name,last_Name,country,department) values('Ravi','Kumar','Aus','B.Com');


insert into users_roles(user_id,role_id) values(1,1);
insert into users_roles(user_id,role_id) values(2,2);
