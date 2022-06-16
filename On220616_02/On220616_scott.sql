CREATE TABLE EMPLOYEES (
    ID VARCHAR2(10) NOT NULL,
    PASS VARCHAR2(10) NOT NULL,
    NAME VARCHAR2(24),
    LEV CHAR(1) DEFAULT 'A', /*A : ���, B : �Ϲ�ȸ��*/
    ENTER DATE DEFAULT SYSDATE, /*�����*/
    GENDER CHAR(1) DEFAULT '1', /*1 : ����, 2 : ����*/
    PHONE VARCHAR2(30),
    PRIMARY KEY(ID)
);

DESC EMPLOYEES;

INSERT INTO EMPLOYEES VALUES('pinksung', '3333', '������', 'A'
    , '2014-04-17', '2', '010-2222-2222');
INSERT INTO EMPLOYEES VALUES('subin', '1234', '������', 'B'
    , '2014-04-17', '1', '010-9999-9999');
INSERT INTO EMPLOYEES VALUES('admin', '1111', '���', 'A'
    , '2014-04-17', '1', '010-1111-1111');

SELECT * FROM EMPLOYEES;

COMMIT;

/*
public class EmployeesVO {
	private String id;
	private String pass;
	private String name;
	private String lev;
	private Timestamp enter;
	private String gender;
	private String phone;
}
*/