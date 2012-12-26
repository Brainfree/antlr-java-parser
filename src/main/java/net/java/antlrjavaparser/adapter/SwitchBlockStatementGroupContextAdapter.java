package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.stmt.Statement;
import net.java.antlrjavaparser.api.stmt.SwitchEntryStmt;

import java.util.LinkedList;
import java.util.List;

public class SwitchBlockStatementGroupContextAdapter implements Adapter<SwitchEntryStmt, Java7Parser.SwitchBlockStatementGroupContext> {
    public SwitchEntryStmt adapt(Java7Parser.SwitchBlockStatementGroupContext context) {

        /*
            switchBlockStatementGroup
                :
                    switchLabel
                    (blockStatement
                    )*
                ;

            switchLabel
                :   CASE expression COLON
                |   DEFAULT COLON
                ;
         */

        SwitchEntryStmt switchEntryStmt = new SwitchEntryStmt();

        if (context.blockStatement() != null && context.blockStatement().size() > 0) {
            List<Statement> blockStmtList = new LinkedList<Statement>();
            for (Java7Parser.BlockStatementContext blockStatementContext : context.blockStatement()) {
                blockStmtList.add(Adapters.getBlockStatementContextAdapter().adapt(blockStatementContext));
            }
            switchEntryStmt.setStmts(blockStmtList);
        }

        if (context.switchLabel().CASE() != null) {
            switchEntryStmt.setLabel(Adapters.getExpressionContextAdapter().adapt(context.switchLabel().expression()));
        } else if (context.switchLabel().DEFAULT() != null) {
            // Explicitly setting these null for readability
            switchEntryStmt.setLabel(null);
            switchEntryStmt.setStmts(null);
        }

        return switchEntryStmt;
    }
}