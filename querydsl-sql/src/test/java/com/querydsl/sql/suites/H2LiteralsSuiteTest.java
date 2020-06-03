package com.querydsl.sql.suites;

import org.junit.BeforeClass;
import org.junit.experimental.categories.Category;

import com.querydsl.core.testutil.H2;
import com.querydsl.sql.*;

@Category(H2.class)
public class H2LiteralsSuiteTest extends AbstractSuite {

    @Category(H2.class)
    public static class BeanPopulation extends BeanPopulationBase { }
    @Category(H2.class)
    public static class Delete extends DeleteBase { }
    @Category(H2.class)
    public static class Insert extends InsertBase { }
    @Category(H2.class)
    public static class KeywordQuoting extends KeywordQuotingBase { }
    @Category(H2.class)
    public static class LikeEscape extends LikeEscapeBase { }
    @Category(H2.class)
    public static class Merge extends MergeBase { }
    @Category(H2.class)
    public static class Select extends SelectBase { }
    @Category(H2.class)
    public static class Subqueries extends SubqueriesBase { }
    @Category(H2.class)
    public static class Types extends TypesBase { }
    @Category(H2.class)
    public static class Union extends UnionBase { }
    @Category(H2.class)
    public static class Update extends UpdateBase { }

    @BeforeClass
    public static void setUp() throws Exception {
        Connections.initH2();
        Connections.initConfiguration(H2Templates.builder().newLineToSingleSpace().build());
        Connections.getConfiguration().setUseLiterals(true);
    }

}
