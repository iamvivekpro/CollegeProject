package com.idway.stackloop.skelmir;

import java.awt.Component;
import java.awt.Image;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import com.idway.stackloop.Jvm;

//import ceej.awt.CEEJImage;

public class SkelmirJvm extends Jvm {

	@Override
	public void writePNG(Image img, File outFile) throws IOException {/*
		CEEJImage ceejImage = (CEEJImage) img;
		OutputStream out = new FileOutputStream(outFile);
		ceejImage.encodePNG(out);
		out.close();
	*/}

	@Override
	public Image getOffscreenImage(Component c) {
		return c.createImage(c.getWidth(), c.getHeight());
	}

}
