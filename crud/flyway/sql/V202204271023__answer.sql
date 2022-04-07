create table question_answer (
answer_id int primary key,
question_id int not null,
description varchar(500) not null,
valid int,
FOREIGN KEY (question_id) REFERENCES question(question_id)
);