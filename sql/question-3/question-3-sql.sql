-- https://data36.com/sql-interview-questions-tech-screening-data-analysts/
-- Question 3

create table employees
(
    department_name varchar,
    employee_id varchar,
    employee_name varchar
);

create table salaries
(
    salary INT ,
    employee_id varchar,
    employee_name varchar
);


INSERT INTO employees (department_name, employee_id, employee_name) VALUES ('Sales', '123', 'John Doe');
INSERT INTO employees (department_name, employee_id, employee_name) VALUES ('Sales', '211', 'Jane Smith');
INSERT INTO employees (department_name, employee_id, employee_name) VALUES ('HR', '556', 'Billy Bob');
INSERT INTO employees (department_name, employee_id, employee_name) VALUES ('Sales', '711', 'Robert Hayek');
INSERT INTO employees (department_name, employee_id, employee_name) VALUES ('Marketing', '235', 'Edward Jorgson');
INSERT INTO employees (department_name, employee_id, employee_name) VALUES ('Marketing', '236', 'Christine Packard');


INSERT INTO salaries (salary, employee_id, employee_name) VALUES ('500', '123', 'John Doe');
INSERT INTO salaries (salary, employee_id, employee_name) VALUES ('600', '211', 'Jane Smith');
INSERT INTO salaries (salary, employee_id, employee_name) VALUES ('1000', '556', 'Billy Bob');
INSERT INTO salaries (salary, employee_id, employee_name) VALUES ('400', '711', 'Robert Hayek');
INSERT INTO salaries (salary, employee_id, employee_name) VALUES ('1200', '235', 'Edward Jorgson');
INSERT INTO salaries (salary, employee_id, employee_name) VALUES ('200', '236', 'Christine Packard');


SELECT department_name, avg(salary) as average
FROM employees
    JOIN salaries s on employees.employee_id = s.employee_id
GROUP BY department_name
having average > 600;


SELECT AVG(salary)
FROM salaries
