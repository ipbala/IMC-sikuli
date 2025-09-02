package com.imc.utils;

import org.sikuli.script.*;
import org.testng.annotations.Test;


public class genric {

    public boolean robustClick(Screen screen, String imagePath, int maxRetries, int baseWaitMillis){

    int attempts = 0;
    while (attempts < maxRetries) {
        try {
            screen.click(imagePath);
            return true;
            // Click succeeded
        } catch (FindFailed e) {
            attempts++;
            if (attempts >= maxRetries) {
                System.out.println("Image not found after " + maxRetries + " attempts.");
                break;
            }
            // Exponential backoff
            int waitMillis = baseWaitMillis * (int) Math.pow(2, attempts - 1);
            try {
                Thread.sleep(waitMillis);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
    return false;
    // Click never succeeded
}

public static void avdhighlight(Screen screen, String image) throws FindFailed {

    // Find an element and create a region nearby or around it
    Match base = screen.find(image);
    Region rightRegion = base.right(200);
    // Create a region 200px wide to the right of the f
    rightRegion.highlight(1);
    if (rightRegion.exists(image) != null) {
        rightRegion.highlight(2);
    }
}
public static void  main(String[] args) throws FindFailed {
    ImagePath.setBundlePath("C:\\Users\\bayyappa\\workspace\\Workspace-ocr\\IMC-sikuli\\imc_automation\\src\\main\\resources\\images");
    System.err.println("main method call");
    avdhighlight(new Screen(), "Query.png");

}
}