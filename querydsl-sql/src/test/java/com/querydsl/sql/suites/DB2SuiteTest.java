package com.querydsl.sql.suites;

import org.junit.BeforeClass;
import org.junit.experimental.categories.Category;

import com.querydsl.core.testutil.DB2;
import com.querydsl.sql.*;

@Category(DB2.class)
public class DB2SuiteTest extends AbstractSuite {

    @Category(DB2.class)
    public static class BeanPopulation extends BeanPopulationBase { }
    @Category(DB2.class)
    public static class Delete extends DeleteBase { }
    @Category(DB2.class)
    public static class Insert extends InsertBase { }
    @Category(DB2.class)
    public static class KeywordQuoting extends KeywordQuotingBase { }
    @Category(DB2.class)
    public static class LikeEscape extends LikeEscapeBase { }
    @Category(DB2.class)
    public static class Merge extends MergeBase { }
    @Category(DB2.class)
    public static class Select extends SelectBase { }
    @Category(DB2.class)
    public static class SelectWindowFunctions extends SelectWindowFunctionsBase { }
    @Category(DB2.class)
    public static class Subqueries extends SubqueriesBase { }
    @Category(DB2.class)
    public static class Types extends TypesBase { }
    @Category(DB2.class)
    public static class Union extends UnionBase { }
    @Category(DB2.class)
    public static class Update extends UpdateBase { }

    @BeforeClass
    public static void setUp() throws Exception {
        Connections.initDB2();
        Connections.initConfiguration(DB2Templates.builder().newLineToSingleSpace().build());
    }

}
