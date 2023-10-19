create table person
(
   id integer not null,
   name varchar(255) not null,
   location varchar(255),
   birth_date timestamp,
   primary key(id)
);

INSERT INTO PERSON 
    (ID, NAME, LOCATION, BIRTH_DATE)
VALUES(10001,'Shivam','FL','1996-09-06');
INSERT INTO PERSON 
    (ID, NAME, LOCATION, BIRTH_DATE)
VALUES(10002,'Shubham','AZ','1995-06-24');
INSERT INTO PERSON 
    (ID, NAME, LOCATION, BIRTH_DATE)
VALUES(10003,'Sakshi','MU','1993-12-22');

INSERT INTO PERSON 
    (ID, NAME, LOCATION, BIRTH_DATE)
VALUES(10004,'Shivam','MU','1996-09-06');