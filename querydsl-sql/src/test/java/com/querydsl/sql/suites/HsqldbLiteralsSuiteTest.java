package com.querydsl.sql.suites;

import org.junit.BeforeClass;
import org.junit.experimental.categories.Category;

import com.querydsl.core.testutil.HSQLDB;
import com.querydsl.sql.*;

@Category(HSQLDB.class)
public class HsqldbLiteralsSuiteTest extends AbstractSuite {

    @Category(HSQLDB.class)
    public static class BeanPopulation extends BeanPopulationBase { }
    @Category(HSQLDB.class)
    public static class Delete extends DeleteBase { }
    @Category(HSQLDB.class)
    public static class Insert extends InsertBase { }
    @Category(HSQLDB.class)
    public static class KeywordQuoting extends KeywordQuotingBase { }
    @Category(HSQLDB.class)
    public static class LikeEscape extends LikeEscapeBase { }
    @Category(HSQLDB.class)
    public static class Merge extends MergeBase { }
    @Category(HSQLDB.class)
    public static class Select extends SelectBase { }
    @Category(HSQLDB.class)
    public static class Subqueries extends SubqueriesBase { }
    @Category(HSQLDB.class)
    public static class Types extends TypesBase { }
    @Category(HSQLDB.class)
    public static class Union extends UnionBase { }
    @Category(HSQLDB.class)
    public static class Update extends UpdateBase { }

    @BeforeClass
    public static void setUp() throws Exception {
        Connections.initHSQL();
        Connections.initConfiguration(HSQLDBTemplates.builder().newLineToSingleSpace().build());
        Connections.getConfiguration().setUseLiterals(true);
    }

}
