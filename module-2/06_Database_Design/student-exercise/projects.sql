
BEGIN TRANSACTION;

CREATE TABLE departments (
    id serial,
    name varchar(360) NOT NULL,
    CONSTRAINT pk_departments_id PRIMARY KEY (id)
);



CREATE TABLE job_titles (
    id serial,
    title varchar(360) NOT NULL,
    CONSTRAINT pk_job_titles_id PRIMARY KEY (id)
);

CREATE TABLE employees (
    id serial,
    first_name varchar(360) NOT NULL,
    last_name varchar(360) NOT NULL,
    gender char(1),
    date_of_birth DATE,
    hire_date DATE NOT NULL,
    departments_id INTEGER NOT NULL,
    job_titles_id INTEGER NOT NULL,
    CONSTRAINT pk_employees PRIMARY KEY (id),
    CONSTRAINT fk_job_titles_id FOREIGN KEY (job_titles_id) REFERENCES job_titles(id),
    CONSTRAINT fk_departments_id FOREIGN KEY (departments_id) REFERENCES departments(id)
);

CREATE TABLE projects (
    id serial,
    name varchar(360) NOT NULL,
    employees_id INTEGER NOT NULL,
    startdate DATE NOT NULL,
    CONSTRAINT pk_projects_id PRIMARY KEY (id),
    CONSTRAINT fk_employees_id FOREIGN KEY (employees_id) REFERENCES employees(id)
);

INSERT INTO job_titles (title) VALUES ('Director');
INSERT INTO job_titles (title) VALUES ('Actor');
INSERT INTO job_titles (title) VALUES ('Extra');
INSERT INTO job_titles (title) VALUES ('Composer');
INSERT INTO job_titles (title) VALUES ('Cameraman');

INSERT INTO departments (name) VALUES ('Production');
INSERT INTO departments (name) VALUES ('Cast');
INSERT INTO departments (name) VALUES ('Music Score');

INSERT INTO employees (first_name, last_name, gender, date_of_birth, hire_date, job_titles_id, departments_id) VALUES ('George', 'Lucas', 'M', '05-14-1944', '05-16-1974', 1, 1);
INSERT INTO employees (first_name, last_name, gender, date_of_birth, hire_date, job_titles_id, departments_id) VALUES ('Steven', 'Spielberg', 'M', '12-18-1946', '04-25-1978', 1, 1);
INSERT INTO employees (first_name, last_name, gender, date_of_birth, hire_date, job_titles_id, departments_id) VALUES ('Carrie', 'Fisher', 'F', '10-21-1956', '05-16-1974', 2, 2);
INSERT INTO employees (first_name, last_name, gender, date_of_birth, hire_date, job_titles_id, departments_id) VALUES ('Robin', 'Williams', 'M', '07-21-1951', '07-19-1988', 2, 2);
INSERT INTO employees (first_name, last_name, gender, date_of_birth, hire_date, job_titles_id, departments_id) VALUES ('Mel', 'Gibson', 'M', '01-03-1956', '11-06-1979', 2, 2);
INSERT INTO employees (first_name, last_name, gender, date_of_birth, hire_date, job_titles_id, departments_id) VALUES ('Joe', 'Schmoe', 'M', '03-21-1961', '07-19-1988', 3, 2);
INSERT INTO employees (first_name, last_name, gender, date_of_birth, hire_date, job_titles_id, departments_id) VALUES ('John', 'Williams', 'M', '02-08-1932', '09-29-1967', 4, 3);
INSERT INTO employees (first_name, last_name, gender, date_of_birth, hire_date, job_titles_id, departments_id) VALUES ('Jane', 'Doe', 'F', '11-14-1965', '02-01-1989', 5, 1);
INSERT INTO employees (first_name, last_name, gender, date_of_birth, hire_date, job_titles_id, departments_id) VALUES ('Hans', 'Zimmer', 'M', '09-12-1957', '03-23-1972', 4, 3);

INSERT INTO projects (name, employees_id, startdate) VALUES ('Star Wars', 1, '05-25-1977');
INSERT INTO projects (name, employees_id, startdate) VALUES ('Mad Max', 5, '12-24-1981');
INSERT INTO projects (name, employees_id, startdate) VALUES ('Hook', 4, '12-11-1991');
INSERT INTO projects (name, employees_id, startdate) VALUES ('Raiders', 2, '06-15-1981');





SELECT * FROM job_titles;
SELECT * FROM departments;
SELECT * FROM employees;
SELECT * FROM projects;

COMMIT;
