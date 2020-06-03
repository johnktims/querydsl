package com.querydsl.sql.suites;

import org.junit.BeforeClass;
import org.junit.experimental.categories.Category;

import com.querydsl.core.testutil.MySQL;
import com.querydsl.sql.*;

@Category(MySQL.class)
public class MySQLWithQuotingTest extends AbstractSuite {

    @Category(MySQL.class)
    public static class BeanPopulation extends BeanPopulationBase { }
    @Category(MySQL.class)
    public static class Delete extends DeleteBase { }
    @Category(MySQL.class)
    public static class Insert extends InsertBase { }
    @Category(MySQL.class)
    public static class KeywordQuoting extends KeywordQuotingBase { }
    @Category(MySQL.class)
    public static class LikeEscape extends LikeEscapeBase { }
    @Category(MySQL.class)
    public static class Merge extends MergeBase { }
    @Category(MySQL.class)
    public static class Select extends SelectBase { }
    @Category(MySQL.class)
    public static class Subqueries extends SubqueriesBase { }
    @Category(MySQL.class)
    public static class Types extends TypesBase { }
    @Category(MySQL.class)
    public static class Union extends UnionBase { }
    @Category(MySQL.class)
    public static class Update extends UpdateBase { }

    @BeforeClass
    public static void setUp() throws Exception {
        Connections.initMySQL();
        Connections.initConfiguration(MySQLTemplates.builder().quote().newLineToSingleSpace().build());
    }

}
