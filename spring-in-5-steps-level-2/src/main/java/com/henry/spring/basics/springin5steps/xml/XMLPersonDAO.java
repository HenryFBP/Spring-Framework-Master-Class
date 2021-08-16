package com.henry.spring.basics.springin5steps.xml;

public class XMLPersonDAO {

    XMLJdbcConnection XMLJdbcConnection;

    public XMLJdbcConnection getJdbcConnection() {
        return this.XMLJdbcConnection;
    }

    public void setJdbcConnection(XMLJdbcConnection XMLJdbcConnection) {
        this.XMLJdbcConnection = XMLJdbcConnection;
    }
}
