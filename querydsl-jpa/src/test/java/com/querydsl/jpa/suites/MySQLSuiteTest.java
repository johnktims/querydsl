package com.querydsl.jpa.suites;

import org.junit.BeforeClass;
import org.junit.experimental.categories.Category;

import com.querydsl.core.Target;
import com.querydsl.core.testutil.MySQL;
import com.querydsl.jpa.*;

@Category(MySQL.class)
public class MySQLSuiteTest extends AbstractSuite {

    @Category(MySQL.class)
    public static class JPA extends JPABase {
        @Override
        public void order_stringValue_toLong() {
            // not supported
        }
    }
    @Category(MySQL.class)
    public static class JPASQL extends JPASQLBase { }
    @Category(MySQL.class)
    public static class JPAIntegration extends JPAIntegrationBase { }
    @Category(MySQL.class)
    public static class Serialization extends SerializationBase { }
    @Category(MySQL.class)
    public static class Hibernate extends HibernateBase {
        @Override
        public void order_stringValue_toLong() {
            // not supported
        }
    }
    @Category(MySQL.class)
    public static class HibernateSQL extends HibernateSQLBase { }

    @BeforeClass
    public static void setUp() throws Exception {
        Mode.mode.set("mysql");
        Mode.target.set(Target.MYSQL);
    }

}
