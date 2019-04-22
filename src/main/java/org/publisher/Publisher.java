package org.publisher;


import com.microsoft.azure.servicebus.primitives.ServiceBusException;

public interface Publisher {

    void publish(String queueName, String json) throws ServiceBusException, InterruptedException;

    void publishDelayed(String queueName, String json, long delay);

}
