CREATE TABLE IF NOT EXISTS Person (
  PersonId  INT,
  FirstName VARCHAR(255),
  LastName  VARCHAR(255)
);
CREATE TABLE IF NOT EXISTS Address (
  AddressId INT,
  PersonId  INT,
  City      VARCHAR(255),
  State     VARCHAR(255)
);

SELECT
  p.FirstName,
  p.LastName,
  a.City,
  a.State
FROM Person AS p LEFT JOIN Address AS a ON p.PersonId = a.PersonId;