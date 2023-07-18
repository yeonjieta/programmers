-- 코드를 입력하세요
SELECT
    CASE
        WHEN PRICE < 10000 THEN '0' -- 10000원보다 작은건 0으로 하고
        ELSE SUBSTR(PRICE, 1, 1) || '0000' -- 그 외의 것은 젤 첫자리만 뽑아서 0 4개를 붙여준다.
    END AS PRICE_GROUP,
    COUNT(*) AS PRODUCTS
    FROM PRODUCT
    GROUP BY
    CASE
        WHEN PRICE < 10000 THEN '0'
        ELSE SUBSTR(PRICE, 1, 1) || '0000'
    END
    ORDER BY PRICE_GROUP;