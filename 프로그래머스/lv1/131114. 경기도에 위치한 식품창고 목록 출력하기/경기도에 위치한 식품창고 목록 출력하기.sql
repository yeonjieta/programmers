-- 코드를 입력하세요
SELECT
    warehouse_id,
    warehouse_name,
    address,
    nvl(freezer_yn, 'N') as freezer_yn
    -- nvl 함수를 써 freezer_yn이 null 일 경우 N을 출력하도록한다
    from food_warehouse
    where address like '%경기도%'
    -- 경기도에 위치한 창고 기준이니 주소에 경기도가 포함돼있어야함
    order by warehouse_id ;