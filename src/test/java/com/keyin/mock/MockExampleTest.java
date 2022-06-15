package com.keyin.mock;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MockExampleTest {
    @Mock
    private ObjectToMock mockObjectToMock;


    @Test
    public void testMethodToTest() {
        MockExample mockExampleUnderTest = new MockExample();
        mockExampleUnderTest.setObjectToMock(new ObjectToMock());

        Assertions.assertEquals("Not Mocked!", mockExampleUnderTest.methodToTest());
    }

    @Test
    public void testMethodToTestWithMock() {
        MockExample mockExampleUnderTest = new MockExample();
        mockExampleUnderTest.setObjectToMock(new ObjectToMock());
        Assertions.assertEquals("Not Mocked!", mockExampleUnderTest.methodToTest());

        mockExampleUnderTest.setObjectToMock(mockObjectToMock);
        Mockito.when(mockObjectToMock.methodToMock()).thenReturn("Mocked!");
        Assertions.assertEquals("Mocked!", mockExampleUnderTest.methodToTest());
    }
}
