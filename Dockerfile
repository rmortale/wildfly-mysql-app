FROM rmortale/wildfly-mysql
ADD target/wildfly-mysql-app.war /opt/jboss/wildfly/standalone/deployments/

