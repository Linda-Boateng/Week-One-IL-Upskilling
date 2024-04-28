package JavaConcurrencyMultithreading.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ImageProcessing {
    public static void main(String[] args) {
        try (ExecutorService executor = Executors.newFixedThreadPool(3)) {

            String[] imageFiles = { "image1.jpg", "image2.jpg", "image3.jpg", "image4.jpg", "image5.jpg" };

            for (String imageFile : imageFiles) {
                ImageProcessingTask task = new ImageProcessingTask(imageFile);
                executor.submit(task);
            }

            executor.shutdown();
        }
    }
}

class ImageProcessingTask implements Runnable {

    private final String imageFile;

    public ImageProcessingTask(String imageFile) {
        this.imageFile = imageFile;
    }

    @Override
    public void run() {
        // Simulating image processing
        System.out.println("Processing image: " + imageFile);

        System.out.println("Image processing completed: " + imageFile);
    }
}
