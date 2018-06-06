USE adlister_db;

ALTER TABLE ads
    add CONSTRAINT
FOREIGN KEY (userid) REFERENCES adlister_db.users(id);

INSERT INTO ads (title, userid, description) values('three ducks', '1', 'you know the deal');

SELECT * FROM users;
SELECT * FROM ads;