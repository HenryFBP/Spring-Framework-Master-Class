package com.henry.spring.cdi.springin5steps;

import com.henry.spring.basics.springin5steps.cdi.SomeCDIBusiness;
import com.henry.spring.basics.springin5steps.cdi.SomeCDIDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.NoSuchElementException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class SomeCDIBusinessTest {

    //inject mock in here
    @InjectMocks
    SomeCDIBusiness business;

    @Mock
    SomeCDIDAO daoMock;

    @Test
    public void testBinarySearch() {

        //when daomock.getdata is called, return int[]{2,4}.
        Mockito.when(this.daoMock.getData()).thenReturn(new int[]{2, 4});
        assertEquals(4, this.business.findGreatest());
    }

    @Test
    public void testBinarySearchEqualElements() {

        //when daomock.getdata is called, return int[]{2,4}.
        Mockito.when(this.daoMock.getData()).thenReturn(new int[]{2, 2, 2, 2});
        assertEquals(2, this.business.findGreatest());
    }

    @Test
    public void testBinarySearchNoElements() {

        //when daomock.getdata is called, return int[]{2,4}.
        Mockito.when(this.daoMock.getData()).thenReturn(new int[]{});
        assertThrows(NoSuchElementException.class, this.business::findGreatest);
    }

}
