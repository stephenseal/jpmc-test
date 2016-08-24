
OVERVIEW
========
This is a test project for JPMorgan Chase.

MAIN COMPONENTS USED
====================
It has been developed using the following items;

	* Apache Maven 3.3.3
	* Spring Tool Suite (STS) Version: 3.7.3.RELEASE
	* java version "1.8.0_91"

While I have used the STS IDE, I have not used any Spring components as this is for me, out of scope for the purposes of this test.  My understanding of the Spring framework(s) is good (please see early SVN versions of DCPP codebase for usage of Spring version 2.5 which I brought into use at the outset of the DCPP endeavour in 2009/2010).  Nowadays, I would advocate the usage of its more recent version (Spring 4) as it has a better ability to limit the XML configuration that is needed, through usage of some useful annotations and DSL based configuration!

EXPLICIT MAVEN DEPENDENCIES
===========================
I have used the following explicit dependencies in this project;

	* junit 4.12
	* log4j 1.2.17

TEST-OUTPUT
===========
I have run the associated JUnit test from both within the STS IDE and also on the command line for completeness using the maven "mvn clean compile javadoc:javadoc package" command. I have not used any mocking frameworks (Mockito / EasyMock etc.), in the real world I would however for the purposes of this exercise I decided not to.  Test output can be found in "[project]/target/surefire-reports/".  The surefire component is used as part of the Maven build process (under the "test" goal).  Given the version of Maven being used, there has been no need to explicitly add the surefire plugin for this to occur.  I have not provided a JUnit Test Suite (AllTests implementatino) as Maven will take care of firing all classes annotated with @Test.

DOCS
====
Javadocs can be found in "[project]/target/site/apidocs/index.html" and are generated as part of the maven build (mvn javadoc:javadoc) using the maven javadoc plugin (version 2.10.4).  

NOTE : If you are unable to build due to this javadoc plugin being unavailable, then please comment it out.