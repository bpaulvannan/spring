create table question (
question_id int primary key,
description varchar(500) not null,
category_id int,
FOREIGN KEY (category_id) REFERENCES category(category_id)
);