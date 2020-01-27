package com.serial.kotlin.iterative;

import java.util.List;

public final class UglyCast {

    public static int getSize(Object obj) {
        if (obj instanceof List) {
            return ((List) obj).size();
        } else if (obj instanceof String) {
            return ((String) obj).length();
        } else {
            return 0;
        }
    }
}
