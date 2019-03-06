package com.idway.stackloop.sun;

import java.awt.Component;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.idway.stackloop.Jvm;

public class SunJvm extends Jvm {

	@Override
	public void writePNG(Image img, File outFile) throws IOException {
		ImageIO.write((BufferedImage)img, "png", outFile);
	}

	@Override
	public Image getOffscreenImage(Component c) {
		return new BufferedImage(c.getWidth(), c.getHeight(), BufferedImage.TYPE_INT_ARGB);
	}

}
