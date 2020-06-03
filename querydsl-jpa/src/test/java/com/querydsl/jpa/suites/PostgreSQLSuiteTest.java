package com.querydsl.jpa.suites;

import org.junit.BeforeClass;
import org.junit.experimental.categories.Category;

import com.querydsl.core.Target;
import com.querydsl.core.testutil.PostgreSQL;
import com.querydsl.jpa.*;

@Category(PostgreSQL.class)
public class PostgreSQLSuiteTest extends AbstractSuite {

    @Category(PostgreSQL.class)
    public static class JPA extends JPABase { }
    @Category(PostgreSQL.class)
    public static class JPASQL extends JPASQLBase { }
    @Category(PostgreSQL.class)
    public static class JPAIntegration extends JPAIntegrationBase { }
    @Category(PostgreSQL.class)
    public static class Serialization extends SerializationBase { }
    @Category(PostgreSQL.class)
    public static class Hibernate extends HibernateBase { }
    @Category(PostgreSQL.class)
    public static class HibernateSQL extends HibernateSQLBase { }

    @BeforeClass
    public static void setUp() throws Exception {
        Mode.mode.set("postgresql");
        Mode.target.set(Target.POSTGRESQL);
    }

}
