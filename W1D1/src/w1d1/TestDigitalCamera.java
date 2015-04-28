/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1d1;

import java.util.Scanner;

/**
 *
 * @author Tosha
 */
public class TestDigitalCamera {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String brand = null;
        int megapixels = 0;
        DigitalCamera[] cameras = new DigitalCamera[4];

        for (int i = 0; i < 4; i++) {
            System.out.print("Please enter brand for camera " + (i + 1) + ": ");
            brand = in.next();
            System.out.print("Please enter number of megapixels for camera " + (i + 1) + ": ");
            megapixels = Integer.parseInt(in.next());
            cameras[i] = new DigitalCamera(brand, megapixels);
        }
        System.out.println("");
        
        for (DigitalCamera camera : cameras) {
            System.out.println(camera.getDetails());
        }
    }

}

/*Output:
run:
Please enter brand for camera 1: Panasonic
Please enter number of megapixels for camera 1: 7
Please enter brand for camera 2: Polaroid
Please enter number of megapixels for camera 2: 2
Please enter brand for camera 3: Samsung
Please enter number of megapixels for camera 3: 12
Please enter brand for camera 4: Nikon
Please enter number of megapixels for camera 4: 8

Brand: Panasonic Megapixels: 7 Price: 129
Brand: Polaroid Megapixels: 2 Price: 99
Brand: Samsung Megapixels: 10 Price: 129
Brand: Nikon Megapixels: 8 Price: 129
BUILD SUCCESSFUL (total time: 1 minute 16 seconds)
*/