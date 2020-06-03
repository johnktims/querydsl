package com.querydsl.sql.suites;

import org.junit.BeforeClass;
import org.junit.experimental.categories.Category;

import com.querydsl.core.testutil.Oracle;
import com.querydsl.sql.*;

@Category(Oracle.class)
public class OracleWithQuotingTest extends AbstractSuite {

    @Category(Oracle.class)
    public static class BeanPopulation extends BeanPopulationBase { }
    @Category(Oracle.class)
    public static class Delete extends DeleteBase { }
    @Category(Oracle.class)
    public static class Insert extends InsertBase { }
    @Category(Oracle.class)
    public static class KeywordQuoting extends KeywordQuotingBase { }
    @Category(Oracle.class)
    public static class LikeEscape extends LikeEscapeBase { }
    @Category(Oracle.class)
    public static class Merge extends MergeBase { }
    @Category(Oracle.class)
    public static class Select extends SelectBase { }
    @Category(Oracle.class)
    public static class Subqueries extends SubqueriesBase { }
    @Category(Oracle.class)
    public static class Types extends TypesBase { }
    @Category(Oracle.class)
    public static class Union extends UnionBase { }
    @Category(Oracle.class)
    public static class Update extends UpdateBase { }

    @BeforeClass
    public static void setUp() throws Exception {
        Connections.initOracle();
        Connections.initConfiguration(OracleTemplates.builder().quote().newLineToSingleSpace().build());
    }

}
