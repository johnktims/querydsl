package com.querydsl.jpa.suites;

import org.junit.BeforeClass;
import org.junit.experimental.categories.Category;

import com.querydsl.core.Target;
import com.querydsl.core.testutil.HSQLDB;
import com.querydsl.jpa.*;

@Category(HSQLDB.class)
public class HSQLDBEclipseLinkTest extends AbstractJPASuite {

    @Category(HSQLDB.class)
    public static class JPA extends JPABase { }
    @Category(HSQLDB.class)
    public static class JPASQL extends JPASQLBase { }
    @Category(HSQLDB.class)
    public static class JPAIntegration extends JPAIntegrationBase { }
    @Category(HSQLDB.class)
    public static class Serialization extends SerializationBase { }

    @BeforeClass
    public static void setUp() throws Exception {
        Mode.mode.set("hsqldb-eclipselink");
        Mode.target.set(Target.HSQLDB);
    }

}
