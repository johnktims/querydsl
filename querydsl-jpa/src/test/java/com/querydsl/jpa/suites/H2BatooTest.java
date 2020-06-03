package com.querydsl.jpa.suites;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.experimental.categories.Category;

import com.querydsl.core.Target;
import com.querydsl.core.testutil.H2;
import com.querydsl.jpa.*;

@Ignore
@Category(H2.class)
public class H2BatooTest extends AbstractJPASuite {

    @Category(H2.class)
    public static class JPA extends JPABase { }
    @Category(H2.class)
    public static class JPASQL extends JPASQLBase { }
    @Category(H2.class)
    public static class JPAIntegration extends JPAIntegrationBase { }
    @Category(H2.class)
    public static class Serialization extends SerializationBase { }

    @BeforeClass
    public static void setUp() throws Exception {
        Mode.mode.set("h2-batoo");
        Mode.target.set(Target.H2);
    }

}
