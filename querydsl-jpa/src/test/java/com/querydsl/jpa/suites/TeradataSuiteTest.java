package com.querydsl.jpa.suites;

import org.junit.BeforeClass;
import org.junit.experimental.categories.Category;

import com.querydsl.core.Target;
import com.querydsl.core.testutil.Teradata;
import com.querydsl.jpa.*;

@Category(Teradata.class)
public class TeradataSuiteTest extends AbstractSuite {

    @Category(Teradata.class)
    public static class JPA extends JPABase { }
    @Category(Teradata.class)
    public static class JPASQL extends JPASQLBase { }
    @Category(Teradata.class)
    public static class JPAIntegration extends JPAIntegrationBase { }
    @Category(Teradata.class)
    public static class Serialization extends SerializationBase { }
    @Category(Teradata.class)
    public static class Hibernate extends HibernateBase { }
    @Category(Teradata.class)
    public static class HibernateSQL extends HibernateSQLBase { }

    @BeforeClass
    public static void setUp() throws Exception {
        Mode.mode.set("teradata");
        Mode.target.set(Target.TERADATA);
    }

}
