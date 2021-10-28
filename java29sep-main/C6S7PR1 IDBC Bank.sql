create database idbcbank;

create table customerTable(
CustomerId int auto_increment primary key not null, 
Name char(25) not null, 
Address varchar(255) not null, 
MobileNumber bigint not null, 
EmailId varchar(255) not null
) auto_increment 1;

create table accountTable(
AccountNumber bigint auto_increment primary key not null, 
Amount int4 not null, 
AccountType char(30) not null, 
CustomerId int not null,
foreign key (CustomerId) references customer(CustomerId)
) auto_increment 123000000000;

create table transactionLog(
TransactionId int not null primary key auto_increment,
TransactionType char (30) not null,
AccountType char(30) not null, 
UpdateAmount int4 not null,
TransactionDate datetime not null,
Amount int4 not null,
foreign key (AccountType, Amount) references accountTable(AccountType, Amount)
);