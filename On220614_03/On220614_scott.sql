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

INSERT INTO MOVIE VALUES(MOVIE_SEQ.NEXTVAL, '������', 10000, '����ȯ', '������', 'movie1.jpg', '�Ŵ��� ������ ���� ������ ����� ���� ������ ��¼�� ��¼��');
INSERT INTO MOVIE VALUES(MOVIE_SEQ.NEXTVAL, '�ڼ��Ǵ�', 10000, '������', '�ڽž�, ������', 'movie2.jpg', '�Ǵ޷� �����, �������� ����� �װ��� �����δ�');
INSERT INTO MOVIE VALUES(MOVIE_SEQ.NEXTVAL, '���������', 10000, '�� ����', '�� ���', 'movie3.jpg', '�����');
INSERT INTO MOVIE VALUES(MOVIE_SEQ.NEXTVAL, '7������ ����', 9000, '��ȯ��', '���·�, ���ҿ�', 'movie4.jpg', '������ ��Ӱ�');

SELECT * FROM MOVIE;

COMMIT;