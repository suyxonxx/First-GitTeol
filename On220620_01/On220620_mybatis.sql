CREATE TABLE BOARD (
    ID NUMBER(5) PRIMARY KEY,
    NAME VARCHAR(20),
    PHONE VARCHAR2(20),
    ADDRESS VARCHAR2(50)
);

DESC BOARD;

INSERT INTO BOARD VALUES(1, '홍길동', '010-0101-1010', '방방곡곡');
INSERT INTO BOARD VALUES(2, '홍길서', '010-0101-1011', '방방곡곡');
INSERT INTO BOARD VALUES(3, '홍길남', '010-0101-1012', '방방곡곡');
INSERT INTO BOARD VALUES(4, '홍길북', '010-0101-1013', '방방곡곡');
INSERT INTO BOARD VALUES(5, '홍길숙', '010-0101-1014', '방방곡곡');

SELECT * FROM BOARD;

UPDATE BOARD SET NAME='홍길동', PHONE='010-0101-1012', ADDRESS='방방곡곡' WHERE ID=1;

COMMIT;