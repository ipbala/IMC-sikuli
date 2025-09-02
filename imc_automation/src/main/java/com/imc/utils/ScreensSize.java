package com.imc.utils;

import java.awt.GraphicsEnvironment;
import java.util.ArrayList;

import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.Rectangle;
public class ScreensSize  {
    public  ArrayList<String>  getScreenSizes() {
        // Get the default Toolkit
                
    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
    GraphicsDevice[] screenDevices = ge.getScreenDevices();
    ArrayList<String> screenSizes = new ArrayList<>();
    for (GraphicsDevice gd : screenDevices) {
        GraphicsConfiguration gc = gd.getDefaultConfiguration(); // Or iterate through all configurations
        Rectangle bounds = gc.getBounds();
        int x = bounds.x;
        int y = bounds.y;
        int width = bounds.width;
        int height = bounds.height;
        screenSizes.add("Screen: " + gd.getIDstring() + " - X: " + x + ", Y: " + y + ", Width: " + width + ", Height: " + height);
        System.out.println("Screen: " + gd.getIDstring() + " - X: " + x + ", Y: " + y + ", Width: " + width + ", Height: " + height);
        
    }
    return screenSizes;

    }
}
