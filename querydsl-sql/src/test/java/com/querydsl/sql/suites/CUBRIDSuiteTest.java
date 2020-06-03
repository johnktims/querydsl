package com.querydsl.sql.suites;

import org.junit.BeforeClass;
import org.junit.experimental.categories.Category;

import com.querydsl.core.testutil.CUBRID;
import com.querydsl.sql.*;

@Category(CUBRID.class)
public class CUBRIDSuiteTest extends AbstractSuite {

    @Category(CUBRID.class)
    public static class BeanPopulation extends BeanPopulationBase { }
    @Category(CUBRID.class)
    public static class Delete extends DeleteBase { }
    @Category(CUBRID.class)
    public static class Insert extends InsertBase { }
    @Category(CUBRID.class)
    public static class KeywordQuoting extends KeywordQuotingBase { }
    @Category(CUBRID.class)
    public static class LikeEscape extends LikeEscapeBase { }
    @Category(CUBRID.class)
    public static class Merge extends MergeBase { }
    @Category(CUBRID.class)
    public static class Select extends SelectBase { }
    @Category(CUBRID.class)
    public static class Subqueries extends SubqueriesBase { }
    @Category(CUBRID.class)
    public static class Types extends TypesBase { }
    @Category(CUBRID.class)
    public static class Union extends UnionBase { }
    @Category(CUBRID.class)
    public static class Update extends UpdateBase { }

    @BeforeClass
    public static void setUp() throws Exception {
        Connections.initCubrid();
        Connections.initConfiguration(CUBRIDTemplates.builder().newLineToSingleSpace().build());
    }

}
