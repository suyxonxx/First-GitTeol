CREATE TABLE MEMBER_TBL_02 (
    CUSTNO NUMBER(6) NOT NULL, /*ȸ����ȣ*/
    CUSTNAME VARCHAR2(20), /*ȸ������*/
    PHONE VARCHAR2(13), /*ȸ����ȭ*/
    ADDRESS VARCHAR2(60), /*�ּ�*/
    JOINDATE DATE, /*��������*/
    GRADE CHAR(1), /*�������*/
    CITY CHAR(2), /*���ֵ���*/
    PRIMARY KEY (CUSTNO)
);

DESC MEMBER_TBL_02;

-- ���� �� CRUD ���Ѻο�
GRANT INSERT, UPDATE, DELETE, SELECT ON MEMBER_TBL_02 TO SYSTEM;

-- ȸ������ ���̺��� ���� ������ �߰�
CREATE SEQUENCE MEMBER_SEQ
START WITH 100001 
INCREMENT BY 1 
MINVALUE 100001 
CACHE 10;

-- ������ ���� �߰�
GRANT ALTER, SELECT ON MEMBER_SEQ TO SYSTEM;

INSERT INTO MEMBER_TBL_02 VALUES(100001, '���ູ', '010-1111-2222',
    '���� ���빮�� �ְ�1��', '20151202', 'A', '01');
INSERT INTO MEMBER_TBL_02 VALUES(100002, '���ູ', '010-1111-3333',
    '���� ���빮�� �ְ�2��', '20151206', 'B', '01');
INSERT INTO MEMBER_TBL_02 VALUES(100003, '�����', '010-1111-4444',
    '�︪�� �︪�� ����1��', '20151001', 'B', '30');
INSERT INTO MEMBER_TBL_02 VALUES(100004, '�ֻ��', '010-1111-5555',
    '�︪�� �︪�� ����2��', '20151113', 'A', '30');
INSERT INTO MEMBER_TBL_02 VALUES(100005, '����ȭ', '010-1111-6666',
    '���ֵ� ���ֽ� �ܳ�����', '20151225', 'B', '60');
INSERT INTO MEMBER_TBL_02 VALUES(100006, '������', '010-1111-7777',
    '���ֵ� ���ֽ� ��������', '20151211', 'C', '60');

SELECT * FROM MEMBER_TBL_02;

CREATE TABLE MONEY_TBL_02 (
    CUSTNO NUMBER(6) NOT NULL, /*ȸ����ȣ*/
    SALENOL NUMBER(8) NOT NULL, /*�ǸŹ�ȣ*/
    PCOST NUMBER(8), /*�ܰ�*/
    AMOUNT NUMBER(4), /*����*/
    PRICE NUMBER(8), /*����*/
    PCODE VARCHAR2(4), /*��ǰ�ڵ�*/
    SDATE DATE, /*�Ǹ�����*/
    PRIMARY KEY(CUSTNO, SALENOL)
);

DESC MONEY_TBL_02;

-- ���� �ο�
GRANT INSERT, UPDATE, DELETE, SELECT ON MONEY_TBL_02 TO SYSTEM;

INSERT INTO MONEY_TBL_02
VALUES(100001, 20160001, 500, 5, 2500, 'A001', '20160101');
INSERT INTO MONEY_TBL_02
VALUES(100001, 20160002, 1000, 4, 4000, 'A002', '20160101');
INSERT INTO MONEY_TBL_02
VALUES(100001, 20160003, 500, 3, 1500, 'A008', '20160101');
INSERT INTO MONEY_TBL_02
VALUES(100002, 20160004, 2000, 1, 2000, 'A004', '20160102');
INSERT INTO MONEY_TBL_02
VALUES(100002, 20160005, 500, 1, 500, 'A001', '20160103');
INSERT INTO MONEY_TBL_02
VALUES(100003, 20160006, 1500, 2, 3000, 'A003', '20160103');
INSERT INTO MONEY_TBL_02
VALUES(100004, 20160007, 500, 2, 1000, 'A001', '20160104');
INSERT INTO MONEY_TBL_02
VALUES(100004, 20160008, 300, 1, 300, 'A005', '20160104');
INSERT INTO MONEY_TBL_02
VALUES(100004, 20160009, 600, 1, 600, 'A006', '20160104');
INSERT INTO MONEY_TBL_02
VALUES(100004, 20160010, 3000, 1, 3000, 'A007', '20160106');

SELECT * FROM MONEY_TBL_02;

SELECT MEM.CUSTNO, MEM.CUSTNAME, MEM.GRADE, SUM(MON.PRICE)
FROM MEMBER_TBL_02 MEM, MONEY_TBL_02 MON
WHERE MEM.CUSTNO = MON.CUSTNO
GROUP BY MEM.CUSTNO, MEM.CUSTNAME, MEM.GRADE
ORDER BY SUM(MON.PRICE) DESC;

COMMIT;