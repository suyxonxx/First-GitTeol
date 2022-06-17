CREATE TABLE WORKER ( /*������*/
    ID VARCHAR2(20) NOT NULL PRIMARY KEY, /*���̵�*/
    PWD VARCHAR2(20), /*��ȣ*/
    NAME VARCHAR2(40), /*�̸�*/
    PHONE VARCHAR2(20) /*��ȭ��ȣ*/
);

DESC WORKER;

CREATE TABLE ADDRESS ( /*�ּ�*/
    ZIP_NUM VARCHAR2(7), /*�����ȣ*/
    SIDO VARCHAR2(30), /*�õ�*/
    GUGUN VARCHAR2(30), /*����*/
    DONG VARCHAR2(100), /*��*/
    ZIP_CODE VARCHAR2(30), /*�����ڵ�*/
    BUNJI VARCHAR2(30) /*����*/
);

DESC ADDRESS;

CREATE TABLE MEMBER ( /*ȸ��*/
    ID VARCHAR2(20) NOT NULL PRIMARY KEY, /*ȸ�����̵�*/
    PWD VARCHAR2(20), /*ȸ����ȣ*/
    NAME VARCHAR2(40), /*ȸ���̸�*/
    EMAIL VARCHAR2(40), /*ȸ���̸���*/
    ZIP_NUM VARCHAR2(7), /*�����ȣ*/
    ADDRESS VARCHAR2(100), /*�ּ�*/
    PHONE VARCHAR2(20), /*��ȭ��ȣ*/
    USEYN CHAR(1) DEFAULT 'Y', /*Ż�𿩺� (Y :��밡��, N :Ż��)*/
    INDATE DATE DEFAULT SYSDATE /*������*/
);

DESC MEMBER;

CREATE TABLE PRODUCT ( /*��ǰ*/
    PSEQ NUMBER(5) NOT NULL PRIMARY KEY, /*��ǰ��ȣ (PRODUCT_SEQ ������ ��ü�� �ڵ� �Ϸ� ��ȣ �ο�)*/
    NAME VARCHAR2(100) DEFAULT '0', /*��ǰ��*/
    KIND CHAR(1), /*��ǰ���� (1 : ��, 2 : ����, 3 : ����, 4 : ������, 5 : ����Ŀ��)*/
    PRICE1 NUMBER(7) DEFAULT 0, /*����*/
    PRICE2 NUMBER(7) DEFAULT 0, /*�ǸŰ�*/
    PRICE3 NUMBER(7) DEFAULT 0, /*�ǸŰ�-����*/
    CONTENT VARCHAR2(1000) DEFAULT NULL, /*��ǰ����*/
    IMAGE VARCHAR2(50) DEFAULT 'default.jpg', /*��ǰ�̹���*/
    USEYN CHAR(1) DEFAULT 'Y', /*��ǰ�������� (Y : ��밡��, N : ���Ұ���)*/
    BESTYN CHAR(1) DEFAULT 'N', /*����Ʈ��ǰ���� (Y : ����Ʈ ��ǰ, N : ����Ʈ ��ǰ �ƴ�)*/
    INDATE DATE DEFAULT SYSDATE /*�����*/
);

DESC PRODUCT;

CREATE TABLE CART ( /*��ٱ���*/
    CSEQ NUMBER(10) NOT NULL PRIMARY KEY, /*��ٱ��Ϲ�ȣ (CART_SEQ ������ ��ü�� �ڵ� �Ϸ� ��ȣ �ο�)*/
    ID VARCHAR2(20), /*ȸ�����̵� (MEMBER ���̺��� �⺻Ű�� ID �÷�)*/
    PSEQ NUMBER(5), /*��ǰ��ȣ (PRODUCT���̺��� �⺻Ű�� PSEQ �÷�)*/
    QUANTITY NUMBER(5) DEFAULT 1, /*����*/
    RESULT CHAR(1) DEFAULT '1', /*ó���ϷῩ�� (1 : ��ó�� 2 : ó��)*/
    INDATE DATE DEFAULT SYSDATE /*�����*/
);

DESC CART;

CREATE TABLE ORDERS ( /*�ֹ�*/
    OSEQ NUMBER(10) NOT NULL PRIMARY KEY, /*�ֹ���ȣ (ORDERS_SEQ ������ ��ü�� �ڵ� �Ϸ� ��ȣ �ο�)*/
    ID VARCHAR2(20) , /*�ֹ��� ���̵� (MEMBER ���̺��� �⺻Ű�� ID �÷�)*/
    INDATE DATE DEFAULT SYSDATE /*�ֹ���*/
);

DESC ORDERS;

CREATE TABLE ORDER_DETAIL ( /*�ֹ� ��*/
    ODSEQ NUMBER(10) NOT NULL PRIMARY KEY, /*�ֹ��󼼹�ȣ (ORDER_DETAIL_SEQ ������ �� ü�� �ڵ� �Ϸ� ��ȣ �ο�)*/
    OSEQ NUMBER(10), /*�ֹ���ȣ (ORDERS ���̺��� �⺻ Ű�� OSEQ �÷�)*/
    PSEQ NUMBER(5), /*��ǰ��ȣ (PRODUCT ���̺��� �⺻ Ű�� PSEQ �÷�)*/
    QUANTITY NUMBER(5), /*�ֹ�����*/
    RESULT CHAR(1) /*ó������ (1 :��ó�� 2 : ó��)*/
);

DESC ORDER_DETAIL;

CREATE TABLE QNA ( /*QNA �Խ���*/
    QSEQ NUMBER(5) NOT NULL PRIMARY KEY, /*�۹�ȣ (QNA_SEQ ������ ��ü�� �ڵ� �Ϸ� ��ȣ �ο�)*/
    SUBJECT VARCHAR2(30), /*����*/
    CONTENT VARCHAR2(1000), /*���ǳ���*/
    REPLY VARCHAR2(1000), /*�亯����*/
    ID VARCHAR2(20), /*�ۼ��ھ��̵� (MEMBER ���̺��� �⺻Ű)*/
    REP CHAR(1), /*�亯���� (1 : �亯 ��, 2 : �亯 ��)*/
    INDATE DATE DEFAULT SYSDATE /*�ۼ���*/
);

DESC QNA;
