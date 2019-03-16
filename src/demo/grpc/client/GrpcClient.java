package demo.grpc.client;


import demo.grpc.DateTimeGrpc;
import demo.grpc.DateTimeMsg;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

/**
 * Typical Grpc client program
 * @author Babu Thirumalai
 * @version 1.0
 * @since 03-12-2019
 */
public class GrpcClient {

	public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
          .usePlaintext()
          .build();
 
        DateTimeGrpc.DateTimeBlockingStub stub 
          = DateTimeGrpc.newBlockingStub(channel);
 
        DateTimeMsg response = stub.getCurrentDateTime(DateTimeMsg.newBuilder()         
          .build());
        
        System.out.println(response.getValue());
 
        channel.shutdown();
    }
}
