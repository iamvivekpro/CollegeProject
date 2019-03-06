package com.idway.stackloop;

import com.idway.stackloop.skelmir.SkelmirJvm;
import com.idway.stackloop.sun.SunJvm;

public class JvmFactory {

    private final static Jvm Instance;

    static {
        String vendor = getJvmId();
        if (vendor.contains("Sun")) {
            Instance = new SunJvm();
        } else {
            Instance = new SkelmirJvm();
        }
    }

    public final static Jvm getJvm() {
        return Instance;
    }

    public final static String getJvmId() {
        String version = System.getProperty("java.vm.version");
        String vendor = System.getProperty("java.vm.vendor");
        return vendor + "_" + version;
    }
}
