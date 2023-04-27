-- 코드를 입력하세요
SELECT
MCDP_CD as 진료과코드,
count(apnt_ymd) as 5월예약건수
from appointment
where apnt_ymd like "%2022-05-%"
group by mcdp_cd
order by count(apnt_ymd), pt_no asc;