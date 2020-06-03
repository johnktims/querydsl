package com.querydsl.sql.suites;

import org.junit.BeforeClass;
import org.junit.experimental.categories.Category;

import com.querydsl.core.testutil.Derby;
import com.querydsl.sql.*;

@Category(Derby.class)
public class DerbyLiteralsSuiteTest extends AbstractSuite {

    @Category(Derby.class)
    public static class BeanPopulation extends BeanPopulationBase { }
    @Category(Derby.class)
    public static class Delete extends DeleteBase { }
    @Category(Derby.class)
    public static class Insert extends InsertBase { }
    @Category(Derby.class)
    public static class KeywordQuoting extends KeywordQuotingBase { }
    @Category(Derby.class)
    public static class LikeEscape extends LikeEscapeBase { }
    @Category(Derby.class)
    public static class Merge extends MergeBase { }
    @Category(Derby.class)
    public static class Select extends SelectBase { }
    @Category(Derby.class)
    public static class Subqueries extends SubqueriesBase { }
    @Category(Derby.class)
    public static class Types extends TypesBase { }
    @Category(Derby.class)
    public static class Union extends UnionBase { }
    @Category(Derby.class)
    public static class Update extends UpdateBase { }

    @BeforeClass
    public static void setUp() throws Exception {
        Connections.initDerby();
        Connections.initConfiguration(DerbyTemplates.builder().newLineToSingleSpace().build());
        Connections.getConfiguration().setUseLiterals(true);
    }

}
