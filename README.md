dropwizardChallenge
=============================


### Pre-requisites

MYSQL database: Update the main.yml if your configuration differs. In this example, we use

	database: hello_world
	user: hello_user
	pass: pass1234

### Build:

	mvn clean package
	

### Database creation:

	java -jar target/dropwizardChallenge-0.0.1.jar db migrate main.yml
	
	
### Run:

	java -jar target/dropwizardChallenge-0.0.1.jar server main.yml
	
	
### Open browser pointing at

	http://localhost:9000

