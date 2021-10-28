use carssalesdata;
select City from customer;
select City from customer where City='London';
----- alter table customer add city constraint cus default 'London';

select FirstName from salesperson where FirstName regexp '^[P{4}I]';

select * from customer where City = 'San Jose' or  City ='Brazil' or City = 'London';

select Name from customer where Name like 'A%' or Name like 'G%'; 

select City, max(Rating) from customer group by City;

select * from salesperson where City = 'Barcelona' or City='London';

select * from orders where orderDate between '2020-10-03' and '2020-12-04';

select sum(amount) from orders;

select count(Rating) from customer;

select CONCAT(Name, ' ', LastName) as 'Full Name' from customer;

select * from customer where Rating between '200' and '300';

select * from customer order by Name asc;

select * from orders order by Amount desc;

select avg(Amount) from orders;

SELECT * FROM carssalesdata.customer;
SELECT * FROM carssalesdata.salesperson;
SELECT * FROM carssalesdata.orders;