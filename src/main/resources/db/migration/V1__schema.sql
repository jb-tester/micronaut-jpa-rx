DROP TABLE IF EXISTS tab3;

CREATE TABLE tab3 (
                      id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
                      first VARCHAR(15),
                      second VARCHAR(255),
                      third INT,
                      forth BOOLEAN
);

INSERT INTO tab3(first, second, third, forth) VALUES ( 'foo31','bar31', 31, true );
INSERT INTO tab3(first, second, third, forth) VALUES ( 'foo32','bar32', 32, false );
INSERT INTO tab3(first, second, third, forth) VALUES ( 'foo33','bar33', 33, true );
INSERT INTO tab3(first, second, third, forth) VALUES ( 'foo34','bar34', 34, false );

