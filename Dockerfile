FROM rmortale/wildfly-mysql:travis-8
ADD target/wildfly-mysql-app.war /opt/jboss/wildfly/standalone/deployments/ROOT.war

