package com.querydsl.jpa.suites;

import org.junit.BeforeClass;
import org.junit.experimental.categories.Category;

import com.querydsl.core.Target;
import com.querydsl.core.testutil.SQLServer;
import com.querydsl.jpa.*;

@Category(SQLServer.class)
public class MSSQLSuiteTest extends AbstractSuite {

    @Category(SQLServer.class)
    public static class JPA extends JPABase { }
    @Category(SQLServer.class)
    public static class JPASQL extends JPASQLBase { }
    @Category(SQLServer.class)
    public static class JPAIntegration extends JPAIntegrationBase { }
    @Category(SQLServer.class)
    public static class Serialization extends SerializationBase { }
    @Category(SQLServer.class)
    public static class Hibernate extends HibernateBase { }
    @Category(SQLServer.class)
    public static class HibernateSQL extends HibernateSQLBase { }

    @BeforeClass
    public static void setUp() throws Exception {
        Mode.mode.set("mssql");
        Mode.target.set(Target.SQLSERVER);
    }

}
