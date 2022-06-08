use db0416;

create table jspBoard(
	no int auto_increment,
    name varchar(34) not null,
    subject varchar(1000) not null,
    content text not null,
    pwd varchar(10) not null,
    regdate datetime,
    hit int default 0,
    primary key(no)
);

desc jspBoard;

insert into jspBoard(name, subject, content, pwd, regdate)
values('홍길동', '홍길동전', '재미있는 홍길동', '1234', now());

select * from jspBoard;

commit;