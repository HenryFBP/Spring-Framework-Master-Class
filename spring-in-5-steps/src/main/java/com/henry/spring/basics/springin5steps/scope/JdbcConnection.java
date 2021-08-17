package com.henry.spring.basics.springin5steps.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE;
import static org.springframework.context.annotation.ScopedProxyMode.TARGET_CLASS;

@Component
@Scope(value = SCOPE_PROTOTYPE, proxyMode = TARGET_CLASS) //proxymode=target_class means make sure there's a new instance of this class, even with singleton parents that require me
public class JdbcConnection {
    public JdbcConnection() {
        System.out.println("JDBC Connection is coolio! ;)");
    }
}
