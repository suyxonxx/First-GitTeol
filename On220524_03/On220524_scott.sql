--SOME, ANY : 조건을 하나라도 만족하면 출력해줌.
SELECT *
FROM EMP
WHERE SAL = ANY(
    SELECT MAX(SAL)
    FROM EMP
    GROUP BY DEPTNO
);

SELECT *
FROM EMP
WHERE SAL = SOME(
    SELECT MAX(SAL)
    FROM EMP
    GROUP BY DEPTNO
);

SELECT SAL
FROM EMP
WHERE SAL < ANY (
    SELECT SAL
    FROM EMP
    WHERE DEPTNO = 30
);

--아래 두 예시들은, 같은 결과를 출력함.
SELECT SAL
FROM EMP
WHERE SAL > ANY (
    SELECT SAL
    FROM EMP
    WHERE DEPTNO = 30
);
    
SELECT SAL
FROM EMP
WHERE SAL > (
    SELECT MIN(SAL)
    FROM EMP
    WHERE DEPTNO = 30
);

--ALL : 조건을 전부 만족시켜야 출력해줌.
SELECT SAL
FROM EMP
WHERE SAL > ALL(
    SELECT SAL
    FROM EMP
    WHERE DEPTNO = 30
);

SELECT *
FROM EMP
WHERE(DEPTNO, SAL) IN (
    SELECT DEPTNO, MAX(SAL)
    FROM EMP
    GROUP BY DEPTNO
);

