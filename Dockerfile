FROM rmortale/wildfly-mysql:travis-6
ADD target/wildfly-mysql-app.war /opt/jboss/wildfly/standalone/deployments/ROOT.war

