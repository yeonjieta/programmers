-- 코드를 입력하세요
SELECT
    O.ANIMAL_ID,
    O.ANIMAL_TYPE,
    O.NAME -- 요구대로 정렬 후 
    FROM ANIMAL_INS I 
    JOIN ANIMAL_OUTS O 
    ON I.ANIMAL_ID = O.ANIMAL_ID -- 같은 id를 기준으로 join을 한다. 
    WHERE I.SEX_UPON_INTAKE LIKE '%Intact%' AND (O.SEX_UPON_OUTCOME LIKE  '%Spayed%' OR O.SEX_UPON_OUTCOME LIKE  '%Neutered%')   -- 중성화를 하지않고 들어오면 intact~ 이니 포함시키는 문구를 , 중성화를 한 후는 Spayed, Neutered 를 포함하니 where 절로 조건을 걸어준다.
    ORDER BY O.ANIMAL_ID;
    
