CREATE DATABASE user_management;
USE user_management;

CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    password VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL
);
INSERT INTO users (username, password, email) 
VALUES 
('rahul_verma', 'password423', 'rahul.verma@example.com'),
('priya_sharma', 'password456', 'priya.sharma@example.com'),
('ajay_kumar', 'password789', 'ajay.kumar@example.com'),
('neha_singh', 'password101', 'neha.singh@example.com'),
('rohit_patel', 'password202', 'rohit.patel@example.com'),
('anita_rai', 'password303', 'anita.rai@example.com'),
('suresh_yadav', 'password404', 'suresh.yadav@example.com'),
('deepa_mishra', 'password505', 'deepa.mishra@example.com'),
('vikas_jha', 'password606', 'vikas.jha@example.com'),
('sonia_gupta', 'password707', 'sonia.gupta@example.com');

select * from users;
set Sql_safe_updates=0;
delete from users where username='Shaliniv';
truncate users;