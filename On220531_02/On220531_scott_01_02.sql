CREATE TABLE EMPLOYEE(
    name VARCHAR2(20),
    address VARCHAR2(100),
    ssn VARCHAR2(15)
);

SELECT name, address, ssn FROM EMPLOYEE;

INSERT INTO EMPLOYEE(name, address, ssn)
VALUES('duke', 'seoul', '970224-1039234');
INSERT INTO EMPLOYEE(name, address, ssn)
VALUES('pororo', 'pusan', '001222-3038782');
INSERT INTO EMPLOYEE(name, address, ssn)
VALUES('candy', 'daejeon', '981221-1829192');

COMMIT;

CREATE TABLE item(
    name VARCHAR2(20),
    price NUMBER(8),
    description VARCHAR2(100)
);

DESC item;

SELECT * FROM item;