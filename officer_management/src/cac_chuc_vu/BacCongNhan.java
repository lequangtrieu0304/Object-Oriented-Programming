package cac_chuc_vu;

public enum BacCongNhan {
    BAC_1(1),
    BAC_2(2),
    BAC_3(3),
    BAC_4(4),
    BAC_5(5),
    BAC_6(6),
    BAC_7(7),
    BAC_8(8),
    BAC_9(9),
    BAC_10(10);

    private final int value;

    BacCongNhan(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
