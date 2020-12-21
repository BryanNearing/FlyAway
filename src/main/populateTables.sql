create table Places(
	name varchar(255)
);
create table Airlines(
	name varchar(255)
);
create table Flights(
	id int auto_increment primary key,
	source varchar(255), 
	destination varchar(255), 
	airline varchar(255),
	ticketPrice float,
	numSeatsLeft int,
	flightTime date
);
create table AdminInfo(
	username varchar(255),
	password varchar(255)
);

insert into AdminInfo(username, password) values('admin', 'password');

insert into Places(name) values('San Antonio');
insert into Places(name) values('Ann Arbor');
insert into Places(name) values('Washington DC');
insert into Places(name) values('Los Angeles');
insert into Places(name) values('New York');
insert into Places(name) values('Chicago');
insert into Places(name) values('Memphis');
insert into Places(name) values('Detroit');
insert into Places(name) values('Orlando');
insert into Places(name) values('Cancun');
insert into Places(name) values('Rome');

insert into Airlines(name) values('Delta');
insert into Airlines(name) values('American Airlines');
insert into Airlines(name) values('Jet Blue');
insert into Airlines(name) values('Lufthansa');
insert into Airlines(name) values('Spirit');
insert into Airlines(name) values('Southwest');
insert into Airlines(name) values('Frontier');

insert into Flights(source, destination, airline, ticketPrice, numSeatsLeft, flightTime) values ('Detroit', 'San Antonio', 'Delta', 400, 50, '2020-12-20');
insert into Flights(source, destination, airline, ticketPrice, numSeatsLeft, flightTime) values ('San Antonio', 'Ann Arbor', 'Spirit', 5500, 50, '2020-12-22');
insert into Flights(source, destination, airline, ticketPrice, numSeatsLeft, flightTime) values ('Chicago', 'San Antonio', 'AmericanAirlines', 5000, 50, '2021-01-20');
insert into Flights(source, destination, airline, ticketPrice, numSeatsLeft, flightTime) values ('Memphis', 'Detroit', 'Delta', 450, 50, '2020-12-29');
insert into Flights(source, destination, airline, ticketPrice, numSeatsLeft, flightTime) values ('Washington Dc', 'San Antonio', 'American Airlines', 800, 50, '2021-01-02');
insert into Flights(source, destination, airline, ticketPrice, numSeatsLeft, flightTime) values ('Detroit', 'Cancun', 'Frontier', 1200, 50, '2020-12-26');
insert into Flights(source, destination, airline, ticketPrice, numSeatsLeft, flightTime) values ('Cancun', 'Orlando', 'Delta', 400, 50, '2020-12-25');
insert into Flights(source, destination, airline, ticketPrice, numSeatsLeft, flightTime) values ('Chicago', 'Cancun', 'Frontier', 600, 8, '2020-12-25');
insert into Flights(source, destination, airline, ticketPrice, numSeatsLeft, flightTime) values ('Memphis', 'Washington DC', 'Spirit', 400, 50, '2020-12-23');
insert into Flights(source, destination, airline, ticketPrice, numSeatsLeft, flightTime) values ('Los Angeles', 'San Antonio', 'Frontier', 400, 50, '2020-12-22');
insert into Flights(source, destination, airline, ticketPrice, numSeatsLeft, flightTime) values ('Detroit', 'Los Angeles', 'Delta', 900, 50, '2020-12-21');
insert into Flights(source, destination, airline, ticketPrice, numSeatsLeft, flightTime) values ('New York', 'Los Angeles', 'Jet Blue', 400, 50, '2020-12-27');
insert into Flights(source, destination, airline, ticketPrice, numSeatsLeft, flightTime) values ('Detroit', 'Orlando', 'Delta', 400, 50, '2020-12-30');
insert into Flights(source, destination, airline, ticketPrice, numSeatsLeft, flightTime) values ('Detroit', 'Rome', 'Lufthansa', 1000, 50, '2020-12-29');
insert into Flights(source, destination, airline, ticketPrice, numSeatsLeft, flightTime) values ('Rome', 'Detroit', 'Lufthansa', 700, 50, '2020-01-03');








