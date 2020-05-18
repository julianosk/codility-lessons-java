-- https://data36.com/sql-interview-questions-tech-screening-data-analysts/
-- Question 2

create table event_log
(
    user_id varchar,
    event_date_time varchar
);

INSERT INTO event_log (user_id, event_date_time) VALUES ('7494212','1535308431');
INSERT INTO event_log (user_id, event_date_time) VALUES ('7494212','1535308432');
INSERT INTO event_log (user_id, event_date_time) VALUES ('7494212','1535308433');
INSERT INTO event_log (user_id, event_date_time) VALUES ('7494212','1535308434');
INSERT INTO event_log (user_id, event_date_time) VALUES ('1475185','1535308445');
INSERT INTO event_log (user_id, event_date_time) VALUES ('1475185','1535308446');
INSERT INTO event_log (user_id, event_date_time) VALUES ('6946725','1535308477');
INSERT INTO event_log (user_id, event_date_time) VALUES ('6946725','1535308478');
INSERT INTO event_log (user_id, event_date_time) VALUES ('6946725','1535308479');
INSERT INTO event_log (user_id, event_date_time) VALUES ('6946725','1535308470');
INSERT INTO event_log (user_id, event_date_time) VALUES ('6946725','15353084711');
INSERT INTO event_log (user_id, event_date_time) VALUES ('6946725','15353084712');
INSERT INTO event_log (user_id, event_date_time) VALUES ('7494213','1535308431');
INSERT INTO event_log (user_id, event_date_time) VALUES ('7494213','1535308432');
INSERT INTO event_log (user_id, event_date_time) VALUES ('7494213','1535308433');
INSERT INTO event_log (user_id, event_date_time) VALUES ('7494213','1535308434');


SELECT * FROM
    (SELECT user_id, COUNT(event_date_time) AS image_per_user
     FROM event_log
     GROUP BY user_id) AS image_per_user
WHERE image_per_user < 5 AND image_per_user > 3;
-- 7494212	4
-- 7494213	4

SELECT COUNT(*) FROM
    (SELECT user_id, COUNT(event_date_time) AS image_per_user
     FROM event_log
     GROUP BY user_id) AS image_per_user
WHERE image_per_user < 5 AND image_per_user > 3;
-- 2