/*  COUNTRIES 테이블에서 REGION_ID가 3인 COUNTRY_ID가 포함된 LOCATIONS 테이블의
    CITY, STATE_PROVINCE, STREET_ADDRESS를 조회*/
SELECT CITY, STATE_PROVINCE, STREET_ADDRESS
FROM LOCATIONS
WHERE COUNTRY_ID IN (
    SELECT COUNTRY_ID
    FROM COUNTRIES
    WHERE REGION_ID = 3
);

/*  DEPARTMENTS 테이블에서 MANAGER_ID가 NULL이 아닌 DEPARTMENT_ID와 일치하는
    EMPLOYEES 테이블의 FIRST_NAME, LAST_NAME, JOB_ID, SALARY를 조회*/
SELECT FIRST_NAME, LAST_NAME, JOB_ID, SALARY
FROM EMPLOYEES
WHERE DEPARTMENT_ID IN (
    SELECT DEPARTMENT_ID
    FROM DEPARTMENTS
    WHERE MANAGER_ID IS NOT NULL
);

/*  LOCATIONS 테이블에서 CITY가 'Seattle'을 포함하지 않는 LOCATIONS_ID와 일치하는
    DEPARTMENTS 테이블의 DEPARTMENT_ID, DEPARTMENT_NAME을 조회*/
SELECT DEPARTMENT_ID, DEPARTMENT_NAME
FROM DEPARTMENTS
WHERE LOCATION_ID IN (
    SELECT LOCATION_ID
    FROM LOCATIONS
    WHERE CITY <> 'Seattle'
);

/*  REGIONS 테이블에서 REGION_NAME이 'Europe'인 region_id가 일치하는
    COUNTRIES 테이블에서 COUNTRY_ID가 포함된 LOCATIONS 테이블의
    CITY, STATE_PROVINCE, STREET_ADDRESS를 조회*/
SELECT CITY, STATE_PROVINCE, STREET_ADDRESS
FROM LOCATIONS
WHERE COUNTRY_ID IN (
    SELECT COUNTRY_ID
    FROM COUNTRIES
    WHERE REGION_ID IN (
        SELECT REGION_ID
        FROM REGIONS
        WHERE REGION_NAME = 'Europe'
    )
);

/*
DML (Data Manipulation Language)
SELECT
INSERT
UPDATE
DELETE
CRUD(Create Read Update Delete)
*/
DESC COUNTRIES;

SELECT * FROM COUNTRIES;

INSERT INTO COUNTRIES(COUNTRY_ID, COUNTRY_NAME, REGION_ID)
VALUES('KR', 'South Korea', 3);
INSERT INTO COUNTRIES
VALUES('KP', 'North Korea', 3);

UPDATE COUNTRIES
SET COUNTRY_NAME = 'South Korea'
WHERE COUNTRY_ID = 'KR';

DELETE 
FROM COUNTRIES
WHERE COUNTRY_ID = 'KP';

COMMIT;

SELECT *
FROM JOBS
WHERE JOB_ID = 'IT_PROG';

UPDATE JOBS
SET MIN_SALARY = 10000, MAX_SALARY = 20000
WHERE JOB_ID = 'IT_PROG';

COMMIT;

/*
COUNTRIES 테이블의 COUNTRY_ID, COUNTRY_NAME, REGION_ID 값으로 다음 값들을 추가하기
AT, Austria, 1
NO, Norway, 1
ID, Indonesia, 3
TR, Turkey, 4
*/
SELECT * FROM COUNTRIES;

INSERT INTO COUNTRIES(COUNTRY_ID, COUNTRY_NAME, REGION_ID)
VALUES('AT', 'Austria', 1);
INSERT INTO COUNTRIES(COUNTRY_ID, COUNTRY_NAME, REGION_ID)
VALUES('NO', 'Norway', 1);
INSERT INTO COUNTRIES(COUNTRY_ID, COUNTRY_NAME, REGION_ID)
VALUES('ID', 'Indonesia', 3);
INSERT INTO COUNTRIES(COUNTRY_ID, COUNTRY_NAME, REGION_ID)
VALUES('TR', 'Turkey', 4);

COMMIT;
