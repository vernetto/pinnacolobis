package org.pierre.pinnacolo;

public enum CardValues {
    V1("1"), V2("2"), V3("3"), V4("4"), V5("5"), V6("6"), V7("7"), V8("8"), V9("9"), V10("10"), VF("F"),  VD("D"), VR("R");

    String value;
    CardValues(String value) {
        this.value = value;
    }
}
