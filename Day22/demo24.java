package Day22;
//Weather Monitoring System

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

// Class representing a weather sensor
class WeatherSensor implements Runnable {
    private String sensorName; // Name of the sensor
    private boolean running = true; // Control flag for the sensor

    public WeatherSensor(String sensorName) {
        this.sensorName = sensorName; // Initialize sensor name
    }

    @Override
    public void run() {
        // Simulate data collection
        while (running) {
            double temperature = Math.random() * 100; // Simulated temperature
            double humidity = Math.random() * 100; // Simulated humidity
            System.out.printf("%s - Temperature: %.2f°C, Humidity: %.2f%%%n", sensorName, temperature, humidity);
            try {
                Thread.sleep(2000); // Wait for 2 seconds before collecting data again
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Restore interrupted status
                running = false; // Stop the sensor if interrupted
            }
        }
    }

    public void stop() {
        running = false; // Method to stop the sensor
    }
}

// Class to process the data collected from sensors
class DataProcessor implements Runnable {
    private String processorName; // Name of the processor

    public DataProcessor(String processorName) {
        this.processorName = processorName; // Initialize processor name
    }

    @Override
    public void run() {
        // Simulate data processing
        while (true) {
            System.out.printf("%s is processing data...%n", processorName);
            try {
                Thread.sleep(5000); // Wait for 5 seconds before processing again
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Restore interrupted status
                break; // Exit loop if interrupted
            }
        }
    }
}

// Main class to execute the Weather Monitoring System
public class demo24 {
    public static void main(String[] args) {
        // Create a thread pool for sensors
        ExecutorService sensorExecutor = Executors.newFixedThreadPool(3);
        
        // Create and start multiple weather sensors
        WeatherSensor sensor1 = new WeatherSensor("Sensor 1");
        WeatherSensor sensor2 = new WeatherSensor("Sensor 2");
        WeatherSensor sensor3 = new WeatherSensor("Sensor 3");

        sensorExecutor.submit(sensor1);
        sensorExecutor.submit(sensor2);
        sensorExecutor.submit(sensor3);

        // Create and start a data processor
        Thread dataProcessor = new Thread(new DataProcessor("Data Processor"));
        dataProcessor.setPriority(Thread.MIN_PRIORITY); // Set low priority for the data processor
        dataProcessor.start();

        // Add a shutdown hook to stop the sensors and processor gracefully
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Shutting down the Weather Monitoring System...");
            sensor1.stop(); // Stop sensor 1
            sensor2.stop(); // Stop sensor 2
            sensor3.stop(); // Stop sensor 3
            sensorExecutor.shutdown(); // Shutdown the executor
            try {
                if (!sensorExecutor.awaitTermination(5, TimeUnit.SECONDS)) {
                    sensorExecutor.shutdownNow(); // Force shutdown if not terminated
                }
            } catch (InterruptedException e) {
                sensorExecutor.shutdownNow(); // Force shutdown on interruption
            }
            dataProcessor.interrupt(); // Interrupt the data processor
            System.out.println("Weather Monitoring System shut down successfully.");
        }));

        // Wait for the sensors to finish (optional)
        try {
            Thread.sleep(20000); // Main thread sleeps for 20 seconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore interrupted status
        }

        // Stop the sensors and processor
        sensor1.stop();
        sensor2.stop();
        sensor3.stop();
        dataProcessor.interrupt(); // Interrupt the data processor
        sensorExecutor.shutdown(); // Shutdown the executor
    }
}