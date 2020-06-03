package com.querydsl.sql.suites;

import org.junit.BeforeClass;
import org.junit.experimental.categories.Category;

import com.querydsl.core.testutil.Firebird;
import com.querydsl.sql.*;

@Category(Firebird.class)
public class FirebirdSuiteTest extends AbstractSuite {

    @Category(Firebird.class)
    public static class BeanPopulation extends BeanPopulationBase { }
    @Category(Firebird.class)
    public static class Delete extends DeleteBase { }
    @Category(Firebird.class)
    public static class Insert extends InsertBase { }
    @Category(Firebird.class)
    public static class KeywordQuoting extends KeywordQuotingBase { }
    @Category(Firebird.class)
    public static class LikeEscape extends LikeEscapeBase { }
    @Category(Firebird.class)
    public static class Merge extends MergeBase { }
    @Category(Firebird.class)
    public static class Select extends SelectBase { }
    @Category(Firebird.class)
    public static class Subqueries extends SubqueriesBase { }
    @Category(Firebird.class)
    public static class Types extends TypesBase { }
    @Category(Firebird.class)
    public static class Union extends UnionBase { }
    @Category(Firebird.class)
    public static class Update extends UpdateBase { }

    @BeforeClass
    public static void setUp() throws Exception {
        Connections.initFirebird();
        Connections.initConfiguration(FirebirdTemplates.builder().newLineToSingleSpace().build());
    }
}
