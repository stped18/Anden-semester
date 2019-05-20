ALTER TABLE Employee DROP CONSTRAINT FKEmployee169042;
ALTER TABLE Employee DROP CONSTRAINT FKEmployee127276;
ALTER TABLE Role_Rights DROP CONSTRAINT FKRole_Right154863;
ALTER TABLE Role_Rights DROP CONSTRAINT FKRole_Right562123;
ALTER TABLE "Case" DROP CONSTRAINT FKCase853075;
ALTER TABLE Citizen DROP CONSTRAINT FKCitizen252567;
ALTER TABLE Case_Employee DROP CONSTRAINT FKCase_Emplo114012;
ALTER TABLE Case_Employee DROP CONSTRAINT FKCase_Emplo731126;
ALTER TABLE "Case" DROP CONSTRAINT FKCase736884;
ALTER TABLE Case_RequestingCitizen DROP CONSTRAINT FKCase_Reque2853;
ALTER TABLE Case_RequestingCitizen DROP CONSTRAINT FKCase_Reque839262;
ALTER TABLE Case_Content DROP CONSTRAINT FKCase_Conte796834;

DROP TABLE IF EXISTS "Case" CASCADE;
DROP TABLE IF EXISTS Case_Content CASCADE;
DROP TABLE IF EXISTS Case_Employee CASCADE;
DROP TABLE IF EXISTS Case_RequestingCitizen CASCADE;
DROP TABLE IF EXISTS Citizen CASCADE;
DROP TABLE IF EXISTS Department CASCADE;
DROP TABLE IF EXISTS Employee CASCADE;
DROP TABLE IF EXISTS Rights CASCADE;
DROP TABLE IF EXISTS Role CASCADE;
DROP TABLE IF EXISTS Role_Rights CASCADE;
DROP TABLE IF EXISTS Zipcode CASCADE;