package com.idway.stackloop;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Vector;
import  java.awt.Toolkit;

public class Boot{
	
	long countTime=0;
	private FontMetrics fontMetrics;
	Font f1 = new Font("DV-OTSitaraLight" , Font.PLAIN , 20);
	Frame f;
	Graphics2D g;
	int yAxix=0;
	public Boot() {
		f = new Frame();
		f.setBounds(0, 0, 1280, 720);
		f.setVisible(true);
		f.setBackground(Color.BLACK);
		f.setLayout(null);
		g = (Graphics2D) f.getGraphics();
	}
	public void disp() {	
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		g.setColor(new Color(255,255,255,140));
		g.setFont(f1);
		String ArrHindi[]= {
				"à¤•à¤¶à¥�à¤®à¥€à¤°à¥€ à¤¦à¤® à¤†à¤²à¥‚",
				"Harpal Singh Sokhi",
				"à¤­à¤¾à¤°à¤¤ à¤•à¥‡ à¤®à¤¶à¤¹à¥‚à¤° à¤¶à¥‡à¥ž",
				"Ingredients",
					"4 à¤²à¥‹à¤—à¥‹ à¤•à¥‡ à¤²à¤¿à¤� ",
					"20 à¤›à¥‹à¤Ÿà¥‡ à¤†à¤²à¥‚, à¤›à¤¿à¤²à¥‡ à¤¹à¥�à¤�",
					"2 1/4 à¤›à¥‹à¤Ÿà¥‡ à¤šà¤®à¥�à¤®à¤š à¤¨à¤®à¤•",
					"1 à¤•à¥�à¤µà¤¾à¤°à¥�à¤Ÿ (800 à¤®à¤¿.à¤²à¥€.) à¤µà¤¨à¤¸à¥�à¤ªà¤¤à¤¿ à¤¤à¥‡à¤²",
					"5 à¤•à¤¶à¥�à¤®à¥€à¤°à¥€ à¤²à¤¾à¤² à¤®à¤¿à¤°à¥�à¤š, à¤ªà¤¿à¤¸à¥€ à¤¹à¥�à¤ˆ",
					"2 à¤•à¤ª à¤¦à¤¹à¥€",
					"1/2 à¤›à¥‹à¤Ÿà¤¾ à¤šà¤®à¥�à¤®à¤š à¤›à¥‹à¤Ÿà¥€ à¤‡à¤²à¤¾à¤¯à¤šà¥€ à¤ªà¤¾à¤‰à¤¡à¤°",
					"1 à¤›à¥‹à¤Ÿà¤¾ à¤šà¤®à¥�à¤®à¤š à¤¸à¥Œà¤‚à¤ ",
					"2 à¤¬à¥œà¥‡ à¤šà¤®à¥�à¤®à¤š à¤¸à¥Œà¤‚à¤« à¤ªà¤¾à¤‰à¤¡à¤°",
					"1/4 à¤•à¤ª à¤›à¤¨à¤¾ à¤¹à¥�à¤† à¤¸à¤°à¤¸à¥‹à¤‚ à¤•à¤¾ à¤¤à¥‡à¤²",
					"à¤�à¤• à¤¬à¥œà¥€ à¤šà¥�à¤Ÿà¤•à¥€ à¤²à¥Œà¤‚à¤— à¤ªà¤¾à¤‰à¤¡à¤°",
					"à¤�à¤• à¤šà¥�à¤Ÿà¤•à¥€ à¤¹à¥€à¤‚à¤—",
					"1/2 à¤›à¥‹à¤Ÿà¤¾ à¤šà¤®à¥�à¤®à¤š à¤­à¥�à¤¨à¤¾ à¤¹à¥�à¤† à¤œà¥€à¤°à¤¾ à¤ªà¤¾à¤‰à¤¡à¤°",
					"1/2 à¤›à¥‹à¤Ÿà¤¾ à¤šà¤®à¥�à¤®à¤š à¤—à¤°à¤® à¤®à¤¸à¤¾à¤²à¤¾ à¤ªà¤¾à¤‰à¤¡à¤°",
				"Ingredients",
				"Method",
					"à¤†à¤²à¥�à¤“à¤‚ à¤•à¥‹ à¤šà¤²à¤¤à¥‡ à¤¹à¥�à¤� à¤ªà¤¾à¤¨à¥€ à¤®à¥‡à¤‚ à¤…à¤šà¥�à¤›à¥‡ à¤¸à¥‡ à¤°à¤—à¥œ à¤²à¥‡à¤‚à¥¤ à¤«à¤¿à¤° à¤‰à¤¨à¥�à¤¹à¥‡à¤‚ à¤šà¤¾à¤°à¥‹à¤‚ à¤“à¤° à¤¸à¥‡ à¤�à¤• à¤•à¤¾à¤�à¤Ÿà¥‡ à¤¸à¥‡ à¤—à¥‹à¤‚à¤¦ à¤¦à¥‡à¤‚à¥¤",
					"à¤…à¤¬ à¤�à¤• à¤—à¤¹à¤°à¥‡ à¤•à¤Ÿà¥‹à¤°à¥‡ à¤®à¥‡à¤‚ à¤¦à¥‹ à¤•à¤ª (400 à¤®à¤¿.à¤²à¥€.) à¤ªà¤¾à¤¨à¥€ à¤¡à¤¾à¤²à¤•à¤° à¤‰à¤¸à¤®à¥‡à¤‚ à¤�à¤• à¤›à¥‹à¤Ÿà¤¾ à¤šà¤®à¥�à¤®à¤š à¤¨à¤®à¤• à¤®à¤¿à¤²à¤¾ à¤¦à¥‡à¤‚à¥¤ à¤«à¤¿à¤° à¤‰à¤¸à¤®à¥‡à¤‚ à¤†à¤²à¥�à¤“à¤‚ à¤•à¥‹ à¤ªà¤‚à¤¦à¥�à¤°à¤¹ à¤®à¤¿à¤¨à¤Ÿ à¤•à¥‡ à¤²à¤¿à¤� à¤­à¤¿à¤—à¥‹ à¤¦à¥‡à¤‚à¥¤ à¤«à¤¿à¤° à¤‰à¤¸à¥‡ à¤¨à¤¿à¤•à¤¾à¤²à¤•à¤° à¤¸à¥�à¤–à¤¾ à¤²à¥‡à¤‚à¥¤",
					"à¤…à¤¬ à¤�à¤• à¤ªà¥…à¤¨ à¤•à¥‹ à¤¤à¥‡à¤œ à¤†à¤�à¤š à¤ªà¤° à¤°à¤–à¥‡à¤‚ à¤”à¤° à¤‰à¤¸à¤®à¥‡à¤‚ à¤¤à¥‡à¤² à¤¡à¤¾à¤² à¤¦à¥‡à¤‚à¥¤ à¤œà¤¬ à¤ªà¥…à¤¨ à¤•à¥€ à¤¤à¤²à¥€ à¤ªà¤° à¤›à¥‹à¤Ÿà¥‡-à¤›à¥‹à¤Ÿà¥‡ à¤¬à¥�à¤²à¤¬à¥�à¤²à¥‡ à¤¦à¤¿à¤–à¤¾à¤ˆ à¤¦à¥‡à¤¨à¥‡ à¤²à¤—à¥‡à¤‚, à¤¤à¤¬ à¤†à¤�à¤š à¤•à¥‹ à¤®à¤§à¥�à¤¯à¤® à¤•à¤° à¤¦à¥‡à¤‚ à¤”à¤° à¤‰à¤¸à¤®à¥‡à¤‚ à¤†à¤²à¥‚ à¤¡à¤¾à¤²à¤•à¤° à¤‰à¤¸à¥‡ à¤¦à¤¸ à¤®à¤¿à¤¨à¤Ÿ à¤¯à¤¾ à¤†à¤²à¥‚ à¤•à¥‡ à¤¸à¥�à¤¨à¤¹à¤°à¤¾ à¤­à¥‚à¤°à¤¾ à¤¹à¥‹à¤¨à¥‡ à¤¤à¤• à¤ªà¤•à¤¾à¤�à¤�à¥¤",
					"à¤…à¤¬ à¤†à¤²à¥‚ à¤•à¥‹ à¤�à¤‚à¤�à¤°à¥€ (à¤�à¤¾à¤°à¥€) à¤¸à¥‡ à¤�à¤• à¤¸à¥‹à¤–à¤¨à¥‡ à¤µà¤¾à¤²à¥‡ à¤ªà¥‡à¤ªà¤° à¤ªà¤° à¤¨à¤¿à¤•à¤¾à¤² à¤²à¥‡à¤‚ à¤”à¤° à¤«à¤¿à¤° à¤‰à¤¸à¥‡ à¤…à¤²à¤— à¤°à¤– à¤¦à¥‡à¤‚à¥¤ à¤…à¤¬ à¤•à¤¶à¥�à¤®à¥€à¤°à¥€ à¤²à¤¾à¤² à¤®à¤¿à¤°à¥�à¤š à¤•à¥‹ à¤†à¤§à¤¾ à¤•à¤ª (100 à¤®à¤¿.à¤²à¥€.) à¤ªà¤¾à¤¨à¥€ à¤®à¥‡à¤‚ 15 à¤®à¤¿à¤¨à¤Ÿ à¤•à¥‡ à¤²à¤¿à¤� à¤­à¤¿à¤—à¥‹ à¤¦à¥‡à¤‚à¥¤ à¤«à¤¿à¤° à¤‰à¤¸à¥‡ à¤¨à¤¿à¤•à¤¾à¤²à¤•à¤° à¤�à¤• à¤®à¤¿à¤•à¥�à¤¸à¥€ à¤®à¥‡à¤‚ à¤¡à¤¾à¤² à¤¦à¥‡à¤‚ à¤”à¤° à¤‰à¤¸à¥‡ à¤¦à¥‹ à¤¬à¥œà¥‡ à¤šà¤®à¥�à¤®à¤š (30 à¤®à¤¿.à¤²à¥€.) à¤ªà¤¾à¤¨à¥€ à¤•à¥‡ à¤¸à¤¾à¤¥ à¤ªà¥€à¤¸à¤•à¤° à¤¬à¤¾à¤°à¥€à¤• à¤ªà¥‡à¤¸à¥�à¤Ÿ à¤¤à¥ˆà¤¯à¤¾à¤° à¤•à¤° à¤²à¥‡à¤‚à¥¤",
					"à¤�à¤• à¤•à¤Ÿà¥‹à¤°à¥‡ à¤®à¥‡à¤‚ à¤¦à¤¹à¥€ à¤²à¥‡ à¤²à¥‡à¤‚, à¤«à¤¿à¤° à¤‰à¤¸à¤®à¥‡à¤‚ à¤•à¤¶à¥�à¤®à¥€à¤°à¥€ à¤²à¤¾à¤² à¤®à¤¿à¤°à¥�à¤š à¤•à¤¾ à¤ªà¥‡à¤¸à¥�à¤Ÿ, à¤›à¥‹à¤Ÿà¥€ à¤‡à¤²à¤¾à¤¯à¤šà¥€ à¤ªà¤¾à¤‰à¤¡à¤°, à¤¸à¥Œà¤‚à¤  à¤”à¤° à¤¸à¥Œà¤‚à¤« à¤ªà¤¾à¤‰à¤¡à¤° à¤¡à¤¾à¤²à¤•à¤° à¤‰à¤¸à¥‡ à¤…à¤šà¥�à¤›à¥‡ à¤¸à¥‡ à¤«à¥‡à¤‚à¤Ÿ à¤²à¥‡à¤‚à¥¤",
					"à¤…à¤¬ à¤�à¤• à¤—à¤¹à¤°à¥‡ à¤¨à¥‰à¤¨ à¤¸à¥�à¤Ÿà¤¿à¤• à¤ªà¥…à¤¨ à¤•à¥‹ à¤®à¤§à¥�à¤¯à¤® à¤†à¤�à¤š à¤ªà¤° à¤°à¤–à¥‡à¤‚ à¤”à¤° à¤‰à¤¸à¤®à¥‡à¤‚ à¤¸à¤°à¤¸à¥‹à¤‚ à¤•à¤¾ à¤¤à¥‡à¤² à¤¡à¤¾à¤² à¤¦à¥‡à¤‚à¥¤ à¤«à¤¿à¤° à¤‰à¤¸à¤®à¥‡à¤‚ à¤²à¥Œà¤‚à¤— à¤ªà¤¾à¤‰à¤¡à¤° à¤”à¤° à¤¹à¥€à¤‚à¤— à¤¡à¤¾à¤² à¤¦à¥‡à¤‚à¥¤ à¤…à¤¬ à¤‰à¤¸à¤®à¥‡à¤‚ à¤†à¤§à¤¾ à¤•à¤ª (100 à¤®à¤¿.à¤²à¥€.) à¤ªà¤¾à¤¨à¥€ à¤µ à¤¬à¤šà¤¾ à¤¹à¥�à¤† à¤¨à¤®à¤• à¤¡à¤¾à¤²à¤•à¤° à¤®à¤¿à¤¶à¥�à¤°à¤£ à¤•à¥‹ à¤‰à¤¬à¤¾à¤² à¤²à¥‡à¤‚à¥¤",
					"à¤…à¤¬ à¤‰à¤¸à¤®à¥‡à¤‚ à¤¦à¤¹à¥€ à¤•à¤¾ à¤®à¤¿à¤¶à¥�à¤°à¤£ à¤®à¤¿à¤²à¤¾à¤•à¤° à¤‰à¤¸à¥‡ à¤¦à¥‹à¤¬à¤¾à¤°à¤¾ à¤‰à¤¬à¤¾à¤² à¤²à¥‡à¤‚à¥¤ à¤«à¤¿à¤° à¤‰à¤¸à¤®à¥‡à¤‚ à¤¤à¤²à¥‡ à¤¹à¥�à¤� à¤†à¤²à¥‚ à¤¡à¤¾à¤²à¥‡à¤‚ à¤”à¤° à¤‰à¤¸à¥‡ 12 à¤®à¤¿à¤¨à¤Ÿ à¤¯à¤¾ à¤†à¤²à¥‚ à¤•à¥‡ à¤—à¥�à¤°à¥‡à¤µà¥€ à¤®à¥‡à¤‚ à¤…à¤šà¥�à¤›à¥‡ à¤¸à¥‡ à¤®à¤¿à¤²à¤¨à¥‡ à¤”à¤° à¤¤à¥‡à¤² à¤•à¥‡ à¤Šà¤ªà¤° à¤†à¤¨à¥‡ à¤¤à¤• à¤ªà¤•à¤¾à¤�à¤�à¥¤",
					"à¤…à¤¬ à¤‰à¤¸à¥‡ à¤­à¥�à¤¨à¥‡ à¤¹à¥�à¤� à¤œà¥€à¤°à¤¾ à¤ªà¤¾à¤‰à¤¡à¤° à¤”à¤° à¤—à¤°à¤® à¤®à¤¸à¤¾à¤²à¤¾ à¤ªà¤¾à¤‰à¤¡à¤° à¤¸à¥‡ à¤¸à¤œà¤¾à¤•à¤° à¤—à¤°à¤®à¤¾ à¤—à¤°à¤® à¤ªà¥‡à¤¶ à¤•à¤°à¥‡à¤‚à¥¤",
					"à¤¨à¥�à¤¸à¥�à¤–à¤¾ : à¤†à¤²à¥‚ à¤•à¥‹ à¤—à¥‹à¤‚à¤¦à¤•à¤° à¤¤à¤²à¤¨à¥‡ à¤•à¥‡ à¤¬à¤¾à¤¦ à¤µà¥‡ à¤•à¤¾à¤«à¥€ à¤¹à¤²à¥�à¤•à¥‡ à¤¹à¥‹ à¤œà¤¾à¤¤à¥‡ à¤¹à¥ˆà¥¤ à¤…à¤—à¤° à¤µà¥‡ à¤¹à¤²à¥�à¤•à¥‡ à¤¨ à¤¹à¥‹, à¤‡à¤¸à¤•à¤¾ à¤®à¤¤à¤²à¤¬ à¤¹à¥ˆ à¤•à¤¿ à¤†à¤²à¥‚ à¤®à¥‡à¤‚ à¤¸à¤¹à¥€ à¤¤à¤°à¥€à¤•à¥‡ à¤¸à¥‡ à¤—à¥‹à¤‚à¤¦à¤¾ à¤¨à¤¹à¥€à¤‚ à¤—à¤¯à¤¾ à¤¹à¥ˆà¥¤",
					"à¤‡à¤¸à¥€à¤²à¤¿à¤� à¤�à¤• à¤¬à¤¾à¤° à¤�à¤• à¤†à¤²à¥‚ à¤•à¥‹ à¤¤à¤²à¤•à¤° à¤¦à¥‡à¤– à¤²à¥‡à¤¨à¤¾ à¤šà¤¾à¤¹à¤¿à¤�à¥¤ à¤†à¤²à¥‚ à¤•à¤¾ à¤†à¤•à¤¾à¤° à¤­à¥€ à¤‡à¤¸ à¤°à¥‡à¤¸à¤¿à¤ªà¥€ à¤®à¥‡à¤‚ à¤•à¤¾à¤«à¥€ à¤®à¤¹à¤¤à¥�à¤µà¤ªà¥‚à¤°à¥�à¤£ à¤¹à¥ˆà¥¤ à¤†à¤²à¥‚ à¤•à¤¾ à¤†à¤•à¤¾à¤° à¤›à¥‹à¤Ÿà¤¾ à¤¹à¥‹à¤¨à¤¾ à¤šà¤¾à¤¹à¤¿à¤�, à¤²à¥‡à¤•à¤¿à¤¨ à¤¬à¤¹à¥�à¤¤ à¤›à¥‹à¤Ÿà¤¾ à¤¨à¤¹à¥€à¤‚à¥¤",	
		};
		
		String ArrEnglish[]= {"Kashmiri Dum Aloo",
							"Harpal Singh Sokhi",
							"Renowned Chef of India",
							"Makes 4 servings:",
							"20 small potatoes, peeled",
							"2 1/4 tsp table salt",
							"1 quart vegetable oil",
							
							"5 Kashmiri red chillies, ground",
							"2 cups plain yogurt",
							"1/2 tsp green cardamom powder",
							"1 tsp dried ginger powder (soonth)",
							"2 tbsp fennel (saunf) powder",
							"1/4 cup filtered mustard oil",
							"A generous pinch of clove powder",
							"A pinch of asafoetida",
							"1/2 tsp roasted cumin powder",
							"1/2 tsp garam masala powder",
							"Ingredients",
							"Method",
							"Scrub the potatoes well under running water. Prick them all over with a fork",
							"Add 1 tsp salt to 2 cups (400 ml) water in a deep bowl and keep the potatoes soaked in this for 15 minutes. Drain and wipe dry",
							"Keep a wok on high heat and pour in the oil. When small bubbles appear at the bottom of the pan, reduce heat to medium, add the potatoes and cook for 10 minutes or until the potatoes are golden brown.",
							"Drain with a slotted spoon and place them on an absorbent paper and set aside. Soak the Kashmiri red chillies in 1/2 cup (100 ml) water for 15 minutes. Drain and place them in a blender jar and blend to a fine paste with 2 tbsp (30 ml) water.",
							"Place the yogurt in a bowl, add the Kashmiri red chilli paste, green cardamom powder, dried ginger powder and fennel powder and whisk till well blended.",
							"Place a deep non stick pan on medium heat and pour in the mustard oil in a pan. Add the clove powder and asafoetida. Add 1/2 cup (100 ml) water and the remaining salt and bring the mixture to a boil.",
							"Stir in the yogurt mixture and bring the mixture to a boil again. Add the browned potatoes and cook for 12 minutes or till the potatoes absorb the gravy and the oil surfaces.",
							" Garnish with roasted cumin powder and garam masala powder and serve hot.",
							"Chef's tip: The process of pricking the potatoes makes them very light when fried. If they are not light, it means the pricking has not been proper or sufficient.",
							"Therefore it is a good idea to fry one potato and check. The size of the potato is also important, it should be of small size but should not be very small."		
					};
		long t1=System.currentTimeMillis();
		
		for(int i=0;i<ArrEnglish.length;i++) {
			wrapText(ArrEnglish[i], 200);
		}
//				g.drawString(Arrays.toString(wrapText(ArrEnglish[i], 200)).replace('[', ' ').replace(']',' '), 20,20 + i*20);
//		}
		long t2=System.currentTimeMillis();
		System.out.println("\t\tRendering Time for English is ="+(t2-t1));
//		int i=0;
//		long t3=System.currentTimeMillis();
//		for(int j=0;j<ArrHindi.length;j++) {
//			wrapText(ArrHindi[j], 200);
//			//g.drawString(Arrays.toString(wrapText(ArrHindi[j], 200)).replace('[', ' ').replace(']',' '), 20,20 + i*20);
//			
//		}
//		long t4=System.currentTimeMillis();
//		System.out.println("\t\tRendering Time for Hindi is ="+(t4-t3));	
	}
	public int  charWidth(char ch) {
		if (fontMetrics == null) {	
			fontMetrics = Toolkit.getDefaultToolkit().getFontMetrics(f1);
		}
		return fontMetrics.charWidth(ch);
	}
	public int  stringWidth(String str) {
		if (fontMetrics == null) {
			fontMetrics = Toolkit.getDefaultToolkit().getFontMetrics(f1);
		}
		int stringWidth = fontMetrics.stringWidth(str);
		return stringWidth;
	}
	public  String [] wrapText (String text,int len){
		int SCREEN=0,TXT_REC_LIST=1,CACHK=2,TUNEBACK=3,FULLSCREEN=4,CAPOPUP=5,HELP=6,VIDEOREC=7,TIPS=8,TXTREC=9,CONTEST=10,UGC=11,PROMO=12,VIDREC_LOADING=13;
		if (text == null)  return new String [] {};
		if (len <= 0)  return new String [] {text};  
		char [] chars = text.toCharArray();  
		Vector lines = new Vector();  
		StringBuffer line = new StringBuffer();  
		StringBuffer word = new StringBuffer();
		int wordLength = 0;
		int lineLength = 0;
		try{
			for (int i = 0; ; i++) {
				if(chars[i]!= '#' ||chars[i]==' '){
					word.append(chars[i]);
					wordLength += charWidth(chars[i]);
				}
				if (chars[i] == ' ' || chars[i] == ','  ||chars[i] == '#') {  
					if ( ((lineLength + wordLength) > len) ||chars[i] == '#') {
						if(lineLength>0){
							lines.addElement(line.toString());
							line.delete(0, line.length()); 
							lineLength = 0;
						}
					}   
					line.append(word.toString());  
					lineLength += wordLength;
					word.delete(0, word.length());
					wordLength = 0;
				}  
			}
		}catch(Exception e){}
		if (word.length() > 0) {    
			if (stringWidth((line.toString() + word.toString())) > len) {
				if(line.toString().length()>0){
					lines.addElement(line.toString());  
					line.delete(0, line.length()); 
				}
			}    System.out.println();
			line.append(word.toString());  
		}  
		if (line.length() > 0) {    
			lines.addElement(line.toString());  
		}  
		String [] ret = new String[lines.size()];  
		int c = 0; 
		for (Enumeration e = lines.elements(); 
		e.hasMoreElements(); c++) {    
			ret[c] = (String) e.nextElement(); 
			g.drawString(ret[c],30,10*yAxix+20);
			yAxix+=2;
			//System.out.println(ret[c]);
		}  
		long t2=System.currentTimeMillis();
		
		return ret;
	}

    public static void main(String[] args) throws Exception {
    
    	Boot ob = new Boot();
    	ob.disp();
    }
}
    
