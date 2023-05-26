-- 코드를 입력하세요
SELECT
    i.ingredient_type, 
    sum(f.total_order)
    from icecream_info i
    join first_half f on i.flavor=f.flavor
    group by ingredient_type;
