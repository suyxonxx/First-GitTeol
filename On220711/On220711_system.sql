CREATE USER BOOK IDENTIFIED BY 1234
DEFAULT TABLESPACE USERS
TEMPORARY TABLESPACE TEMP;

GRANT CONNECT, DBA TO BOOK;

SELECT DBMS_XDB.GETHTTPPORT() FROM DUAL;

/*EXEC DBMS_XDB.SETHTTPPORT(9090);*/