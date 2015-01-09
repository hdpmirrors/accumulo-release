/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/protobuf/replication.proto

package org.apache.accumulo.core.replication.proto;

@SuppressWarnings("all")
public final class Replication {
  private Replication() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {}

  public interface StatusOrBuilder extends com.google.protobuf.MessageOrBuilder {

    // optional int64 begin = 1 [default = 0];
    /**
     * <code>optional int64 begin = 1 [default = 0];</code>
     *
     * <pre>
     * offset where replication should start
     * </pre>
     */
    boolean hasBegin();

    /**
     * <code>optional int64 begin = 1 [default = 0];</code>
     *
     * <pre>
     * offset where replication should start
     * </pre>
     */
    long getBegin();

    // optional int64 end = 2 [default = 0];
    /**
     * <code>optional int64 end = 2 [default = 0];</code>
     *
     * <pre>
     * offset where data is ready for replication
     * </pre>
     */
    boolean hasEnd();

    /**
     * <code>optional int64 end = 2 [default = 0];</code>
     *
     * <pre>
     * offset where data is ready for replication
     * </pre>
     */
    long getEnd();

    // optional bool infiniteEnd = 3 [default = false];
    /**
     * <code>optional bool infiniteEnd = 3 [default = false];</code>
     *
     * <pre>
     * do we have a discrete 'end'
     * </pre>
     */
    boolean hasInfiniteEnd();

    /**
     * <code>optional bool infiniteEnd = 3 [default = false];</code>
     *
     * <pre>
     * do we have a discrete 'end'
     * </pre>
     */
    boolean getInfiniteEnd();

    // optional bool closed = 4 [default = false];
    /**
     * <code>optional bool closed = 4 [default = false];</code>
     *
     * <pre>
     * will more data be appended to the file
     * </pre>
     */
    boolean hasClosed();

    /**
     * <code>optional bool closed = 4 [default = false];</code>
     *
     * <pre>
     * will more data be appended to the file
     * </pre>
     */
    boolean getClosed();

    // optional int64 createdTime = 5 [default = 0];
    /**
     * <code>optional int64 createdTime = 5 [default = 0];</code>
     *
     * <pre>
     * when, in ms, was the file created?
     * </pre>
     */
    boolean hasCreatedTime();

    /**
     * <code>optional int64 createdTime = 5 [default = 0];</code>
     *
     * <pre>
     * when, in ms, was the file created?
     * </pre>
     */
    long getCreatedTime();
  }

  /**
   * Protobuf type {@code Status}
   */
  public static final class Status extends com.google.protobuf.GeneratedMessage implements StatusOrBuilder {
    // Use Status.newBuilder() to construct.
    private Status(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }

    private Status(boolean noInit) {
      this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }

    private static final Status defaultInstance;

    public static Status getDefaultInstance() {
      return defaultInstance;
    }

    public Status getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private Status(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields = com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              begin_ = input.readInt64();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              end_ = input.readInt64();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              infiniteEnd_ = input.readBool();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              closed_ = input.readBool();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              createdTime_ = input.readInt64();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return org.apache.accumulo.core.replication.proto.Replication.internal_static_Status_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
      return org.apache.accumulo.core.replication.proto.Replication.internal_static_Status_fieldAccessorTable.ensureFieldAccessorsInitialized(
          org.apache.accumulo.core.replication.proto.Replication.Status.class, org.apache.accumulo.core.replication.proto.Replication.Status.Builder.class);
    }

    public static com.google.protobuf.Parser<Status> PARSER = new com.google.protobuf.AbstractParser<Status>() {
      public Status parsePartialFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Status(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Status> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional int64 begin = 1 [default = 0];
    public static final int BEGIN_FIELD_NUMBER = 1;
    private long begin_;

    /**
     * <code>optional int64 begin = 1 [default = 0];</code>
     *
     * <pre>
     * offset where replication should start
     * </pre>
     */
    public boolean hasBegin() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }

    /**
     * <code>optional int64 begin = 1 [default = 0];</code>
     *
     * <pre>
     * offset where replication should start
     * </pre>
     */
    public long getBegin() {
      return begin_;
    }

    // optional int64 end = 2 [default = 0];
    public static final int END_FIELD_NUMBER = 2;
    private long end_;

    /**
     * <code>optional int64 end = 2 [default = 0];</code>
     *
     * <pre>
     * offset where data is ready for replication
     * </pre>
     */
    public boolean hasEnd() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }

