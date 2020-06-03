package com.querydsl.jpa.suites;

import org.junit.BeforeClass;
import org.junit.experimental.categories.Category;

import com.querydsl.core.Target;
import com.querydsl.core.testutil.H2;
import com.querydsl.jpa.*;

@Category(H2.class)
public class H2SuiteTest extends AbstractSuite {

    @Category(H2.class)
    public static class JPA extends JPABase { }
    @Category(H2.class)
    public static class JPASQL extends JPASQLBase { }
    @Category(H2.class)
    public static class JPAIntegration extends JPAIntegrationBase { }
    @Category(H2.class)
    public static class Serialization extends SerializationBase { }
    @Category(H2.class)
    public static class Hibernate extends HibernateBase { }
    @Category(H2.class)
    public static class HibernateSQL extends HibernateSQLBase { }

    @BeforeClass
    public static void setUp() throws Exception {
        Mode.mode.set("h2");
        Mode.target.set(Target.H2);
    }

}
