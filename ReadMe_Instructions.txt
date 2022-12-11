
----------

AWS make S3 bucket public using this policy-
https://docs.aws.amazon.com/AmazonS3/latest/userguide/WebsiteAccessPermissionsReqd.html

Make sure crossOrigin on controller have UI link. (In case of local it is localhost:4200)

-----------

SELECT * FROM biographyService.summary;
ALTER TABLE biographyService.summary MODIFY SUMMARY_DETAILS VARCHAR(500);
INSERT INTO biographyService.summary (ID, SUMMARY_DETAILS) VALUES (1, "A detail-oriented Software Engineer having strong experience in building financial technology solutions.During my journey of Java Full Stack Development, I have collaborated with global teams following scaled agile practices to develop rich applications using latest technology stack. I am dedicated to perfecting my skills by learning from more experienced developers, remaining humble and learn all that I can in this endless journey");
commit;

----------------

SELECT * FROM biographyService.skills;
INSERT INTO biographyService.skills (ID, NAME, TYPE) VALUES (1, "JAVA 11, OOPS, JPA/Hibernate, RESTful web services, Microservices, Oracle SQL","Technologies");
INSERT INTO biographyService.skills (ID, NAME, TYPE) VALUES (2, "Angular 8, Spring boot","Frameworks");
INSERT INTO biographyService.skills (ID, NAME, TYPE) VALUES (3, "Git/BitBucket, Jenkins, SonarQ, OpenShift, Splunk, AWS, Maven, Flyway, RabbitMQ, Swagger, Postman, Mockito & Junit5","Tools");
INSERT INTO biographyService.skills (ID, NAME, TYPE) VALUES (4, "Scaled Agile (SAFe), Jira, Confluence, Miro board","Others");
commit;

---------------

SELECT * FROM biographyService.experience;
ALTER TABLE biographyService.experience MODIFY DESCRIPTION VARCHAR(1000)
INSERT INTO biographyService.experience (ID, POSITION, LOCATION, COMPANY, CLIENT, YEAR, DESCRIPTION) 
VALUES (1, "Software Developer","Mumbai, India","LTIMindtree","Nets DK","Aug 2020- Present","Java Full stack development of payment gateway solutions for merchants based in Nordic region.Development of web portal for configuration of payment gateways which are active at merchant sales locations.Designing and developing end to end APIs, building UI, creation of microservices and facilitate communication between them.Collaborate with Product owners to understand new requirements and design, develop features.Involvement in feature releases to production environment, hotfixes, deployments, agile ceremonies.Took a part in code reviews to suggest efficient coding practices as suggested by SonarQ.Working in agile environment following SAFe practices, collaboration using Miro board");
commit;

---------------

SELECT * FROM biographyService.certifications;
INSERT INTO biographyService.certifications (ID, COMPLETED_ON, NAME) VALUES (1,"May 2021","Microsoft Azure Cloud Fundamentals AZ-900");
INSERT INTO biographyService.certifications (ID, COMPLETED_ON, NAME) VALUES (2,"May 2022","AWS Certified Cloud Practitioner");
commit;

----------------

SELECT * FROM biographyService.education;
INSERT INTO biographyService.education (ID, DEGREE, UNIVERSITY, YEAR_OF_COMPLETION, GRADES)
VALUES (1, "Bachelor of Engineering (B.E),Information Technology","Mumbai University","2020","8.69 / 10");
commit;

----------------------

INSERT INTO biographyService.personal (.,.,.,) VALUES (1, "15th September 1998","Competitive Swimming","English, Hindi, Marathi");


-------------------------------


https://www.youtube.com/watch?v=IucFDX3RO9U
https://www.youtube.com/watch?v=QV7ke4a7Lvc
https://www.youtube.com/watch?v=lrVpUVydZwM&list=PLC3y8-rFHvwilEuCqFGTL5Gt5U6deIrsU&index=26
