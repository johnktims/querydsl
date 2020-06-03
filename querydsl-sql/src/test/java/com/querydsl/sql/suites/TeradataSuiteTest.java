package com.querydsl.sql.suites;

import org.junit.BeforeClass;
import org.junit.experimental.categories.Category;

import com.querydsl.core.testutil.Teradata;
import com.querydsl.sql.*;

@Category(Teradata.class)
public class TeradataSuiteTest extends AbstractSuite {

    @Category(Teradata.class)
    public static class BeanPopulation extends BeanPopulationBase { }
    @Category(Teradata.class)
    public static class Delete extends DeleteBase { }
    @Category(Teradata.class)
    public static class Insert extends InsertBase { }
    @Category(Teradata.class)
    public static class KeywordQuoting extends KeywordQuotingBase { }
    @Category(Teradata.class)
    public static class LikeEscape extends LikeEscapeBase { }
    @Category(Teradata.class)
    public static class Merge extends MergeBase { }
    @Category(Teradata.class)
    public static class Select extends SelectBase { }
    @Category(Teradata.class)
    public static class SelectTeradata extends SelectTeradataBase { }
    @Category(Teradata.class)
    public static class SelectWindowFunctions extends SelectWindowFunctionsBase { }
    @Category(Teradata.class)
    public static class Subqueries extends SubqueriesBase { }
    @Category(Teradata.class)
    public static class Types extends TypesBase { }
    @Category(Teradata.class)
    public static class Union extends UnionBase { }
    @Category(Teradata.class)
    public static class Update extends UpdateBase { }

    @BeforeClass
    public static void setUp() throws Exception {
        Connections.initTeradata();
        Connections.initConfiguration(TeradataTemplates.builder().newLineToSingleSpace().build());
    }

}
