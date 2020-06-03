package com.querydsl.jpa.suites;

import org.junit.BeforeClass;
import org.junit.experimental.categories.Category;

import com.querydsl.core.Target;
import com.querydsl.core.testutil.Oracle;
import com.querydsl.jpa.*;

@Category(Oracle.class)
public class OracleSuiteTest extends AbstractSuite {

    @Category(Oracle.class)
    public static class JPA extends JPABase { }
    @Category(Oracle.class)
    public static class JPASQL extends JPASQLBase { }
    @Category(Oracle.class)
    public static class JPAIntegration extends JPAIntegrationBase { }
    @Category(Oracle.class)
    public static class Serialization extends SerializationBase { }
    @Category(Oracle.class)
    public static class Hibernate extends HibernateBase { }
    @Category(Oracle.class)
    public static class HibernateSQL extends HibernateSQLBase { }

    @BeforeClass
    public static void setUp() throws Exception {
        Mode.mode.set("oracle");
        Mode.target.set(Target.ORACLE);
    }

}
