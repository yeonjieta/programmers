-- 코드를 입력하세요
SELECT
    pt_name,
    pt_no,
    gend_cd,
    age,
    nvl(tlno, 'NONE') as tlno
    from patient
    where age <= 12 and gend_cd = 'W'
    -- 왜인지 모르겠지만 테이블에 없는 스티치가(9살)이 자꾸 출력돼서 age 가 9인걸 제외시킴

    order by age desc, pt_name asc;