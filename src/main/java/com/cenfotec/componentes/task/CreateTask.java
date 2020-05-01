package com.cenfotec.componentes.task;

import com.google.cloud.tasks.v2.*;
import com.google.protobuf.ByteString;

import java.io.IOException;
import java.nio.charset.Charset;

public class CreateTask {
    // Instantiates a client.
    public void createTask() throws IOException {
        try (CloudTasksClient client = CloudTasksClient.create()) {

            // Variables provided by the CLI.
            String projectId = "proyectocomponentes-9f935";
            String queueName = "COLA";
            String location = "us-central1";
            String payload = "hello";

            // Construct the fully qualified queue name.
            String queuePath = QueueName.of(projectId, location, queueName).toString();

            // Construct the task body.
            Task.Builder taskBuilder =
                    Task.newBuilder()
                            .setAppEngineHttpRequest(
                                    AppEngineHttpRequest.newBuilder()
                                            .setBody(ByteString.copyFrom(payload, Charset.defaultCharset()))
                                            .setRelativeUri("/tasks/create")
                                            .setHttpMethod(HttpMethod.POST)
                                            .build());

            /*
            if (params.hasOption(IN_SECONDS_OPTION.getOpt())) {
                // Add the scheduled time to the request.
                int seconds = Integer.parseInt(params.getOptionValue(IN_SECONDS_OPTION.getOpt()));
                taskBuilder.setScheduleTime(
                        Timestamp.newBuilder()
                                .setSeconds(Instant.now(Clock.systemUTC()).plusSeconds(seconds).getEpochSecond()));
            }
             */

            // Send create task request.
            Task task = client.createTask(queuePath, taskBuilder.build());
            System.out.println("Task created: " + task.getName());
        }
    }
}