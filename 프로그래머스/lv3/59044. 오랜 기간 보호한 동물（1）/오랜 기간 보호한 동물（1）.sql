-- 코드를 입력하세요
-- LEFTJOIN을 사용한 이유
-- ANIMAL_ID가 동일한 레코드만을 반환하게 되므로 입양을 가지 못한 동물의 경우 ANIMAL_OUTS 테이블에 해당하는 레코드가 없으므로 결과에서 제외된다. 
SELECT
    I.NAME,
    I.DATETIME
    FROM ANIMAL_INS I 
    LEFT JOIN ANIMAL_OUTS O ON I.ANIMAL_ID = O.ANIMAL_ID
    WHERE O.DATETIME IS NULL
    ORDER BY I.DATETIME 
    LIMIT 3;