create table t02(
	num1 tinyint, 
	num2 int, 
	num3 bigint
);
insert into t02 values (1,1,1);
insert into t02 values (128,128,128);

select * from t02;

create table t03(
	num1 int,
	num2 double,
	num3 double(5,3)
);
select * from t03;
insert into t03 values (3);

create table t04(
	num int,
	nalja1 date,
	nalja2 datetime,
	nalja3 timestamp,
	nalja4 time
);
select * from t04;
insert into t04 values (1,now(),now(),now(),now());
insert into t04 (num,nalja1) values (2,'2022-12-31');
insert into t04 (num,nalja2) values (3,'2022-12-31');
insert into t04 (num,nalja3) values (4,'2022-12-31');
insert into t04 (num,nalja4) values (5,'12:00:00');

create table t05(
	name1 char(3),
	name2 varchar(3),
	name3 text
);
select * from t05;
insert into t05 values ('bbbb','bbb','bbb');

create table t11(
	num int,
	name varchar(3)
);

desc t11
alter table t11 add sub varchar(3);
alter table t11 drop column sub;
alter table t11 modify column (name varchar(3);
alter table t11 modify (name varchar(5));
alter table t11 rename column name to sub;

drop table t11;
alter table t11 rename t12;