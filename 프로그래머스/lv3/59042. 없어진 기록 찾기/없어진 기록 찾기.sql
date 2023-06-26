-- 코드를 입력하세요
-- animal_ins i(보호소에 들어온), animal_outs o(입양보낸)  공통 animal_id

    -- 보호소에 들어온 기억이 없는 동물을 찾으려면 INS에서 날짜가 없는 동물을 찾으면 된다.
    -- 입양을 간 기록이 있는 동물을 찾기 위해 RIGHT JOIN을 해 INS에 날짜가 없는 동물을 제외하고 출력하면 된다.
SELECT
    O.ANIMAL_ID,
    O.NAME
    FROM ANIMAL_INS I
    RIGHT JOIN ANIMAL_OUTS O ON I.ANIMAL_ID = O.ANIMAL_ID  
    WHERE I.DATETIME IS NULL
    ORDER BY O.ANIMAL_ID;
    
