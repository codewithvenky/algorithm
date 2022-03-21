
User (id,username,Dob,divisionid)
Divison (id,name)

select d.name,count(u.*) from  Divison d  Left Join User u On d.id=u.divisionid group by  d.name;
select d.name,count(u.*) from  Divison d  INNER Join User u On d.id=u.divisionid group by  d.name having count(u.*) >2;


