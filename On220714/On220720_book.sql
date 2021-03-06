SELECT COUNT(*) FROM TBL_BOARD;
SELECT COUNT(*) FROM TBL_BOARD WHERE BNO>0;

SELECT * FROM TBL_BOARD;
SELECT * FROM TBL_BOARD WHERE BNO > 0;

SELECT * FROM TBL_BOARD WHERE TITLE LIKE '%오이%';
SELECT * FROM TBL_BOARD WHERE WRITER LIKE '%토마토%';

SELECT * FROM (
    SELECT ROWNUM RN, TITLE, CONTENT, WRITER, REGDATE, UPDATEDATE
    FROM TBL_BOARD
    WHERE TITLE LIKE '%오이%' AND ROWNUM <= 20
    )
WHERE RN > 10;

SELECT * FROM TBL_BOARD
WHERE TITLE LIKE '%오이오이%' AND CONTENT LIKE '%파프리카%';

SELECT * FROM (
    SELECT ROWNUM RN, TITLE, CONTENT, WRITER, REGDATE, UPDATEDATE
    FROM TBL_BOARD
    WHERE TITLE LIKE '%오이%' AND CONTENT LIKE '%파프리카%' AND WRITER LIKE '%토마토%' AND ROWNUM <= 20
    )
WHERE RN > 10;

SELECT *
FROM (
    SELECT /*+INDEX_DESC(TBL_BOARD PK_BOARD)*/ ROWNUM RN, BNO, TITLE, CONTENT, WRITER, REGDATE, UPDATEDATE
    FROM TBL_BOARD
    WHERE TITLE LIKE '%오이오이%' AND ROWNUM <= 20
)
WHERE RN > 10;

SELECT BNO, TITLE, CONTENT, WRITER, REGDATE, UPDATEDATE
FROM (
    SELECT /*+ INDEX_DESC(TBL_BOARD PK_BOARD) */
    ROWNUM RN, BNO, TITLE,CONTENT, WRITER,REGDATE, UPDATEDATE
    FROM TBL_BOARD ROWNUM <= #{pageNum} * #{amount}
)
WHERE RN > (#{pageNum} - 1) * #{amount};