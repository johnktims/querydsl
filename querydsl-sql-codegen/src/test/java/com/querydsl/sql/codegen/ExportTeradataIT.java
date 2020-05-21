package com.querydsl.sql.codegen;

import org.junit.BeforeClass;
import org.junit.experimental.categories.Category;

import com.querydsl.core.testutil.Teradata;
import com.querydsl.sql.Connections;

@Category(Teradata.class)
public class ExportTeradataIT extends ExportBaseTest {

    @BeforeClass
    public static void setUpClass() throws Exception {
        Connections.initTeradata();
    }

}
