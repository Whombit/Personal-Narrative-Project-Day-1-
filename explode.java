// Omitted import statements for brevity

public class explode extends Image {
    // Field to store the newRed value
    private Pixel[][] imagePixels;
    private int newRed;

    // Constructor
    public explode(String imageFile) {
        super(imageFile);
        imagePixels = getPixelsFromImage();
    }

    // Getters
    public Pixel[][] getImagePixels() {
        return imagePixels;
    }

    // Method to get pixels from the image
    public Pixel[][] getPixelsFromImage() {
        Pixel[][] tempPixels = new Pixel[getHeight()][getWidth()];

        for (int row = 0; row < tempPixels.length; row++) {
            for (int col = 0; col < tempPixels[0].length; col++) {
                tempPixels[row][col] = getPixel(col, row);
            }
        }

        return tempPixels;
    }

    // Method to brighten the red pixels
    public void brightenRed(int amount) {
        if (imagePixels == null || imagePixels.length == 0 || imagePixels[0].length == 0) {
            System.out.println("No image data available.");
            return;
        }

        for (int row = 0; row < imagePixels.length; row++) {
            for (int col = 0; col < imagePixels[0].length; col++) {
                Pixel currentPixel = imagePixels[row][col];

                // Update newRed field
                newRed = currentPixel.getRed() + amount;
                newRed = Math.min(Math.max(newRed, 0), 255);

                currentPixel.setRed(newRed);              
            }
        }
    }
    
    // Override toString method to return newRed value
    @Override
    public String toString() {
        return "New red value: " + newRed;
    }
}
