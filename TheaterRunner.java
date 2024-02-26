// Omitted import statements for brevity

public class TheaterRunner {
    public static void main(String[] args) {
        // Create a new Scene instance
        Scene scene = new Scene();
        
        // Initialize explode objects
        explode possum = new explode("possumImage");
        Image trash = new Image("trashImage");
        explode explosion = new explode("explosionImage");

        // Add images to the scene
        scene.drawImage(trash, 0, 100, trash.getWidth());
        scene.drawImage(possum, 400, 175, possum.getWidth() - 10);

        // Pause for 1 second
        scene.pause(1);
        
        // Additional drawing actions with pauses
        scene.drawImage(possum, 350, 175, possum.getWidth());
        scene.pause(1);
        scene.drawImage(possum, 300, 175, possum.getWidth() - 10);
        scene.pause(1);
        scene.drawImage(possum, 250, 175, possum.getWidth());
        scene.pause(1);
        scene.drawImage(possum, 200, 175, possum.getWidth() - 10);
        scene.pause(1);
        scene.drawImage(possum, 150, 175, possum.getWidth());

        // Pause for 3 seconds
        scene.pause(3);

        // Brighten red pixels and draw the image
        possum.brightenRed(50);
        scene.drawImage(possum, 150, 175, possum.getWidth());
        scene.pause(1);
        // Print the new red value after brightening
        System.out.println(possum.toString());

        // More brightening and drawing actions
        possum.brightenRed(50);
        scene.drawImage(possum, 150, 175, possum.getWidth());
        scene.pause(1);
        // Print the new red value after brightening
        System.out.println(possum.toString());

        // More brightening and drawing actions
        possum.brightenRed(50);
        scene.drawImage(possum, 150, 175, possum.getWidth());
        scene.pause(1);
        // Print the new red value after brightening
        System.out.println(possum.toString());

        // Draw the explosion image
        scene.drawImage(explosion, 150, 175, possum.getWidth());

        // Play the scenes
        Theater.playScenes(scene);
    }
}
