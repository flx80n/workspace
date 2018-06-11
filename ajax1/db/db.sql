set names utf8;
use emp;
create table t_student(
	id int primary key auto_increment,
	sn char(20) unique not null default '',
	name varchar(20) not null default ''
)ENGINE = innoDB;

insert into t_student values(null,'20161107','张三');
insert into t_student values(null,'20161108','李四');
insert into t_student values(null,'20161109','王五');
insert into t_student values(null,'20161110','jerry');
insert into t_student values(null,'20161111','tom');

--id name price count type city
create table t_car(
	id     int primary key auto_increment,
	name   varchar(25)   not null default '',
	price  decimal(10,2) not null  default 0,
	counts int not null  default 0,
	brand  varchar(25)   not null default '',
	city   varchar(25)   not null default ''
)ENGINE = innoDB;


INSERT INTO t_car VALUES(null,'丰田',50000.00,20,'toyota','北京');
INSERT INTO t_car VALUES(null,'宝马',60000.00,20,'X6系列','上海');
INSERT INTO t_car VALUES(null,'奇瑞',70000.00,20,'x001','兰州');
INSERT INTO t_car VALUES(null,'吉普',80000.00,20,'C6','北京');
INSERT INTO t_car VALUES(null,'奔驰',90000.00,20,'X8','北京');
INSERT INTO t_car VALUES(null,'捷达',100000.00,20,'大众','北京');
INSERT INTO t_car VALUES(null,'',250000.00,20,'','北京');
INSERT INTO t_car VALUES(null,'奥迪',500000.00,30,'A6','北京');




t_stu2 {id,name,clazzId}
	添加15条记录
set names utf8;
use emp;
create table t_stu2(
	id     int primary key auto_increment,
	name   varchar(25)   not null default '',
	clazzId   varchar(25)   not null default ''
)ENGINE = innoDB;

insert into t_stu2 values(null,'东东','java1607');
insert into t_stu2 values(null,'张三','java1607');
insert into t_stu2 values(null,'李四','java1607');
insert into t_stu2 values(null,'王五','java1607');
insert into t_stu2 values(null,'赵一','java1607');
insert into t_stu2 values(null,'钱二','java1607');
insert into t_stu2 values(null,'孙三','java1607');
insert into t_stu2 values(null,'jerry','java1607');
insert into t_stu2 values(null,'tom','java1607');
insert into t_stu2 values(null,'kaka','java1607');
insert into t_stu2 values(null,'marry','java1607');
insert into t_stu2 values(null,'阿苍','java1607');
insert into t_stu2 values(null,'刘芒','java1607');
insert into t_stu2 values(null,'崔俟','java1607');
insert into t_stu2 values(null,'曹操','java1607');













