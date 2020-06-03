package com.querydsl.sql.suites;

import org.junit.BeforeClass;
import org.junit.experimental.categories.Category;

import com.querydsl.core.testutil.PostgreSQL;
import com.querydsl.sql.*;

@Category(PostgreSQL.class)
public class PostgreSQLSuiteTest extends AbstractSuite {

    @Category(PostgreSQL.class)
    public static class BeanPopulation extends BeanPopulationBase { }
    @Category(PostgreSQL.class)
    public static class Delete extends DeleteBase { }
    @Category(PostgreSQL.class)
    public static class Insert extends InsertBase { }
    @Category(PostgreSQL.class)
    public static class KeywordQuoting extends KeywordQuotingBase {

        private Configuration previous;

        @Override
        public void setUp() throws Exception {
            //NOTE: replacing the templates with a non-quoting one
            previous = configuration;
            configuration = new Configuration(PostgreSQLTemplates.builder().newLineToSingleSpace().build());
            super.setUp();
        }

        @Override
        public void tearDown() throws Exception {
            super.tearDown();
            //NOTE: restoring old templates
            configuration = previous;
        }

    }
    @Category(PostgreSQL.class)
    public static class LikeEscape extends LikeEscapeBase { }
    @Category(PostgreSQL.class)
    public static class Merge extends MergeBase { }
    @Category(PostgreSQL.class)
    public static class Select extends SelectBase { }
    @Category(PostgreSQL.class)
    public static class SelectWindowFunctions extends SelectWindowFunctionsBase { }
    @Category(PostgreSQL.class)
    public static class Subqueries extends SubqueriesBase { }
    @Category(PostgreSQL.class)
    public static class Types extends TypesBase { }
    @Category(PostgreSQL.class)
    public static class Union extends UnionBase { }
    @Category(PostgreSQL.class)
    public static class Update extends UpdateBase { }

    @BeforeClass
    public static void setUp() throws Exception {
        Connections.initPostgreSQL();
        Connections.initConfiguration(PostgreSQLTemplates.builder().quote().newLineToSingleSpace().build());
    }

}
