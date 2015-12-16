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
package org.apache.accumulo.proxy.thrift;

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
public class ConditionalUpdates implements org.apache.thrift.TBase<ConditionalUpdates, ConditionalUpdates._Fields>, java.io.Serializable, Cloneable, Comparable<ConditionalUpdates> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ConditionalUpdates");

  private static final org.apache.thrift.protocol.TField CONDITIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("conditions", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField UPDATES_FIELD_DESC = new org.apache.thrift.protocol.TField("updates", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ConditionalUpdatesStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ConditionalUpdatesTupleSchemeFactory());
  }

  public List<Condition> conditions; // required
  public List<ColumnUpdate> updates; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CONDITIONS((short)2, "conditions"),
    UPDATES((short)3, "updates");

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
        case 2: // CONDITIONS
          return CONDITIONS;
        case 3: // UPDATES
          return UPDATES;
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
    tmpMap.put(_Fields.CONDITIONS, new org.apache.thrift.meta_data.FieldMetaData("conditions", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Condition.class))));
    tmpMap.put(_Fields.UPDATES, new org.apache.thrift.meta_data.FieldMetaData("updates", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ColumnUpdate.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ConditionalUpdates.class, metaDataMap);
  }

  public ConditionalUpdates() {
  }

  public ConditionalUpdates(
    List<Condition> conditions,
    List<ColumnUpdate> updates)
  {
    this();
    this.conditions = conditions;
    this.updates = updates;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ConditionalUpdates(ConditionalUpdates other) {
    if (other.isSetConditions()) {
      List<Condition> __this__conditions = new ArrayList<Condition>(other.conditions.size());
      for (Condition other_element : other.conditions) {
        __this__conditions.add(new Condition(other_element));
      }
      this.conditions = __this__conditions;
    }
    if (other.isSetUpdates()) {
      List<ColumnUpdate> __this__updates = new ArrayList<ColumnUpdate>(other.updates.size());
      for (ColumnUpdate other_element : other.updates) {
        __this__updates.add(new ColumnUpdate(other_element));
      }
      this.updates = __this__updates;
    }
  }

  public ConditionalUpdates deepCopy() {
    return new ConditionalUpdates(this);
  }

  @Override
  public void clear() {
    this.conditions = null;
    this.updates = null;
  }

  public int getConditionsSize() {
    return (this.conditions == null) ? 0 : this.conditions.size();
  }

  public java.util.Iterator<Condition> getConditionsIterator() {
    return (this.conditions == null) ? null : this.conditions.iterator();
  }

  public void addToConditions(Condition elem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<Condition>();
    }
    this.conditions.add(elem);
  }

  public List<Condition> getConditions() {
    return this.conditions;
  }

  public ConditionalUpdates setConditions(List<Condition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public void unsetConditions() {
    this.conditions = null;
  }

  /** Returns true if field conditions is set (has been assigned a value) and false otherwise */
  public boolean isSetConditions() {
    return this.conditions != null;
  }

  public void setConditionsIsSet(boolean value) {
    if (!value) {
      this.conditions = null;
    }
  }

  public int getUpdatesSize() {
    return (this.updates == null) ? 0 : this.updates.size();
  }

  public java.util.Iterator<ColumnUpdate> getUpdatesIterator() {
    return (this.updates == null) ? null : this.updates.iterator();
  }

  public void addToUpdates(ColumnUpdate elem) {
    if (this.updates == null) {
      this.updates = new ArrayList<ColumnUpdate>();
    }
    this.updates.add(elem);
  }

  public List<ColumnUpdate> getUpdates() {
    return this.updates;
  }

  public ConditionalUpdates setUpdates(List<ColumnUpdate> updates) {
    this.updates = updates;
    return this;
  }

  public void unsetUpdates() {
    this.updates = null;
  }

  /** Returns true if field updates is set (has been assigned a value) and false otherwise */
  public boolean isSetUpdates() {
    return this.updates != null;
  }

  public void setUpdatesIsSet(boolean value) {
    if (!value) {
      this.updates = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CONDITIONS:
      if (value == null) {
        unsetConditions();
      } else {
        setConditions((List<Condition>)value);
      }
      break;

    case UPDATES:
      if (value == null) {
        unsetUpdates();
      } else {
        setUpdates((List<ColumnUpdate>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CONDITIONS:
      return getConditions();

    case UPDATES:
      return getUpdates();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CONDITIONS:
      return isSetConditions();
    case UPDATES:
      return isSetUpdates();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ConditionalUpdates)
      return this.equals((ConditionalUpdates)that);
    return false;
  }

  public boolean equals(ConditionalUpdates that) {
    if (that == null)
      return false;

    boolean this_present_conditions = true && this.isSetConditions();
    boolean that_present_conditions = true && that.isSetConditions();
    if (this_present_conditions || that_present_conditions) {
      if (!(this_present_conditions && that_present_conditions))
        return false;
      if (!this.conditions.equals(that.conditions))
        return false;
    }

    boolean this_present_updates = true && this.isSetUpdates();
    boolean that_present_updates = true && that.isSetUpdates();
    if (this_present_updates || that_present_updates) {
      if (!(this_present_updates && that_present_updates))
        return false;
      if (!this.updates.equals(that.updates))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_conditions = true && (isSetConditions());
    list.add(present_conditions);
    if (present_conditions)
      list.add(conditions);

    boolean present_updates = true && (isSetUpdates());
    list.add(present_updates);
    if (present_updates)
      list.add(updates);

    return list.hashCode();
  }

  @Override
  public int compareTo(ConditionalUpdates other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetConditions()).compareTo(other.isSetConditions());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetConditions()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.conditions, other.conditions);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUpdates()).compareTo(other.isSetUpdates());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUpdates()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.updates, other.updates);
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
    StringBuilder sb = new StringBuilder("ConditionalUpdates(");
    boolean first = true;

    sb.append("conditions:");
    if (this.conditions == null) {
      sb.append("null");
    } else {
      sb.append(this.conditions);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("updates:");
    if (this.updates == null) {
      sb.append("null");
    } else {
      sb.append(this.updates);
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

  private static class ConditionalUpdatesStandardSchemeFactory implements SchemeFactory {
    public ConditionalUpdatesStandardScheme getScheme() {
      return new ConditionalUpdatesStandardScheme();
    }
  }

  private static class ConditionalUpdatesStandardScheme extends StandardScheme<ConditionalUpdates> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ConditionalUpdates struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 2: // CONDITIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list90 = iprot.readListBegin();
                struct.conditions = new ArrayList<Condition>(_list90.size);
                Condition _elem91;
                for (int _i92 = 0; _i92 < _list90.size; ++_i92)
                {
                  _elem91 = new Condition();
                  _elem91.read(iprot);
                  struct.conditions.add(_elem91);
                }
                iprot.readListEnd();
              }
              struct.setConditionsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // UPDATES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list93 = iprot.readListBegin();
                struct.updates = new ArrayList<ColumnUpdate>(_list93.size);
                ColumnUpdate _elem94;
                for (int _i95 = 0; _i95 < _list93.size; ++_i95)
                {
                  _elem94 = new ColumnUpdate();
                  _elem94.read(iprot);
                  struct.updates.add(_elem94);
                }
                iprot.readListEnd();
              }
              struct.setUpdatesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ConditionalUpdates struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.conditions != null) {
        oprot.writeFieldBegin(CONDITIONS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.conditions.size()));
          for (Condition _iter96 : struct.conditions)
          {
            _iter96.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.updates != null) {
        oprot.writeFieldBegin(UPDATES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.updates.size()));
          for (ColumnUpdate _iter97 : struct.updates)
          {
            _iter97.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ConditionalUpdatesTupleSchemeFactory implements SchemeFactory {
    public ConditionalUpdatesTupleScheme getScheme() {
      return new ConditionalUpdatesTupleScheme();
    }
  }

  private static class ConditionalUpdatesTupleScheme extends TupleScheme<ConditionalUpdates> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ConditionalUpdates struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetConditions()) {
        optionals.set(0);
      }
      if (struct.isSetUpdates()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetConditions()) {
        {
          oprot.writeI32(struct.conditions.size());
          for (Condition _iter98 : struct.conditions)
          {
            _iter98.write(oprot);
          }
        }
      }
      if (struct.isSetUpdates()) {
        {
          oprot.writeI32(struct.updates.size());
          for (ColumnUpdate _iter99 : struct.updates)
          {
            _iter99.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ConditionalUpdates struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list100 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.conditions = new ArrayList<Condition>(_list100.size);
          Condition _elem101;
          for (int _i102 = 0; _i102 < _list100.size; ++_i102)
          {
            _elem101 = new Condition();
            _elem101.read(iprot);
            struct.conditions.add(_elem101);
          }
        }
        struct.setConditionsIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list103 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.updates = new ArrayList<ColumnUpdate>(_list103.size);
          ColumnUpdate _elem104;
          for (int _i105 = 0; _i105 < _list103.size; ++_i105)
          {
            _elem104 = new ColumnUpdate();
            _elem104.read(iprot);
            struct.updates.add(_elem104);
          }
        }
        struct.setUpdatesIsSet(true);
      }
    }
  }

}

