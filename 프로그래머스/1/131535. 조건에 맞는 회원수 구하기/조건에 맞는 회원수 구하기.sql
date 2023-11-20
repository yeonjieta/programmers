-- 코드를 입력하세요
SELECT
    count(user_id) as users
    from user_info
    -- 2021이 포함된 조건을 건다.
    where joined like '%2021%' and age between 20 and 29;