package graphics;

import java.awt.*;

public class PixelsExample {

    public static void main(String[] args) {

        DrawingPanel panel = new DrawingPanel();
        Graphics  g = panel.getGraphics();



        g.fillRect(50,50,10,90);

        while(true) {
            Color[][] pixels = panel.getPixels();
            for (int row = 0; row < pixels.length; row++) {
                Color[] currentRow = pixels[row];

                for (int col = 0; col < currentRow.length; col++) {
                    if (row % 2 == 0 && col % 2 == 0) {
                        currentRow[col] = Color.RED;
                    } else if (row % 2 == 1 && col % 2 == 1) {
                        currentRow[col] = Color.RED;
                    }
                }
                panel.setPixels(pixels);
                //panel.sleep(10);

            }

            panel.sleep(500);
            g.fillRect(0,0,500,500);
            panel.sleep(500);
        }
        /*
        Color[] topRow= pixels[0];
        for(int i = 0 ; i <topRow.length; i++) {
            topRow[i]  = Color.RED;
        }
        panel.sleep(1000);
        panel.setPixels(pixels);
        */
    }
}
