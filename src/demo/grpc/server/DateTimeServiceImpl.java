package demo.grpc.server;

import java.text.SimpleDateFormat;
import java.util.Date;

import demo.grpc.DateTimeGrpc.DateTimeImplBase;
import demo.grpc.DateTimeMsg;
import io.grpc.stub.StreamObserver;

/**
 * The DateTimeServiceImpl program extends DateTimeImplBase from an application that
 * simply return String -> current dateTime as the standard output.
 *
 * @author Babu Thirumalai
 * @version 1.0
 * @since 03-12-2019
 */
public class DateTimeServiceImpl extends DateTimeImplBase {

	@Override
	public void getCurrentDateTime(DateTimeMsg request, StreamObserver<DateTimeMsg> responseObserver) {
		System.out.println("DateTime Request received from client:\n" + request);
		String pattern = "EEEEE MMMMM yyyy HH:mm:ss";
		DateTimeMsg dateTime = DateTimeMsg.newBuilder()
								.setValue(new SimpleDateFormat(pattern).format(new Date()))
								.build();
		responseObserver.onNext(dateTime);
		responseObserver.onCompleted();
	}

}
