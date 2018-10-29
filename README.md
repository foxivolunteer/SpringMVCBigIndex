# SpringMVCBigIndex
Spring MVC tutorials

For the JNDI repo, datasource must be added into context.xml under the tomcat for postgresql.
```
<Resource name="jdbc/myjndi" auth="Container"
          type="javax.sql.DataSource" driverClassName="org.postgresql.Driver"
          url="jdbc:postgresql://127.0.0.1:5432/MAINDB"
          username="test" password="12345678" maxTotal="20" maxIdle="10" maxWaitMillis="-1"/>'
```
