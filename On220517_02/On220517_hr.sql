--COUNTRIES ���̺��� �÷���  COUNTRY_ID�� ���� ID, COUNTRY_NAME�� ���������� ��ȸ
SELECT COUNTRY_ID AS ����ID, COUNTRY_NAME AS ������
FROM COUNTRIES;

--COUNTRIES ���̺��� REGION_ID�� �ߺ� �����ϰ� ��ȸ
SELECT DISTINCT REGION_ID
FROM COUNTRIES;

--JOBS ���̺��� JOB_TITLE, MIN_SALARY, MAX_SALARY �÷���
--�ּҿ����� �ִ뿬������ ���� 10% �λ�� ���·� ��ȸ
SELECT JOB_TITLE, MIN_SALARY * 1.1 AS �ּҿ���, MAX_SALARY * 1.1 AS �ִ뿬��
FROM JOBS;

/*
    <������>
    ��� ������ ( + - * / )
    �� ������ ( = <> != > >= < <= )
    �� ������ ( AND, OR, NOT )
    ���� ������ ( UNION, UNION ALL, MINUS, INTERSECT )
    SQL ������ ( BETWEEN, IN, LIKE, IS NULL )
    
    ���� �Ӹ� �ƴ϶� ���ڳ� ��¥ ���� ���ϴ� �͵� ����
    ex) 'A' < 'C'
        '2020-10-10' < '2022-05-17'
*/

SELECT *
FROM EMPLOYEES
WHERE EMPLOYEE_ID = 110;

--EMPLOYEE_ID�� 110���� �͸� �����ϰ� �������� �� �����޶�� ��
SELECT *
FROM EMPLOYEES
WHERE EMPLOYEE_ID <> 110;

SELECT *
FROM EMPLOYEES
WHERE EMPLOYEE_ID < 110;

SELECT *
FROM EMPLOYEES
WHERE EMPLOYEE_ID >= 120 AND EMPLOYEE_ID <= 130;

SELECT *
FROM EMPLOYEES
WHERE MANAGER_ID = 100 OR MANAGER_ID = 120;

SELECT *
FROM EMPLOYEES
WHERE LAST_NAME = 'Weiss' OR LAST_NAME = 'Russell';

SELECT COUNT(*)
FROM EMPLOYEES;

SELECT COUNT(*)
FROM EMPLOYEES
WHERE NOT DEPARTMENT_ID = 50;

SELECT *
FROM EMPLOYEES
WHERE NOT EMPLOYEE_ID = 100 AND NOT EMPLOYEE_ID = 130;

--employees ���̺��� FIRST_NAME�� 'David'�� ���� ��ȸ
SELECT *
FROM EMPLOYEES
WHERE FIRST_NAME = 'David';

--JOBS ���̺��� �ּ� ������ 8000 �ʰ��� ���� ��ȸ
SELECT *
FROM JOBS
WHERE MIN_SALARY > 8000;

--JOBS ���̺��� �ּ� ������ 4000 �̻��̰� �ִ� ������ 10000 ������ ���� ��ȸ
SELECT *
FROM JOBS
WHERE MIN_SALARY >= 4000 AND MAX_SALARY <= 10000;

--EMPLOYEES ���̺��� JOB_ID�� 'IT_PROG'�̸鼭 SALARY�� 5000 �ʰ��� ���� ��ȸ
SELECT *
FROM EMPLOYEES
WHERE JOB_ID = 'IT_PROG' AND SALARY > 5000;

--BETWEEN : �� ���� ������ �ش��ϴ� �����͸� ����� �� ����ϴ� Ȯ�� ������
SELECT *
FROM EMPLOYEES
WHERE EMPLOYEE_ID BETWEEN 120 AND 130;
    --���� ���� ������ ����
    SELECT *
    FROM EMPLOYEES
    WHERE EMPLOYEE_ID >= 120 AND EMPLOYEE_ID <= 130;

--IN ������
SELECT *
FROM EMPLOYEES
WHERE FIRST_NAME IN('Steven', 'John', 'Peter');
    --���� ���� ������ ����
    SELECT *
    FROM EMPLOYEES
    WHERE FIRST_NAME = 'Steven' OR FIRST_NAME = 'John' OR FIRST_NAME = 'Peter';

SELECT *
FROM COUNTRIES
WHERE COUNTRY_ID IN ('US', 'IL', 'SG');

SELECT *
FROM COUNTRIES
WHERE COUNTRY_ID NOT IN ('US', 'IL', 'SG');

--IS NULL : �ش� ���� NULL
SELECT *
FROM EMPLOYEES
WHERE COMMISSION_PCT IS NULL;

SELECT *
FROM EMPLOYEES
WHERE COMMISSION_PCT IS NOT NULL;

/*
    LIKE ������ : ���ڿ� �Ӽ����� �κ������� ��ġ�ϴ� �����͸� ����� �� ���
        % : 0�� �̻��� ����
        _ : 1���� ����
        
    <Example>
    LIKE 'DATA%' : DATA�� �����ϴ� ���ڿ�
    LIKE '%DATA' : DATA�� ������ ���ڿ�
    LIKE '%DATA%' : DATA�� ���Ե� ���ڿ�
    LIKE 'DATA____' : DATA�� �����ϴ� 8��(DATA�� ���ڼ� 4�� + '_' ���� 4��)�� ���ڿ�
    LIKE '____DATA' : DATA�� ������ 8��('_' ���� 4�� + DATA�� ���ڼ� 4��)�� ���ڿ�
 */
 
SELECT *
FROM LOCATIONS
WHERE CITY LIKE 'South%';

SELECT *
FROM LOCATIONS
WHERE STREET_ADDRESS LIKE '%St';

SELECT *
FROM LOCATIONS
WHERE CITY LIKE 'South____';
