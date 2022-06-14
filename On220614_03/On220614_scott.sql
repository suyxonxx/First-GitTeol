CREATE TABLE MOVIE (
    CODE NUMBER(4) PRIMARY KEY,
    TITLE VARCHAR2(50) NOT NULL,
    PRICE NUMBER(10),
    DIRECTOR VARCHAR2(20),
    ACTOR VARCHAR2(20),
    POSTER VARCHAR2(100),
    SYNOPSIS VARCHAR2(3000)
);

DESC MOVIE;

CREATE SEQUENCE MOVIE_SEQ START WITH 1 INCREMENT BY 1;

INSERT INTO MOVIE VALUES(MOVIE_SEQ.NEXTVAL, '베를린', 10000, '류승환', '하정우', 'movie1.jpg', '거대한 국제적 음모가 숨겨진 운명의 도시 베를린 어쩌구 저쩌구');
INSERT INTO MOVIE VALUES(MOVIE_SEQ.NEXTVAL, '박수건달', 10000, '조진규', '박신양, 엄지원', 'movie2.jpg', '건달로 사느냐, 무당으로 사느냐 그것이 문제로다');
INSERT INTO MOVIE VALUES(MOVIE_SEQ.NEXTVAL, '레미제라블', 10000, '톰 후퍼', '휴 잭맨', 'movie3.jpg', '장발장');
INSERT INTO MOVIE VALUES(MOVIE_SEQ.NEXTVAL, '7번방의 선물', 9000, '이환경', '류승룡, 갈소원', 'movie4.jpg', '예승이 콩머겅');

SELECT * FROM MOVIE;

COMMIT;