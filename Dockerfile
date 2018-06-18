FROM rmortale/wildfly-mysql:travis-5
ADD target/wildfly-mysql-app.war /opt/jboss/wildfly/standalone/deployments/ROOT.war

