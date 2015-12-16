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
/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.accumulo.core.data.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2019-07-31")
public class TColumn implements org.apache.thrift.TBase<TColumn, TColumn._Fields>, java.io.Serializable, Cloneable, Comparable<TColumn> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TColumn");

  private static final org.apache.thrift.protocol.TField COLUMN_FAMILY_FIELD_DESC = new org.apache.thrift.protocol.TField("columnFamily", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField COLUMN_QUALIFIER_FIELD_DESC = new org.apache.thrift.protocol.TField("columnQualifier", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField COLUMN_VISIBILITY_FIELD_DESC = new org.apache.thrift.protocol.TField("columnVisibility", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TColumnStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TColumnTupleSchemeFactory());
  }

  public ByteBuffer columnFamily; // required
  public ByteBuffer columnQualifier; // required
  public ByteBuffer columnVisibility; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    COLUMN_FAMILY((short)1, "columnFamily"),
    COLUMN_QUALIFIER((short)2, "columnQualifier"),
    COLUMN_VISIBILITY((short)3, "columnVisibility");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // COLUMN_FAMILY
          return COLUMN_FAMILY;
        case 2: // COLUMN_QUALIFIER
          return COLUMN_QUALIFIER;
        case 3: // COLUMN_VISIBILITY
          return COLUMN_VISIBILITY;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.COLUMN_FAMILY, new org.apache.thrift.meta_data.FieldMetaData("columnFamily", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.COLUMN_QUALIFIER, new org.apache.thrift.meta_data.FieldMetaData("columnQualifier", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.COLUMN_VISIBILITY, new org.apache.thrift.meta_data.FieldMetaData("columnVisibility", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TColumn.class, metaDataMap);
  }

  public TColumn() {
  }

  public TColumn(
    ByteBuffer columnFamily,
    ByteBuffer columnQualifier,
    ByteBuffer columnVisibility)
  {
    this();
    this.columnFamily = org.apache.thrift.TBaseHelper.copyBinary(columnFamily);
    this.columnQualifier = org.apache.thrift.TBaseHelper.copyBinary(columnQualifier);
    this.columnVisibility = org.apache.thrift.TBaseHelper.copyBinary(columnVisibility);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TColumn(TColumn other) {
    if (other.isSetColumnFamily()) {
      this.columnFamily = org.apache.thrift.TBaseHelper.copyBinary(other.columnFamily);
    }
    if (other.isSetColumnQualifier()) {
      this.columnQualifier = org.apache.thrift.TBaseHelper.copyBinary(other.columnQualifier);
    }
    if (other.isSetColumnVisibility()) {
      this.columnVisibility = org.apache.thrift.TBaseHelper.copyBinary(other.columnVisibility);
    }
  }

  public TColumn deepCopy() {
    return new TColumn(this);
  }

  @Override
  public void clear() {
    this.columnFamily = null;
    this.columnQualifier = null;
    this.columnVisibility = null;
  }

  public byte[] getColumnFamily() {
    setColumnFamily(org.apache.thrift.TBaseHelper.rightSize(columnFamily));
    return columnFamily == null ? null : columnFamily.array();
  }

  public ByteBuffer bufferForColumnFamily() {
    return org.apache.thrift.TBaseHelper.copyBinary(columnFamily);
  }

  public TColumn setColumnFamily(byte[] columnFamily) {
    this.columnFamily = columnFamily == null ? (ByteBuffer)null : ByteBuffer.wrap(Arrays.copyOf(columnFamily, columnFamily.length));
    return this;
  }

  public TColumn setColumnFamily(ByteBuffer columnFamily) {
    this.columnFamily = org.apache.thrift.TBaseHelper.copyBinary(columnFamily);
    return this;
  }

  public void unsetColumnFamily() {
    this.columnFamily = null;
  }

  /** Returns true if field columnFamily is set (has been assigned a value) and false otherwise */
  public boolean isSetColumnFamily() {
    return this.columnFamily != null;
  }

  public void setColumnFamilyIsSet(boolean value) {
    if (!value) {
      this.columnFamily = null;
    }
  }

  public byte[] getColumnQualifier() {
    setColumnQualifier(org.apache.thrift.TBaseHelper.rightSize(columnQualifier));
    return columnQualifier == null ? null : columnQualifier.array();
  }

  public ByteBuffer bufferForColumnQualifier() {
    return org.apache.thrift.TBaseHelper.copyBinary(columnQualifier);
  }

  public TColumn setColumnQualifier(byte[] columnQualifier) {
    this.columnQualifier = columnQualifier == null ? (ByteBuffer)null : ByteBuffer.wrap(Arrays.copyOf(columnQualifier, columnQualifier.length));
    return this;
  }

  public TColumn setColumnQualifier(ByteBuffer columnQualifier) {
    this.columnQualifier = org.apache.thrift.TBaseHelper.copyBinary(columnQualifier);
    return this;
  }

  public void unsetColumnQualifier() {
    this.columnQualifier = null;
  }

  /** Returns true if field columnQualifier is set (has been assigned a value) and false otherwise */
  public boolean isSetColumnQualifier() {
    return this.columnQualifier != null;
  }

  public void setColumnQualifierIsSet(boolean value) {
    if (!value) {
      this.columnQualifier = null;
    }
  }

  public byte[] getColumnVisibility() {
    setColumnVisibility(org.apache.thrift.TBaseHelper.rightSize(columnVisibility));
    return columnVisibility == null ? null : columnVisibility.array();
  }

  public ByteBuffer bufferForColumnVisibility() {
    return org.apache.thrift.TBaseHelper.copyBinary(columnVisibility);
  }

  public TColumn setColumnVisibility(byte[] columnVisibility) {
    this.columnVisibility = columnVisibility == null ? (ByteBuffer)null : ByteBuffer.wrap(Arrays.copyOf(columnVisibility, columnVisibility.length));
    return this;
  }

  public TColumn setColumnVisibility(ByteBuffer columnVisibility) {
    this.columnVisibility = org.apache.thrift.TBaseHelper.copyBinary(columnVisibility);
    return this;
  }

  public void unsetColumnVisibility() {
    this.columnVisibility = null;
  }

  /** Returns true if field columnVisibility is set (has been assigned a value) and false otherwise */
  public boolean isSetColumnVisibility() {
    return this.columnVisibility != null;
  }

  public void setColumnVisibilityIsSet(boolean value) {
    if (!value) {
      this.columnVisibility = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case COLUMN_FAMILY:
      if (value == null) {
        unsetColumnFamily();
      } else {
        setColumnFamily((ByteBuffer)value);
      }
      break;

    case COLUMN_QUALIFIER:
      if (value == null) {
        unsetColumnQualifier();
      } else {
        setColumnQualifier((ByteBuffer)value);
      }
      break;

    case COLUMN_VISIBILITY:
      if (value == null) {
        unsetColumnVisibility();
      } else {
        setColumnVisibility((ByteBuffer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case COLUMN_FAMILY:
      return getColumnFamily();

    case COLUMN_QUALIFIER:
      return getColumnQualifier();

    case COLUMN_VISIBILITY:
      return getColumnVisibility();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case COLUMN_FAMILY:
      return isSetColumnFamily();
    case COLUMN_QUALIFIER:
      return isSetColumnQualifier();
    case COLUMN_VISIBILITY:
      return isSetColumnVisibility();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TColumn)
      return this.equals((TColumn)that);
    return false;
  }

  public boolean equals(TColumn that) {
    if (that == null)
      return false;

    boolean this_present_columnFamily = true && this.isSetColumnFamily();
    boolean that_present_columnFamily = true && that.isSetColumnFamily();
    if (this_present_columnFamily || that_present_columnFamily) {
      if (!(this_present_columnFamily && that_present_columnFamily))
        return false;
      if (!this.columnFamily.equals(that.columnFamily))
        return false;
    }

    boolean this_present_columnQualifier = true && this.isSetColumnQualifier();
    boolean that_present_columnQualifier = true && that.isSetColumnQualifier();
    if (this_present_columnQualifier || that_present_columnQualifier) {
      if (!(this_present_columnQualifier && that_present_columnQualifier))
        return false;
      if (!this.columnQualifier.equals(that.columnQualifier))
        return false;
    }

    boolean this_present_columnVisibility = true && this.isSetColumnVisibility();
    boolean that_present_columnVisibility = true && that.isSetColumnVisibility();
    if (this_present_columnVisibility || that_present_columnVisibility) {
      if (!(this_present_columnVisibility && that_present_columnVisibility))
        return false;
      if (!this.columnVisibility.equals(that.columnVisibility))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_columnFamily = true && (isSetColumnFamily());
    list.add(present_columnFamily);
    if (present_columnFamily)
      list.add(columnFamily);

    boolean present_columnQualifier = true && (isSetColumnQualifier());
    list.add(present_columnQualifier);
    if (present_columnQualifier)
      list.add(columnQualifier);

    boolean present_columnVisibility = true && (isSetColumnVisibility());
    list.add(present_columnVisibility);
    if (present_columnVisibility)
      list.add(columnVisibility);

    return list.hashCode();
  }

  @Override
  public int compareTo(TColumn other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetColumnFamily()).compareTo(other.isSetColumnFamily());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColumnFamily()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.columnFamily, other.columnFamily);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetColumnQualifier()).compareTo(other.isSetColumnQualifier());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColumnQualifier()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.columnQualifier, other.columnQualifier);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetColumnVisibility()).compareTo(other.isSetColumnVisibility());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColumnVisibility()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.columnVisibility, other.columnVisibility);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TColumn(");
    boolean first = true;

    sb.append("columnFamily:");
    if (this.columnFamily == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.columnFamily, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("columnQualifier:");
    if (this.columnQualifier == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.columnQualifier, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("columnVisibility:");
    if (this.columnVisibility == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.columnVisibility, sb);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TColumnStandardSchemeFactory implements SchemeFactory {
    public TColumnStandardScheme getScheme() {
      return new TColumnStandardScheme();
    }
  }

  private static class TColumnStandardScheme extends StandardScheme<TColumn> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TColumn struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // COLUMN_FAMILY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.columnFamily = iprot.readBinary();
              struct.setColumnFamilyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // COLUMN_QUALIFIER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.columnQualifier = iprot.readBinary();
              struct.setColumnQualifierIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // COLUMN_VISIBILITY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.columnVisibility = iprot.readBinary();
              struct.setColumnVisibilityIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TColumn struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.columnFamily != null) {
        oprot.writeFieldBegin(COLUMN_FAMILY_FIELD_DESC);
        oprot.writeBinary(struct.columnFamily);
        oprot.writeFieldEnd();
      }
      if (struct.columnQualifier != null) {
        oprot.writeFieldBegin(COLUMN_QUALIFIER_FIELD_DESC);
        oprot.writeBinary(struct.columnQualifier);
        oprot.writeFieldEnd();
      }
      if (struct.columnVisibility != null) {
        oprot.writeFieldBegin(COLUMN_VISIBILITY_FIELD_DESC);
        oprot.writeBinary(struct.columnVisibility);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TColumnTupleSchemeFactory implements SchemeFactory {
    public TColumnTupleScheme getScheme() {
      return new TColumnTupleScheme();
    }
  }

  private static class TColumnTupleScheme extends TupleScheme<TColumn> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TColumn struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetColumnFamily()) {
        optionals.set(0);
      }
      if (struct.isSetColumnQualifier()) {
        optionals.set(1);
      }
      if (struct.isSetColumnVisibility()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetColumnFamily()) {
        oprot.writeBinary(struct.columnFamily);
      }
      if (struct.isSetColumnQualifier()) {
        oprot.writeBinary(struct.columnQualifier);
      }
      if (struct.isSetColumnVisibility()) {
        oprot.writeBinary(struct.columnVisibility);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TColumn struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.columnFamily = iprot.readBinary();
        struct.setColumnFamilyIsSet(true);
      }
      if (incoming.get(1)) {
        struct.columnQualifier = iprot.readBinary();
        struct.setColumnQualifierIsSet(true);
      }
      if (incoming.get(2)) {
        struct.columnVisibility = iprot.readBinary();
        struct.setColumnVisibilityIsSet(true);
      }
    }
  }

}

