FROM rmortale/wildfly-mysql:travis-4
ADD target/wildfly-mysql-app.war /opt/jboss/wildfly/standalone/deployments/

