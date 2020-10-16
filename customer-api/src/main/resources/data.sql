insert into CUSTOMERS (CUSTOMER_NAME, PASSWORD, EMAIL) VALUES ('Bruce', 'pass', 'bruce@a.com');
insert into CUSTOMERS (CUSTOMER_NAME, PASSWORD, EMAIL) VALUES ('Paul', 'pass', 'paul@b.com');
insert into CUSTOMERS (CUSTOMER_NAME, PASSWORD, EMAIL) VALUES ('Rick', 'pass', 'rick@c.com');
insert into CUSTOMERS (CUSTOMER_NAME, PASSWORD, EMAIL) VALUES ('Mick', 'pass', 'Mick@gmail.com');
insert into CUSTOMERS (CUSTOMER_NAME, PASSWORD, EMAIL) VALUES ('Mike', 'pass', 'Mike@gmail.com');
insert into CUSTOMERS (CUSTOMER_NAME, PASSWORD, EMAIL) VALUES ('Zach', 'pass', 'Zach@gmail.com');
insert into CUSTOMERS (CUSTOMER_NAME, PASSWORD, EMAIL) VALUES ('Adunakhor', 'morgoth', 'Adun@numenor.com');
insert into CUSTOMERS (CUSTOMER_NAME, PASSWORD, EMAIL) VALUES ('Zimrathon', 'morgoth', 'Zimr@numenor.com');
insert into CUSTOMERS (CUSTOMER_NAME, PASSWORD, EMAIL) VALUES ('Sakalthor', 'morgoth', 'Saka@numenor.com');
insert into CUSTOMERS (CUSTOMER_NAME, PASSWORD, EMAIL) VALUES ('Gimilzor', 'morgoth', 'Gimi@numenor.com');
insert into CUSTOMERS (CUSTOMER_NAME, PASSWORD, EMAIL) VALUES ('Pharazon', 'morgoth', 'Phar@numenor.com');

insert into EVENTS (EVENT_CODE, TITLE, DESCRIPTION ) VALUES ('CNF001', 'All-Java Conference', 'Lectures and exhibits covering all Java topics' );
insert into EVENTS (EVENT_CODE, TITLE, DESCRIPTION ) VALUES ('WKS002', 'Spring Boot Workshop', 'Hands-on Spring Boot Workshop' );
insert into EVENTS (EVENT_CODE, TITLE, DESCRIPTION ) VALUES ('TRN003', 'Angular Training Course', 'Five day introductory training in Angular' );
insert into EVENTS (EVENT_CODE, TITLE, DESCRIPTION ) VALUES ('2A0032', 'Founding of Numenor', 'Edain reach Numenor');
insert into EVENTS (EVENT_CODE, TITLE, DESCRIPTION ) VALUES ('2A1000', 'Barad-dur Construction', 'Sauron beings building Barad-dur');
insert into EVENTS (EVENT_CODE, TITLE, DESCRIPTION ) VALUES ('2A1500', 'Ring Forging', 'Elves forge Rings of Power');
insert into EVENTS (EVENT_CODE, TITLE, DESCRIPTION ) VALUES ('2A1700', 'Eregion War', 'Numenor saves Noldor');
insert into EVENTS (EVENT_CODE, TITLE, DESCRIPTION ) VALUES ('2A3261', 'Sauron submits', 'Sauron taken prisonor');
insert into EVENTS (EVENT_CODE, TITLE, DESCRIPTION ) VALUES ('2A3319', 'Akalabeth', 'Downfall of Numenor');
insert into EVENTS (EVENT_CODE, TITLE, DESCRIPTION ) VALUES ('2A3430', 'Last Alliance', 'Siege of Mordor');


insert into REGISTRATIONS (EVENT_ID, CUSTOMER_ID, REGISTRATION_DATE, NOTES ) 
VALUES ( 1, 1, '2019-01-15 00:00:00.0', 'please email me the event details' );

insert into REGISTRATIONS (EVENT_ID, CUSTOMER_ID, REGISTRATION_DATE, NOTES ) 
VALUES ( 1, 2, '2019-01-17 00:00:00.0', 'looking for info on local hotels' );

insert into REGISTRATIONS (EVENT_ID, CUSTOMER_ID, REGISTRATION_DATE, NOTES ) 
VALUES ( 1, 3, '2019-01-13 00:00:00.0', 'na' );

insert into REGISTRATIONS (EVENT_ID, CUSTOMER_ID, REGISTRATION_DATE, NOTES )
VALUES (7,5,'2020-07-05 00:00:00.0', 'Maecenas bibendum lorem et diam tempus sodales.');

insert into REGISTRATIONS (EVENT_ID, CUSTOMER_ID, REGISTRATION_DATE, NOTES )
VALUES (2,3,'2020-02-03 00:00:00.0', 'Quisque et quam consequat, convallis lectus id, fermentum tellus.');

insert into REGISTRATIONS (EVENT_ID, CUSTOMER_ID, REGISTRATION_DATE, NOTES )
VALUES (7,6,'2020-07-06 00:00:00.0', 'Mauris a elit ac elit pulvinar interdum vitae a libero.');

insert into REGISTRATIONS (EVENT_ID, CUSTOMER_ID, REGISTRATION_DATE, NOTES )
VALUES (5,5,'2020-05-05 00:00:00.0', 'Mauris ac lorem a augue congue aliquet pulvinar vel sapien');

insert into REGISTRATIONS (EVENT_ID, CUSTOMER_ID, REGISTRATION_DATE, NOTES )
VALUES (7,7,'2020-07-07 00:00:00.0', 'Quisque porttitor diam eget maximus placerat.');

insert into REGISTRATIONS (EVENT_ID, CUSTOMER_ID, REGISTRATION_DATE, NOTES )
VALUES (2,9,'2020-02-09 00:00:00.0', 'Duis maximus felis et leo gravida rutrum.');

insert into REGISTRATIONS (EVENT_ID, CUSTOMER_ID, REGISTRATION_DATE, NOTES )
VALUES (6,2,'2020-06-02 00:00:00.0', 'Morbi vulputate tellus vitae ipsum tempor accumsan.');
