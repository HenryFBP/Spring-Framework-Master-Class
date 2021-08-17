package com.henry.spring.basics.springin5steps.cdi;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.Arrays;

@Named
public class SomeCDIBusiness {

    @Inject
    SomeCDIDAO someCDIDAO;

    public SomeCDIDAO getSomeCDIDAO() {
        return this.someCDIDAO;
    }

    public void setSomeCDIDAO(SomeCDIDAO someCDIDAO) {
        this.someCDIDAO = someCDIDAO;
    }

    public int findGreatest(){
        return Arrays.stream(this.someCDIDAO.getData()).max().getAsInt();
    }

}
