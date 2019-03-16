package demo.grpc.server;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;

/**
 * Grpc Server class
 * @author Babu Thirumalai
 * @version 1.0
 * @since 03-12-2019
 */
public class GrpcServer {
	public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(50051)
          .addService(new DateTimeServiceImpl()).build();
        server.start();
        System.out.println("GRPC Java based Server started!");
        server.awaitTermination();
    }
}
