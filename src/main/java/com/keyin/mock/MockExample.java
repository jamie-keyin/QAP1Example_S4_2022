package com.keyin.mock;

public class MockExample {
    private ObjectToMock objectToMock;

    public String methodToTest() {
        return objectToMock.methodToMock();
    }

    public ObjectToMock getObjectToMock() {
        return objectToMock;
    }

    public void setObjectToMock(ObjectToMock objectToMock) {
        this.objectToMock = objectToMock;
    }

}
