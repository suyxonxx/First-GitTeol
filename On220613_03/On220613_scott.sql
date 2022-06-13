CREATE TABLE PRODUCT(
    CODE NUMBER(5),
    NAME VARCHAR2(100),
    PRICE NUMBER(8),
    PICTUREURL VARCHAR(50),
    DESCRIPTION VARCHAR(1000),
    PRIMARY KEY(CODE)
);

DESC PRODUCT;

CREATE SEQUENCE PRODUCT_SEQ START WITH 1 INCREMENT BY 1;

INSERT INTO PRODUCT VALUES(PRODUCT_SEQ.NEXTVAL, '������ ���� ����ִ� �����ͺ��̽�', 27000, 'db.jpg', '�����ͺ��̽��� ���� ��� ���� ���� ����ְ� ������ ����...');
INSERT INTO PRODUCT VALUES(PRODUCT_SEQ.NEXTVAL, '��ǥ���� ���� HTML5', 25000, 'html5.jpg', 'HTML5 ���̵��. Ȩ������ ������ ���� �ʼ� ���� HTML �⺻ ����...');
INSERT INTO PRODUCT VALUES(PRODUCT_SEQ.NEXTVAL, 'Dynamic Programming book �ø���-01 ����Ŭ 11g + PL/SQL', 25000, 'oracle.jpg','Dynamic �ǹ� ��Ī ���α׷��� Book�� ù��° å����, ����Ŭ 11g�� ���ο� ...');
INSERT INTO product VALUES(product_seq.NEXTVAL, 'Visual C++ MFC ������ ���α׷���', 26000, 'mfc.jpg', 'Visual C++�� ó�� �����ϴ� ������ �����̿� ���� Visual C++...');
INSERT INTO product VALUES(product_seq.NEXTVAL, 'jQuery and jQuery Mobile : �����ϱ� ���� Ǯ�', 25000, 'jquery.jpg', '�ҽ� �ϳ��� ����ũž�� ����ϱ��� HTML5�� �Բ� ����Ѵ�. �ʺ��ڵ鵵 ...');

SELECT * FROM PRODUCT;

COMMIT;