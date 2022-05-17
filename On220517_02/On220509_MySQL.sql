show databases;
/*create database mydb character set utf8 collate utf8_general_ci;*/

use mydb; /*'mydb'를 사용하겠다고 선언하는 것*/

create table member(
	no integer auto_increment, /*auto_increment : 데이터를 입력할 때마다 숫자를 1씩 자동 증가시킴*/
    name varchar(34) not null, /*not null : 빈칸 입력 불가*/
    sex varchar(10) not null,
    content text,
    primary key(no) /*primary key : 기본키 중복을 불허*/
);

/*테이블 구조 확인*/
desc member;

/*데이터 검색*/
select * from member; /*실행 단축키 : ctrl + enter (입력 데이터 조회.)*/
select name from member; /*member table에서 name만 보여달라는 의미*/
select * from member where no = '4'; /*member table에서 no가 3번인 member만 보여달라.*/
select count(*) from member; /*counting members in table*/

/*데이터 입력*/
insert into member(no, name, sex, content)
values(1, '홍길동', '남자', '나는 홍길동이다');
insert into member(no, name, sex, content)
values(2, '홍잠언', '남자', '홍잠언이여허어');
insert into member(no, name, sex, content)
values(3, '홍길순', '여자', '길순댁입니다');
insert into member(no, name, sex, content)
values(4, '홍길영', '여자', '이 동네는 길이 영...');
insert into member(no, name, sex, content)
values(5, '이성계', '남자', '조선 레스기릿');
insert into member(no, name, sex, content)
values(6, '신사임당', '여자', '50000원 플렉스');
insert into member(no, name, sex, content)
values(7, '정약용', '남자', '목민심서');
insert into member(no, name, sex, content)
values(8, '이황', '남자', '퇴계');
insert into member(no, name, sex, content)
values(9, '박제가', '남자', '상단이 뜰것이여');
insert into member(no, name, sex, content)
values(10, '유관순', '여자', '대한독립 만세');

/*데이터 삭제*/
delete from member where no = 4;

/*데이터 수정*/
update member set name = '홍이', sex = '여자', content = '호오오옹이?'
where no = 3;

commit;

insert into member(no, name, sex, content) values(11, '김홍도', '남자', '아릐스트 킴');
insert into member(no, name, sex, content) values(13, '이이', '남자', '율곡');