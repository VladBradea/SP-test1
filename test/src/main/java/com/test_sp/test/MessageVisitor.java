package com.test_sp.test;

// Visitor pattern
public interface MessageVisitor {
    void visitAtreidesMessage(Message message);

    void visitHarkonnenMessage(Message message);
}
