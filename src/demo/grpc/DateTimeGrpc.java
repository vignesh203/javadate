package demo.grpc;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: dateTime.proto")
public final class DateTimeGrpc {

  private DateTimeGrpc() {}

  public static final String SERVICE_NAME = "demo.grpc.DateTime";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<demo.grpc.DateTimeMsg,
      demo.grpc.DateTimeMsg> METHOD_GET_CURRENT_DATE_TIME =
      io.grpc.MethodDescriptor.<demo.grpc.DateTimeMsg, demo.grpc.DateTimeMsg>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "demo.grpc.DateTime", "getCurrentDateTime"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              demo.grpc.DateTimeMsg.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              demo.grpc.DateTimeMsg.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DateTimeStub newStub(io.grpc.Channel channel) {
    return new DateTimeStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DateTimeBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DateTimeBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DateTimeFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DateTimeFutureStub(channel);
  }

  /**
   */
  public static abstract class DateTimeImplBase implements io.grpc.BindableService {

    /**
     */
    public void getCurrentDateTime(demo.grpc.DateTimeMsg request,
        io.grpc.stub.StreamObserver<demo.grpc.DateTimeMsg> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_CURRENT_DATE_TIME, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_CURRENT_DATE_TIME,
            asyncUnaryCall(
              new MethodHandlers<
                demo.grpc.DateTimeMsg,
                demo.grpc.DateTimeMsg>(
                  this, METHODID_GET_CURRENT_DATE_TIME)))
          .build();
    }
  }

  /**
   */
  public static final class DateTimeStub extends io.grpc.stub.AbstractStub<DateTimeStub> {
    private DateTimeStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DateTimeStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DateTimeStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DateTimeStub(channel, callOptions);
    }

    /**
     */
    public void getCurrentDateTime(demo.grpc.DateTimeMsg request,
        io.grpc.stub.StreamObserver<demo.grpc.DateTimeMsg> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_CURRENT_DATE_TIME, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DateTimeBlockingStub extends io.grpc.stub.AbstractStub<DateTimeBlockingStub> {
    private DateTimeBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DateTimeBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DateTimeBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DateTimeBlockingStub(channel, callOptions);
    }

    /**
     */
    public demo.grpc.DateTimeMsg getCurrentDateTime(demo.grpc.DateTimeMsg request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_CURRENT_DATE_TIME, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DateTimeFutureStub extends io.grpc.stub.AbstractStub<DateTimeFutureStub> {
    private DateTimeFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DateTimeFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DateTimeFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DateTimeFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<demo.grpc.DateTimeMsg> getCurrentDateTime(
        demo.grpc.DateTimeMsg request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_CURRENT_DATE_TIME, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CURRENT_DATE_TIME = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DateTimeImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DateTimeImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CURRENT_DATE_TIME:
          serviceImpl.getCurrentDateTime((demo.grpc.DateTimeMsg) request,
              (io.grpc.stub.StreamObserver<demo.grpc.DateTimeMsg>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class DateTimeDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return demo.grpc.DateTimeOuterClass.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DateTimeGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DateTimeDescriptorSupplier())
              .addMethod(METHOD_GET_CURRENT_DATE_TIME)
              .build();
        }
      }
    }
    return result;
  }
}
