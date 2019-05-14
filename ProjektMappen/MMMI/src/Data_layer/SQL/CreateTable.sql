CREATE TABLE "Case" (CaseID varchar(255) NOT NULL, DepartmentDepartmentID int4 NOT NULL, EmployeeEmployeeID int4 NOT NULL, RegCitizenRegCitizenID int4 NOT NULL, PRIMARY KEY (CaseID));
CREATE TABLE Case_RequestingCitizen (CaseCaseID varchar(255) NOT NULL, ReqCitizenReqCitizenID int4 NOT NULL, PRIMARY KEY (CaseCaseID, ReqCitizenReqCitizenID));
CREATE TABLE Department (DepartmentID SERIAL NOT NULL, DepartmentName varchar(255), PRIMARY KEY (DepartmentID));
CREATE TABLE Employee (EmployeeID SERIAL NOT NULL, DepartmentDepartmentID int4 NOT NULL, RoleRoleID int4 NOT NULL, FirstName varchar(255), LastName varchar(255), Username varchar(255), Password varchar(255), PRIMARY KEY (EmployeeID));
CREATE TABLE RegardingCitizen (RegCitizenID SERIAL NOT NULL, ZipcodeZipcode int4 NOT NULL, FirstName varchar(255), LastName varchar(255), "CPR-nr" varchar(255), Streetname varchar(255), HouseNo varchar(255), Floor varchar(255), FloorDir varchar(255), PRIMARY KEY (RegCitizenID));
CREATE TABLE RequestingCitizen (ReqCitizenID SERIAL NOT NULL, ZipcodeZipcode int4 NOT NULL, FirstName varchar(255), LastName varchar(255), Streetname varchar(255), HouseNo varchar(255), Floor varchar(255), FloorDir varchar(255), PRIMARY KEY (ReqCitizenID));
CREATE TABLE Rights (RightsID SERIAL NOT NULL, RightsName varchar(225), PRIMARY KEY (RightsID));
CREATE TABLE Role (RoleID SERIAL NOT NULL, Rolename varchar(255), PRIMARY KEY (RoleID));
CREATE TABLE Role_Rights (RightsRightsID int4 NOT NULL, RoleRoleID int4 NOT NULL, PRIMARY KEY (RightsRightsID, RoleRoleID));
CREATE TABLE Zipcode (Zipcode SERIAL NOT NULL, Cityname varchar(255), PRIMARY KEY (Zipcode));
CREATE INDEX RegardingCitizen_FirstName ON RegardingCitizen (FirstName);
CREATE INDEX RegardingCitizen_LastName ON RegardingCitizen (LastName);
CREATE INDEX "RegardingCitizen_CPR-nr" ON RegardingCitizen ("CPR-nr");
CREATE INDEX RequestingCitizen_FirstName ON RequestingCitizen (FirstName);
CREATE INDEX RequestingCitizen_LastName ON RequestingCitizen (LastName);
ALTER TABLE Employee ADD CONSTRAINT FKEmployee809946 FOREIGN KEY (DepartmentDepartmentID) REFERENCES Department (DepartmentID);
ALTER TABLE Employee ADD CONSTRAINT FKEmployee140220 FOREIGN KEY (RoleRoleID) REFERENCES Role (RoleID);
ALTER TABLE Role_Rights ADD CONSTRAINT FKRole_Right443248 FOREIGN KEY (RightsRightsID) REFERENCES Rights (RightsID);
ALTER TABLE Role_Rights ADD CONSTRAINT FKRole_Right705372 FOREIGN KEY (RoleRoleID) REFERENCES Role (RoleID);
ALTER TABLE RegardingCitizen ADD CONSTRAINT FKRegardingC104340 FOREIGN KEY (ZipcodeZipcode) REFERENCES Zipcode (Zipcode);
ALTER TABLE "Case" ADD CONSTRAINT FKCase212171 FOREIGN KEY (DepartmentDepartmentID) REFERENCES Department (DepartmentID);
ALTER TABLE "Case" ADD CONSTRAINT FKCase293328 FOREIGN KEY (EmployeeEmployeeID) REFERENCES Employee (EmployeeID);
ALTER TABLE Case_RequestingCitizen ADD CONSTRAINT FKCase_Reque264643 FOREIGN KEY (CaseCaseID) REFERENCES "Case" (CaseID);
ALTER TABLE Case_RequestingCitizen ADD CONSTRAINT FKCase_Reque329254 FOREIGN KEY (ReqCitizenReqCitizenID) REFERENCES RequestingCitizen (ReqCitizenID);
ALTER TABLE "Case" ADD CONSTRAINT FKCase660376 FOREIGN KEY (RegCitizenRegCitizenID) REFERENCES RegardingCitizen (RegCitizenID);
ALTER TABLE RequestingCitizen ADD CONSTRAINT FKRequesting186384 FOREIGN KEY (ZipcodeZipcode) REFERENCES Zipcode (Zipcode);