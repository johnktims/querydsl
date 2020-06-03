package com.querydsl.jpa.suites;

import org.junit.BeforeClass;
import org.junit.experimental.categories.Category;

import com.querydsl.core.Target;
import com.querydsl.core.testutil.Derby;
import com.querydsl.jpa.*;

@Category(Derby.class)
public class DerbySuiteTest extends AbstractSuite {

    @Category(Derby.class)
    public static class JPA extends JPABase { }
    @Category(Derby.class)
    public static class JPASQL extends JPASQLBase { }
    @Category(Derby.class)
    public static class JPAIntegration extends JPAIntegrationBase { }
    @Category(Derby.class)
    public static class Serialization extends SerializationBase { }
    @Category(Derby.class)
    public static class Hibernate extends HibernateBase { }
    @Category(Derby.class)
    public static class HibernateSQL extends HibernateSQLBase { }

    @BeforeClass
    public static void setUp() throws Exception {
        Mode.mode.set("derby");
        Mode.target.set(Target.DERBY);
    }

}