    /**
     * <code>optional int64 end = 2 [default = 0];</code>
     *
     * <pre>
     * offset where data is ready for replication
     * </pre>
     */
    public long getEnd() {
      return end_;
    }

    // optional bool infiniteEnd = 3 [default = false];
    public static final int INFINITEEND_FIELD_NUMBER = 3;
    private boolean infiniteEnd_;

    /**
     * <code>optional bool infiniteEnd = 3 [default = false];</code>
     *
     * <pre>
     * do we have a discrete 'end'
     * </pre>
     */
    public boolean hasInfiniteEnd() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }

    /**
     * <code>optional bool infiniteEnd = 3 [default = false];</code>
     *
     * <pre>
     * do we have a discrete 'end'
     * </pre>
     */
    public boolean getInfiniteEnd() {
      return infiniteEnd_;
    }

    // optional bool closed = 4 [default = false];
    public static final int CLOSED_FIELD_NUMBER = 4;
    private boolean closed_;

    /**
     * <code>optional bool closed = 4 [default = false];</code>
     *
     * <pre>
     * will more data be appended to the file
     * </pre>
     */
    public boolean hasClosed() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }

    /**
     * <code>optional bool closed = 4 [default = false];</code>
     *
     * <pre>
     * will more data be appended to the file
     * </pre>
     */
    public boolean getClosed() {
      return closed_;
    }

    // optional int64 createdTime = 5 [default = 0];
    public static final int CREATEDTIME_FIELD_NUMBER = 5;
    private long createdTime_;

    /**
     * <code>optional int64 createdTime = 5 [default = 0];</code>
     *
     * <pre>
     * when, in ms, was the file created?
     * </pre>
     */
    public boolean hasCreatedTime() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }

    /**
     * <code>optional int64 createdTime = 5 [default = 0];</code>
     *
     * <pre>
     * when, in ms, was the file created?
     * </pre>
     */
    public long getCreatedTime() {
      return createdTime_;
    }

    private void initFields() {
      begin_ = 0L;
      end_ = 0L;
      infiniteEnd_ = false;
      closed_ = false;
      createdTime_ = 0L;
    }

    private byte memoizedIsInitialized = -1;

    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1)
        return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt64(1, begin_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt64(2, end_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBool(3, infiniteEnd_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBool(4, closed_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt64(5, createdTime_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1)
        return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeInt64Size(1, begin_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeInt64Size(2, end_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, infiniteEnd_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream.computeBoolSize(4, closed_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream.computeInt64Size(5, createdTime_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;

    @java.lang.Override
    protected java.lang.Object writeReplace() throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static org.apache.accumulo.core.replication.proto.Replication.Status parseFrom(com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.accumulo.core.replication.proto.Replication.Status parseFrom(com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.accumulo.core.replication.proto.Replication.Status parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.accumulo.core.replication.proto.Replication.Status parseFrom(byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.accumulo.core.replication.proto.Replication.Status parseFrom(java.io.InputStream input) throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static org.apache.accumulo.core.replication.proto.Replication.Status parseFrom(java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static org.apache.accumulo.core.replication.proto.Replication.Status parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }

    public static org.apache.accumulo.core.replication.proto.Replication.Status parseDelimitedFrom(java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }

    public static org.apache.accumulo.core.replication.proto.Replication.Status parseFrom(com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static org.apache.accumulo.core.replication.proto.Replication.Status parseFrom(com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return Builder.create();
    }

    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder(org.apache.accumulo.core.replication.proto.Replication.Status prototype) {
      return newBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
      return newBuilder(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }

    /**
     * Protobuf type {@code Status}
     */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        org.apache.accumulo.core.replication.proto.Replication.StatusOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return org.apache.accumulo.core.replication.proto.Replication.internal_static_Status_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
        return org.apache.accumulo.core.replication.proto.Replication.internal_static_Status_fieldAccessorTable.ensureFieldAccessorsInitialized(
            org.apache.accumulo.core.replication.proto.Replication.Status.class, org.apache.accumulo.core.replication.proto.Replication.Status.Builder.class);
      }

      // Construct using org.apache.accumulo.core.replication.proto.Replication.Status.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {}
      }

      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        begin_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        end_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        infiniteEnd_ = false;
        bitField0_ = (bitField0_ & ~0x00000004);
        closed_ = false;
        bitField0_ = (bitField0_ & ~0x00000008);
        createdTime_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return org.apache.accumulo.core.replication.proto.Replication.internal_static_Status_descriptor;
      }

      public org.apache.accumulo.core.replication.proto.Replication.Status getDefaultInstanceForType() {
        return org.apache.accumulo.core.replication.proto.Replication.Status.getDefaultInstance();
      }

      public org.apache.accumulo.core.replication.proto.Replication.Status build() {
        org.apache.accumulo.core.replication.proto.Replication.Status result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.accumulo.core.replication.proto.Replication.Status buildPartial() {
        org.apache.accumulo.core.replication.proto.Replication.Status result = new org.apache.accumulo.core.replication.proto.Replication.Status(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.begin_ = begin_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.end_ = end_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.infiniteEnd_ = infiniteEnd_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.closed_ = closed_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.createdTime_ = createdTime_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.accumulo.core.replication.proto.Replication.Status) {
          return mergeFrom((org.apache.accumulo.core.replication.proto.Replication.Status) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.accumulo.core.replication.proto.Replication.Status other) {
        if (other == org.apache.accumulo.core.replication.proto.Replication.Status.getDefaultInstance())
          return this;
        if (other.hasBegin()) {
          setBegin(other.getBegin());
        }
        if (other.hasEnd()) {
          setEnd(other.getEnd());
        }
        if (other.hasInfiniteEnd()) {
          setInfiniteEnd(other.getInfiniteEnd());
        }
        if (other.hasClosed()) {
          setClosed(other.getClosed());
        }
        if (other.hasCreatedTime()) {
          setCreatedTime(other.getCreatedTime());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.accumulo.core.replication.proto.Replication.Status parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.accumulo.core.replication.proto.Replication.Status) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      // optional int64 begin = 1 [default = 0];
      private long begin_;

      /**
       * <code>optional int64 begin = 1 [default = 0];</code>
       *
       * <pre>
       * offset where replication should start
       * </pre>
       */
      public boolean hasBegin() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }

      /**
       * <code>optional int64 begin = 1 [default = 0];</code>
       *
       * <pre>
       * offset where replication should start
       * </pre>
       */
      public long getBegin() {
        return begin_;
      }

      /**
       * <code>optional int64 begin = 1 [default = 0];</code>
       *
       * <pre>
       * offset where replication should start
       * </pre>
       */
      public Builder setBegin(long value) {
        bitField0_ |= 0x00000001;
        begin_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional int64 begin = 1 [default = 0];</code>
       *
       * <pre>
       * offset where replication should start
       * </pre>
       */
      public Builder clearBegin() {
        bitField0_ = (bitField0_ & ~0x00000001);
        begin_ = 0L;
        onChanged();
        return this;
      }

      // optional int64 end = 2 [default = 0];
      private long end_;

      /**
       * <code>optional int64 end = 2 [default = 0];</code>
       *
       * <pre>
       * offset where data is ready for replication
       * </pre>
       */
      public boolean hasEnd() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }

      /**
       * <code>optional int64 end = 2 [default = 0];</code>
       *
       * <pre>
       * offset where data is ready for replication
       * </pre>
       */
      public long getEnd() {
        return end_;
      }

      /**
       * <code>optional int64 end = 2 [default = 0];</code>
       *
       * <pre>
       * offset where data is ready for replication
       * </pre>
       */
      public Builder setEnd(long value) {
        bitField0_ |= 0x00000002;
        end_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional int64 end = 2 [default = 0];</code>
       *
       * <pre>
       * offset where data is ready for replication
       * </pre>
       */
      public Builder clearEnd() {
        bitField0_ = (bitField0_ & ~0x00000002);
        end_ = 0L;
        onChanged();
        return this;
      }

      // optional bool infiniteEnd = 3 [default = false];
      private boolean infiniteEnd_;

      /**
       * <code>optional bool infiniteEnd = 3 [default = false];</code>
       *
       * <pre>
       * do we have a discrete 'end'
       * </pre>
       */
      public boolean hasInfiniteEnd() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }

      /**
       * <code>optional bool infiniteEnd = 3 [default = false];</code>
       *
       * <pre>
       * do we have a discrete 'end'
       * </pre>
       */
      public boolean getInfiniteEnd() {
        return infiniteEnd_;
      }

      /**
       * <code>optional bool infiniteEnd = 3 [default = false];</code>
       *
       * <pre>
       * do we have a discrete 'end'
       * </pre>
       */
      public Builder setInfiniteEnd(boolean value) {
        bitField0_ |= 0x00000004;
        infiniteEnd_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional bool infiniteEnd = 3 [default = false];</code>
       *
       * <pre>
       * do we have a discrete 'end'
       * </pre>
       */
      public Builder clearInfiniteEnd() {
        bitField0_ = (bitField0_ & ~0x00000004);
        infiniteEnd_ = false;
        onChanged();
        return this;
      }

      // optional bool closed = 4 [default = false];
      private boolean closed_;

      /**
       * <code>optional bool closed = 4 [default = false];</code>
       *
       * <pre>
       * will more data be appended to the file
       * </pre>
       */
      public boolean hasClosed() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }

      /**
       * <code>optional bool closed = 4 [default = false];</code>
       *
       * <pre>
       * will more data be appended to the file
       * </pre>
       */
      public boolean getClosed() {
        return closed_;
      }

      /**
       * <code>optional bool closed = 4 [default = false];</code>
       *
       * <pre>
       * will more data be appended to the file
       * </pre>
       */
      public Builder setClosed(boolean value) {
        bitField0_ |= 0x00000008;
        closed_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional bool closed = 4 [default = false];</code>
       *
       * <pre>
       * will more data be appended to the file
       * </pre>
       */
      public Builder clearClosed() {
        bitField0_ = (bitField0_ & ~0x00000008);
        closed_ = false;
        onChanged();
        return this;
      }

      // optional int64 createdTime = 5 [default = 0];
      private long createdTime_;

      /**
       * <code>optional int64 createdTime = 5 [default = 0];</code>
       *
       * <pre>
       * when, in ms, was the file created?
       * </pre>
       */
      public boolean hasCreatedTime() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }

      /**
       * <code>optional int64 createdTime = 5 [default = 0];</code>
       *
       * <pre>
       * when, in ms, was the file created?
       * </pre>
       */
      public long getCreatedTime() {
        return createdTime_;
      }

      /**
       * <code>optional int64 createdTime = 5 [default = 0];</code>
       *
       * <pre>
       * when, in ms, was the file created?
       * </pre>
       */
      public Builder setCreatedTime(long value) {
        bitField0_ |= 0x00000010;
        createdTime_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional int64 createdTime = 5 [default = 0];</code>
       *
       * <pre>
       * when, in ms, was the file created?
       * </pre>
       */
      public Builder clearCreatedTime() {
        bitField0_ = (bitField0_ & ~0x00000010);
        createdTime_ = 0L;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:Status)
    }

    static {
      defaultInstance = new Status(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:Status)
  }

  private static com.google.protobuf.Descriptors.Descriptor internal_static_Status_descriptor;
  private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_Status_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;
  static {
    java.lang.String[] descriptorData = {"\n#src/main/protobuf/replication.proto\"u\n"
        + "\006Status\022\020\n\005begin\030\001 \001(\003:\0010\022\016\n\003end\030\002 \001(\003:\001"
        + "0\022\032\n\013infiniteEnd\030\003 \001(\010:\005false\022\025\n\006closed\030"
        + "\004 \001(\010:\005false\022\026\n\013createdTime\030\005 \001(\003:\0010B.\n*" + "org.apache.accumulo.core.replication.pro" + "toH\001"};
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner = new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
      public com.google.protobuf.ExtensionRegistry assignDescriptors(com.google.protobuf.Descriptors.FileDescriptor root) {
        descriptor = root;
        internal_static_Status_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_Status_fieldAccessorTable = new com.google.protobuf.GeneratedMessage.FieldAccessorTable(internal_static_Status_descriptor,
            new java.lang.String[] {"Begin", "End", "InfiniteEnd", "Closed", "CreatedTime",});
        return null;
      }
    };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {},
        assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
