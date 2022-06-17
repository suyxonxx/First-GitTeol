CREATE TABLE WORKER ( /*관리자*/
    ID VARCHAR2(20) NOT NULL PRIMARY KEY, /*아이디*/
    PWD VARCHAR2(20), /*암호*/
    NAME VARCHAR2(40), /*이름*/
    PHONE VARCHAR2(20) /*전화번호*/
);

DESC WORKER;

CREATE TABLE ADDRESS ( /*주소*/
    ZIP_NUM VARCHAR2(7), /*우편번호*/
    SIDO VARCHAR2(30), /*시도*/
    GUGUN VARCHAR2(30), /*구군*/
    DONG VARCHAR2(100), /*동*/
    ZIP_CODE VARCHAR2(30), /*우편코드*/
    BUNJI VARCHAR2(30) /*번지*/
);

DESC ADDRESS;

CREATE TABLE MEMBER ( /*회원*/
    ID VARCHAR2(20) NOT NULL PRIMARY KEY, /*회원아이디*/
    PWD VARCHAR2(20), /*회원암호*/
    NAME VARCHAR2(40), /*회원이름*/
    EMAIL VARCHAR2(40), /*회원이메일*/
    ZIP_NUM VARCHAR2(7), /*우편번호*/
    ADDRESS VARCHAR2(100), /*주소*/
    PHONE VARCHAR2(20), /*전화번호*/
    USEYN CHAR(1) DEFAULT 'Y', /*탈퇴여부 (Y :사용가능, N :탈퇴)*/
    INDATE DATE DEFAULT SYSDATE /*가입일*/
);

DESC MEMBER;

CREATE TABLE PRODUCT ( /*상품*/
    PSEQ NUMBER(5) NOT NULL PRIMARY KEY, /*상품번호 (PRODUCT_SEQ 시퀀스 객체로 자동 일련 번호 부여)*/
    NAME VARCHAR2(100) DEFAULT '0', /*상품명*/
    KIND CHAR(1), /*상품종류 (1 : 힐, 2 : 부츠, 3 : 샌달, 4 : 슬리퍼, 5 : 스니커즈)*/
    PRICE1 NUMBER(7) DEFAULT 0, /*원가*/
    PRICE2 NUMBER(7) DEFAULT 0, /*판매가*/
    PRICE3 NUMBER(7) DEFAULT 0, /*판매가-원가*/
    CONTENT VARCHAR2(1000) DEFAULT NULL, /*상품내용*/
    IMAGE VARCHAR2(50) DEFAULT 'default.jpg', /*상품이미지*/
    USEYN CHAR(1) DEFAULT 'Y', /*상품삭제여부 (Y : 사용가능, N : 사용불가능)*/
    BESTYN CHAR(1) DEFAULT 'N', /*베스트상품여부 (Y : 베스트 상품, N : 베스트 상품 아님)*/
    INDATE DATE DEFAULT SYSDATE /*등록일*/
);

DESC PRODUCT;

CREATE TABLE CART ( /*장바구니*/
    CSEQ NUMBER(10) NOT NULL PRIMARY KEY, /*장바구니번호 (CART_SEQ 시퀀스 객체로 자동 일련 번호 부여)*/
    ID VARCHAR2(20), /*회원아이디 (MEMBER 테이블의 기본키인 ID 컬럼)*/
    PSEQ NUMBER(5), /*상품번호 (PRODUCT테이블의 기본키인 PSEQ 컬럼)*/
    QUANTITY NUMBER(5) DEFAULT 1, /*수량*/
    RESULT CHAR(1) DEFAULT '1', /*처리완료여부 (1 : 미처리 2 : 처리)*/
    INDATE DATE DEFAULT SYSDATE /*등록일*/
);

DESC CART;

CREATE TABLE ORDERS ( /*주문*/
    OSEQ NUMBER(10) NOT NULL PRIMARY KEY, /*주문번호 (ORDERS_SEQ 시퀀스 객체로 자동 일련 번호 부여)*/
    ID VARCHAR2(20) , /*주문자 아이디 (MEMBER 테이블의 기본키인 ID 컬럼)*/
    INDATE DATE DEFAULT SYSDATE /*주문일*/
);

DESC ORDERS;

CREATE TABLE ORDER_DETAIL ( /*주문 상세*/
    ODSEQ NUMBER(10) NOT NULL PRIMARY KEY, /*주문상세번호 (ORDER_DETAIL_SEQ 시퀀스 객 체로 자동 일련 번호 부여)*/
    OSEQ NUMBER(10), /*주문번호 (ORDERS 테이블의 기본 키인 OSEQ 컬럼)*/
    PSEQ NUMBER(5), /*상품번호 (PRODUCT 테이블의 기본 키인 PSEQ 컬럼)*/
    QUANTITY NUMBER(5), /*주문수량*/
    RESULT CHAR(1) /*처리여부 (1 :미처리 2 : 처리)*/
);

DESC ORDER_DETAIL;

CREATE TABLE QNA ( /*QNA 게시판*/
    QSEQ NUMBER(5) NOT NULL PRIMARY KEY, /*글번호 (QNA_SEQ 시퀀스 객체로 자동 일련 번호 부여)*/
    SUBJECT VARCHAR2(30), /*제목*/
    CONTENT VARCHAR2(1000), /*문의내용*/
    REPLY VARCHAR2(1000), /*답변내용*/
    ID VARCHAR2(20), /*작성자아이디 (MEMBER 테이블의 기본키)*/
    REP CHAR(1), /*답변유무 (1 : 답변 무, 2 : 답변 유)*/
    INDATE DATE DEFAULT SYSDATE /*작성일*/
);

DESC QNA;
