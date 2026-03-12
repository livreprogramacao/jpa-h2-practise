-- Create the tables
CREATE TABLE app_sometable
(
   some_varchar varchar(100), 
   some_numeric numeric, 
   some_timestamp timestamp, 
   some_blob blob  
);
-- Insert the data
insert into app_sometable (some_varchar, some_numeric, some_timestamp, some_blob)
values ('unit_test_varchar',123,'1977-01-30-10.11.30.766',null);

