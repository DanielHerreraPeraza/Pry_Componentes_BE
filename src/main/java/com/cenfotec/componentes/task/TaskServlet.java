package com.cenfotec.componentes.task;

import java.io.IOException;
import java.util.logging.Logger;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// [START cloud_tasks_appengine_quickstart]
@WebServlet(
        name = "Tasks",
        description = "Create Cloud Task",
        urlPatterns = "/tasks/create"
)
public class TaskServlet extends HttpServlet {
    private static Logger log = Logger.getLogger(TaskServlet.class.getName());

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        log.info("Received task request: " + req.getServletPath());
        String body = req.getReader()
                .lines()
                .reduce("", (accumulator, actual) -> accumulator + actual);

        if (!body.isEmpty()) {
            log.info("Request payload: " + body);
            String output = String.format("Received task with payload %s", body);
            resp.getOutputStream().write(output.getBytes());
            log.info("Sending response: " + output);
            resp.setStatus(HttpServletResponse.SC_OK);
        } else {
            log.warning("Null payload received in request to " + req.getServletPath());
        }
    }
}
// [END cloud_tasks_appengine_quickstart]