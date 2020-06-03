package com.querydsl.jpa.suites;

import org.junit.BeforeClass;
import org.junit.experimental.categories.Category;

import com.querydsl.core.Target;
import com.querydsl.core.testutil.PostgreSQL;
import com.querydsl.jpa.*;

@Category(PostgreSQL.class)
public class PostgreSQLEclipseLinkSuiteTest extends AbstractJPASuite {

    @Category(PostgreSQL.class)
    public static class JPA extends JPABase { }
    @Category(PostgreSQL.class)
    public static class JPASQL extends JPASQLBase { }
    @Category(PostgreSQL.class)
    public static class JPAIntegration extends JPAIntegrationBase { }
    @Category(PostgreSQL.class)
    public static class Serialization extends SerializationBase { }

    @BeforeClass
    public static void setUp() throws Exception {
        Mode.mode.set("postgresql-eclipselink");
        Mode.target.set(Target.POSTGRESQL);
    }

}
