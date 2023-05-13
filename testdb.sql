CREATE TABLE tutorials(
id integer primary key,
title varchar(255),
description varchar(255)L,
published bool 
);

INSERT INTO tutorials 
VALUES(1,'React Spring Boot Tut#1','Tut#1 Description',false),
(2,'React CRUD Tut#2','Tut#2 Description',false),
(3,'React Boot Web Tut#3','Tut#3 Description',false),
(4,'React Hook CRUD Tut#4','Tut#4 Description',false),
(5,'Spring Data Boot Tut#5','Tut#5 Description',false);

SELECT * FROM tutorials;
