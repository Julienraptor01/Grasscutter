// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SetPlayerBirthdayReq.proto

package emu.grasscutter.net.proto;

public final class SetPlayerBirthdayReqOuterClass {
  private SetPlayerBirthdayReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SetPlayerBirthdayReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SetPlayerBirthdayReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Birthday birthday = 1;</code>
     * @return Whether the birthday field is set.
     */
    boolean hasBirthday();
    /**
     * <code>.Birthday birthday = 1;</code>
     * @return The birthday.
     */
    emu.grasscutter.net.proto.BirthdayOuterClass.Birthday getBirthday();
    /**
     * <code>.Birthday birthday = 1;</code>
     */
    emu.grasscutter.net.proto.BirthdayOuterClass.BirthdayOrBuilder getBirthdayOrBuilder();
  }
  /**
   * Protobuf type {@code SetPlayerBirthdayReq}
   */
  public static final class SetPlayerBirthdayReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SetPlayerBirthdayReq)
      SetPlayerBirthdayReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SetPlayerBirthdayReq.newBuilder() to construct.
    private SetPlayerBirthdayReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SetPlayerBirthdayReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SetPlayerBirthdayReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SetPlayerBirthdayReq(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              emu.grasscutter.net.proto.BirthdayOuterClass.Birthday.Builder subBuilder = null;
              if (birthday_ != null) {
                subBuilder = birthday_.toBuilder();
              }
              birthday_ = input.readMessage(emu.grasscutter.net.proto.BirthdayOuterClass.Birthday.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(birthday_);
                birthday_ = subBuilder.buildPartial();
              }

              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.SetPlayerBirthdayReqOuterClass.internal_static_SetPlayerBirthdayReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SetPlayerBirthdayReqOuterClass.internal_static_SetPlayerBirthdayReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SetPlayerBirthdayReqOuterClass.SetPlayerBirthdayReq.class, emu.grasscutter.net.proto.SetPlayerBirthdayReqOuterClass.SetPlayerBirthdayReq.Builder.class);
    }

    /**
     * Protobuf enum {@code SetPlayerBirthdayReq.CmdId}
     */
    public enum CmdId
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>ENET_CHANNEL_ID = 0;</code>
       */
      ENET_CHANNEL_ID(0, 0),
      /**
       * <code>ENET_IS_RELIABLE = 1;</code>
       */
      ENET_IS_RELIABLE(2, 1),
      /**
       * <code>CMD_ID = 4024;</code>
       */
      CMD_ID(4, 4024),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>NONE = 0;</code>
       */
      public static final CmdId NONE = ENET_CHANNEL_ID;
      /**
       * <code>IS_ALLOW_CLIENT = 1;</code>
       */
      public static final CmdId IS_ALLOW_CLIENT = ENET_IS_RELIABLE;
      /**
       * <code>ENET_CHANNEL_ID = 0;</code>
       */
      public static final int ENET_CHANNEL_ID_VALUE = 0;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>ENET_IS_RELIABLE = 1;</code>
       */
      public static final int ENET_IS_RELIABLE_VALUE = 1;
      /**
       * <code>IS_ALLOW_CLIENT = 1;</code>
       */
      public static final int IS_ALLOW_CLIENT_VALUE = 1;
      /**
       * <code>CMD_ID = 4024;</code>
       */
      public static final int CMD_ID_VALUE = 4024;


      public final int getNumber() {
        if (index == -1) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static CmdId valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static CmdId forNumber(int value) {
        switch (value) {
          case 0: return ENET_CHANNEL_ID;
          case 1: return ENET_IS_RELIABLE;
          case 4024: return CMD_ID;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<CmdId>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          CmdId> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<CmdId>() {
              public CmdId findValueByNumber(int number) {
                return CmdId.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (index == -1) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SetPlayerBirthdayReqOuterClass.SetPlayerBirthdayReq.getDescriptor().getEnumTypes().get(0);
      }

      private static final CmdId[] VALUES = getStaticValuesArray();
      private static CmdId[] getStaticValuesArray() {
        return new CmdId[] {
          ENET_CHANNEL_ID, NONE, ENET_IS_RELIABLE, IS_ALLOW_CLIENT, CMD_ID, 
        };
      }
      public static CmdId valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private CmdId(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:SetPlayerBirthdayReq.CmdId)
    }

    public static final int BIRTHDAY_FIELD_NUMBER = 1;
    private emu.grasscutter.net.proto.BirthdayOuterClass.Birthday birthday_;
    /**
     * <code>.Birthday birthday = 1;</code>
     * @return Whether the birthday field is set.
     */
    @java.lang.Override
    public boolean hasBirthday() {
      return birthday_ != null;
    }
    /**
     * <code>.Birthday birthday = 1;</code>
     * @return The birthday.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.BirthdayOuterClass.Birthday getBirthday() {
      return birthday_ == null ? emu.grasscutter.net.proto.BirthdayOuterClass.Birthday.getDefaultInstance() : birthday_;
    }
    /**
     * <code>.Birthday birthday = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.BirthdayOuterClass.BirthdayOrBuilder getBirthdayOrBuilder() {
      return getBirthday();
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (birthday_ != null) {
        output.writeMessage(1, getBirthday());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (birthday_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getBirthday());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.SetPlayerBirthdayReqOuterClass.SetPlayerBirthdayReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SetPlayerBirthdayReqOuterClass.SetPlayerBirthdayReq other = (emu.grasscutter.net.proto.SetPlayerBirthdayReqOuterClass.SetPlayerBirthdayReq) obj;

      if (hasBirthday() != other.hasBirthday()) return false;
      if (hasBirthday()) {
        if (!getBirthday()
            .equals(other.getBirthday())) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasBirthday()) {
        hash = (37 * hash) + BIRTHDAY_FIELD_NUMBER;
        hash = (53 * hash) + getBirthday().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SetPlayerBirthdayReqOuterClass.SetPlayerBirthdayReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SetPlayerBirthdayReqOuterClass.SetPlayerBirthdayReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetPlayerBirthdayReqOuterClass.SetPlayerBirthdayReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SetPlayerBirthdayReqOuterClass.SetPlayerBirthdayReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetPlayerBirthdayReqOuterClass.SetPlayerBirthdayReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SetPlayerBirthdayReqOuterClass.SetPlayerBirthdayReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetPlayerBirthdayReqOuterClass.SetPlayerBirthdayReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SetPlayerBirthdayReqOuterClass.SetPlayerBirthdayReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetPlayerBirthdayReqOuterClass.SetPlayerBirthdayReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SetPlayerBirthdayReqOuterClass.SetPlayerBirthdayReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetPlayerBirthdayReqOuterClass.SetPlayerBirthdayReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SetPlayerBirthdayReqOuterClass.SetPlayerBirthdayReq parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.SetPlayerBirthdayReqOuterClass.SetPlayerBirthdayReq prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code SetPlayerBirthdayReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SetPlayerBirthdayReq)
        emu.grasscutter.net.proto.SetPlayerBirthdayReqOuterClass.SetPlayerBirthdayReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SetPlayerBirthdayReqOuterClass.internal_static_SetPlayerBirthdayReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SetPlayerBirthdayReqOuterClass.internal_static_SetPlayerBirthdayReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SetPlayerBirthdayReqOuterClass.SetPlayerBirthdayReq.class, emu.grasscutter.net.proto.SetPlayerBirthdayReqOuterClass.SetPlayerBirthdayReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SetPlayerBirthdayReqOuterClass.SetPlayerBirthdayReq.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (birthdayBuilder_ == null) {
          birthday_ = null;
        } else {
          birthday_ = null;
          birthdayBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SetPlayerBirthdayReqOuterClass.internal_static_SetPlayerBirthdayReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SetPlayerBirthdayReqOuterClass.SetPlayerBirthdayReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SetPlayerBirthdayReqOuterClass.SetPlayerBirthdayReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SetPlayerBirthdayReqOuterClass.SetPlayerBirthdayReq build() {
        emu.grasscutter.net.proto.SetPlayerBirthdayReqOuterClass.SetPlayerBirthdayReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SetPlayerBirthdayReqOuterClass.SetPlayerBirthdayReq buildPartial() {
        emu.grasscutter.net.proto.SetPlayerBirthdayReqOuterClass.SetPlayerBirthdayReq result = new emu.grasscutter.net.proto.SetPlayerBirthdayReqOuterClass.SetPlayerBirthdayReq(this);
        if (birthdayBuilder_ == null) {
          result.birthday_ = birthday_;
        } else {
          result.birthday_ = birthdayBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.SetPlayerBirthdayReqOuterClass.SetPlayerBirthdayReq) {
          return mergeFrom((emu.grasscutter.net.proto.SetPlayerBirthdayReqOuterClass.SetPlayerBirthdayReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SetPlayerBirthdayReqOuterClass.SetPlayerBirthdayReq other) {
        if (other == emu.grasscutter.net.proto.SetPlayerBirthdayReqOuterClass.SetPlayerBirthdayReq.getDefaultInstance()) return this;
        if (other.hasBirthday()) {
          mergeBirthday(other.getBirthday());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.SetPlayerBirthdayReqOuterClass.SetPlayerBirthdayReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SetPlayerBirthdayReqOuterClass.SetPlayerBirthdayReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.BirthdayOuterClass.Birthday birthday_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.BirthdayOuterClass.Birthday, emu.grasscutter.net.proto.BirthdayOuterClass.Birthday.Builder, emu.grasscutter.net.proto.BirthdayOuterClass.BirthdayOrBuilder> birthdayBuilder_;
      /**
       * <code>.Birthday birthday = 1;</code>
       * @return Whether the birthday field is set.
       */
      public boolean hasBirthday() {
        return birthdayBuilder_ != null || birthday_ != null;
      }
      /**
       * <code>.Birthday birthday = 1;</code>
       * @return The birthday.
       */
      public emu.grasscutter.net.proto.BirthdayOuterClass.Birthday getBirthday() {
        if (birthdayBuilder_ == null) {
          return birthday_ == null ? emu.grasscutter.net.proto.BirthdayOuterClass.Birthday.getDefaultInstance() : birthday_;
        } else {
          return birthdayBuilder_.getMessage();
        }
      }
      /**
       * <code>.Birthday birthday = 1;</code>
       */
      public Builder setBirthday(emu.grasscutter.net.proto.BirthdayOuterClass.Birthday value) {
        if (birthdayBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          birthday_ = value;
          onChanged();
        } else {
          birthdayBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Birthday birthday = 1;</code>
       */
      public Builder setBirthday(
          emu.grasscutter.net.proto.BirthdayOuterClass.Birthday.Builder builderForValue) {
        if (birthdayBuilder_ == null) {
          birthday_ = builderForValue.build();
          onChanged();
        } else {
          birthdayBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Birthday birthday = 1;</code>
       */
      public Builder mergeBirthday(emu.grasscutter.net.proto.BirthdayOuterClass.Birthday value) {
        if (birthdayBuilder_ == null) {
          if (birthday_ != null) {
            birthday_ =
              emu.grasscutter.net.proto.BirthdayOuterClass.Birthday.newBuilder(birthday_).mergeFrom(value).buildPartial();
          } else {
            birthday_ = value;
          }
          onChanged();
        } else {
          birthdayBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Birthday birthday = 1;</code>
       */
      public Builder clearBirthday() {
        if (birthdayBuilder_ == null) {
          birthday_ = null;
          onChanged();
        } else {
          birthday_ = null;
          birthdayBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Birthday birthday = 1;</code>
       */
      public emu.grasscutter.net.proto.BirthdayOuterClass.Birthday.Builder getBirthdayBuilder() {
        
        onChanged();
        return getBirthdayFieldBuilder().getBuilder();
      }
      /**
       * <code>.Birthday birthday = 1;</code>
       */
      public emu.grasscutter.net.proto.BirthdayOuterClass.BirthdayOrBuilder getBirthdayOrBuilder() {
        if (birthdayBuilder_ != null) {
          return birthdayBuilder_.getMessageOrBuilder();
        } else {
          return birthday_ == null ?
              emu.grasscutter.net.proto.BirthdayOuterClass.Birthday.getDefaultInstance() : birthday_;
        }
      }
      /**
       * <code>.Birthday birthday = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.BirthdayOuterClass.Birthday, emu.grasscutter.net.proto.BirthdayOuterClass.Birthday.Builder, emu.grasscutter.net.proto.BirthdayOuterClass.BirthdayOrBuilder> 
          getBirthdayFieldBuilder() {
        if (birthdayBuilder_ == null) {
          birthdayBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.BirthdayOuterClass.Birthday, emu.grasscutter.net.proto.BirthdayOuterClass.Birthday.Builder, emu.grasscutter.net.proto.BirthdayOuterClass.BirthdayOrBuilder>(
                  getBirthday(),
                  getParentForChildren(),
                  isClean());
          birthday_ = null;
        }
        return birthdayBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:SetPlayerBirthdayReq)
    }

    // @@protoc_insertion_point(class_scope:SetPlayerBirthdayReq)
    private static final emu.grasscutter.net.proto.SetPlayerBirthdayReqOuterClass.SetPlayerBirthdayReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SetPlayerBirthdayReqOuterClass.SetPlayerBirthdayReq();
    }

    public static emu.grasscutter.net.proto.SetPlayerBirthdayReqOuterClass.SetPlayerBirthdayReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SetPlayerBirthdayReq>
        PARSER = new com.google.protobuf.AbstractParser<SetPlayerBirthdayReq>() {
      @java.lang.Override
      public SetPlayerBirthdayReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SetPlayerBirthdayReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SetPlayerBirthdayReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SetPlayerBirthdayReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SetPlayerBirthdayReqOuterClass.SetPlayerBirthdayReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SetPlayerBirthdayReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SetPlayerBirthdayReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032SetPlayerBirthdayReq.proto\032\016Birthday.p" +
      "roto\"\227\001\n\024SetPlayerBirthdayReq\022\033\n\010birthda" +
      "y\030\001 \001(\0132\t.Birthday\"b\n\005CmdId\022\023\n\017ENET_CHAN" +
      "NEL_ID\020\000\022\010\n\004NONE\020\000\022\024\n\020ENET_IS_RELIABLE\020\001" +
      "\022\023\n\017IS_ALLOW_CLIENT\020\001\022\013\n\006CMD_ID\020\270\037\032\002\020\001B\033" +
      "\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.BirthdayOuterClass.getDescriptor(),
        });
    internal_static_SetPlayerBirthdayReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SetPlayerBirthdayReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SetPlayerBirthdayReq_descriptor,
        new java.lang.String[] { "Birthday", });
    emu.grasscutter.net.proto.BirthdayOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
