DROP SCHEMA IF EXISTS jeff cascade;
CREATE SCHEMA jeff;

CREATE TABLE jeff.todolist (
                                todo_id uuid,
                                todo varchar(300),
                                created_date TIMESTAMP WITH TIME ZONE,
                                modified_date TIMESTAMP WITH TIME ZONE,
                                PRIMARY KEY (todo_id)
);
