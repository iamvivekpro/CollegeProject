package com.idway.stackloop;

import java.awt.Component;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

public abstract class Jvm {

    public abstract void writePNG(Image img, File outfile) throws IOException;

    public abstract Image getOffscreenImage(Component c);

    public final void writePNG(Image img) throws IOException {
        File outFile = new File(JvmFactory.getJvmId() + ".png");
        System.out.println("Writing image into [" + outFile.getAbsolutePath() + "]");
        writePNG(img, outFile);
    }

}
