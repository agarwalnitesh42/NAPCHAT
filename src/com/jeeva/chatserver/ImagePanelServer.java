package com.jeeva.chatserver;

/*************************************************************************/
/*************************************************************************/
/*************************************************************************/
/*****************Chat Client Customized Panel****************************/
/*************************************************************************/
/*************************************************************************/
/*************************************************************************/
//package com.jeeva.chatclient;

import java.awt.Panel;
import java.awt.Image;
import java.awt.Graphics;
public class ImagePanelServer extends Panel implements CommonSettings
{
	ImagePanelServer(ChatServer chatserver, Image image)
	{
		setLayout(null);
		Parent = chatserver;		
		DisplayImage = image;
		int XPos = image.getWidth(this);
		int YPos = image.getHeight(this);
//		int XPos=80;
//		int YPos= 10;
		setBounds(-45,60,XPos+TOP_PANEL_START_POS,YPos+TOP_PANEL_START_POS);				
	}
	
	public void paint(Graphics graphics)
	{
		graphics.drawImage(DisplayImage,TOP_PANEL_START_POS,TOP_PANEL_START_POS,this);	
	}
	
	/*************Global Variable Declarations*********/
	ChatServer Parent;		
	Image DisplayImage;
}