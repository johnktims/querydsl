package com.querydsl.sql.suites;

import org.junit.BeforeClass;
import org.junit.experimental.categories.Category;

import com.querydsl.core.testutil.SQLite;
import com.querydsl.sql.*;

@Category(SQLite.class)
public class SQLiteLiteralsSuiteTest extends AbstractSuite {

    @Category(SQLite.class)
    public static class BeanPopulation extends BeanPopulationBase { }
    @Category(SQLite.class)
    public static class Delete extends DeleteBase { }
    @Category(SQLite.class)
    public static class Insert extends InsertBase { }
    @Category(SQLite.class)
    public static class KeywordQuoting extends KeywordQuotingBase { }
    @Category(SQLite.class)
    public static class LikeEscape extends LikeEscapeBase { }
    @Category(SQLite.class)
    public static class Merge extends MergeBase { }
    @Category(SQLite.class)
    public static class Select extends SelectBase { }
    @Category(SQLite.class)
    public static class Subqueries extends SubqueriesBase { }
    @Category(SQLite.class)
    public static class Types extends TypesBase { }
    @Category(SQLite.class)
    public static class Union extends UnionBase { }
    @Category(SQLite.class)
    public static class Update extends UpdateBase { }

    @BeforeClass
    public static void setUp() throws Exception {
        Connections.initSQLite();
        Connections.initConfiguration(SQLiteTemplates.builder().newLineToSingleSpace().build());
        Connections.getConfiguration().setUseLiterals(true);
    }

}
