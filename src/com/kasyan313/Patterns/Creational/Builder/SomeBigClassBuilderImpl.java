package com.kasyan313.Patterns.Creational.Builder;

public class SomeBigClassBuilderImpl implements SomeBigCLassBuilder {
    SomeBigClass someBigClass;

    public SomeBigClassBuilderImpl() {
        someBigClass = new SomeBigClass();
    }

    @Override
    public void reset() {
        someBigClass = new SomeBigClass();
    }

    @Override
    public void setField1(String field1) {
        someBigClass.setField1(field1);
    }

    @Override
    public void setField2(String field2) {
        someBigClass.setField2(field2);
    }

    @Override
    public void setField3(int field3) {
        someBigClass.setField3(field3);
    }

    @Override
    public void setField4(boolean field4) {
        someBigClass.setField4(field4);
    }

    public SomeBigClass build() {
        return someBigClass;
    }
}
