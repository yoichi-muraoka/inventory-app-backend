CREATE TABLE places (
  id INT PRIMARY KEY,
  name VARCHAR(20) UNIQUE
);

CREATE TABLE items (
  id INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(30) NOT NULL,
  amount INT NOT NULL,
  place_id INT NOT NULL,
  note VARCHAR(255),
  registered_at DATE NOT NULL
);