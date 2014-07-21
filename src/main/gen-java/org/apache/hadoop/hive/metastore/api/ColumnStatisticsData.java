/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ColumnStatisticsData extends org.apache.thrift.TUnion<ColumnStatisticsData, ColumnStatisticsData._Fields> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ColumnStatisticsData");
  private static final org.apache.thrift.protocol.TField BOOLEAN_STATS_FIELD_DESC = new org.apache.thrift.protocol.TField("booleanStats", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField LONG_STATS_FIELD_DESC = new org.apache.thrift.protocol.TField("longStats", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField DOUBLE_STATS_FIELD_DESC = new org.apache.thrift.protocol.TField("doubleStats", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField STRING_STATS_FIELD_DESC = new org.apache.thrift.protocol.TField("stringStats", org.apache.thrift.protocol.TType.STRUCT, (short)4);
  private static final org.apache.thrift.protocol.TField BINARY_STATS_FIELD_DESC = new org.apache.thrift.protocol.TField("binaryStats", org.apache.thrift.protocol.TType.STRUCT, (short)5);
  private static final org.apache.thrift.protocol.TField DECIMAL_STATS_FIELD_DESC = new org.apache.thrift.protocol.TField("decimalStats", org.apache.thrift.protocol.TType.STRUCT, (short)6);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BOOLEAN_STATS((short)1, "booleanStats"),
    LONG_STATS((short)2, "longStats"),
    DOUBLE_STATS((short)3, "doubleStats"),
    STRING_STATS((short)4, "stringStats"),
    BINARY_STATS((short)5, "binaryStats"),
    DECIMAL_STATS((short)6, "decimalStats");

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
        case 1: // BOOLEAN_STATS
          return BOOLEAN_STATS;
        case 2: // LONG_STATS
          return LONG_STATS;
        case 3: // DOUBLE_STATS
          return DOUBLE_STATS;
        case 4: // STRING_STATS
          return STRING_STATS;
        case 5: // BINARY_STATS
          return BINARY_STATS;
        case 6: // DECIMAL_STATS
          return DECIMAL_STATS;
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

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BOOLEAN_STATS, new org.apache.thrift.meta_data.FieldMetaData("booleanStats", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, BooleanColumnStatsData.class)));
    tmpMap.put(_Fields.LONG_STATS, new org.apache.thrift.meta_data.FieldMetaData("longStats", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, LongColumnStatsData.class)));
    tmpMap.put(_Fields.DOUBLE_STATS, new org.apache.thrift.meta_data.FieldMetaData("doubleStats", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, DoubleColumnStatsData.class)));
    tmpMap.put(_Fields.STRING_STATS, new org.apache.thrift.meta_data.FieldMetaData("stringStats", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, StringColumnStatsData.class)));
    tmpMap.put(_Fields.BINARY_STATS, new org.apache.thrift.meta_data.FieldMetaData("binaryStats", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, BinaryColumnStatsData.class)));
    tmpMap.put(_Fields.DECIMAL_STATS, new org.apache.thrift.meta_data.FieldMetaData("decimalStats", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, DecimalColumnStatsData.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ColumnStatisticsData.class, metaDataMap);
  }

  public ColumnStatisticsData() {
    super();
  }

  public ColumnStatisticsData(_Fields setField, Object value) {
    super(setField, value);
  }

  public ColumnStatisticsData(ColumnStatisticsData other) {
    super(other);
  }
  public ColumnStatisticsData deepCopy() {
    return new ColumnStatisticsData(this);
  }

  public static ColumnStatisticsData booleanStats(BooleanColumnStatsData value) {
    ColumnStatisticsData x = new ColumnStatisticsData();
    x.setBooleanStats(value);
    return x;
  }

  public static ColumnStatisticsData longStats(LongColumnStatsData value) {
    ColumnStatisticsData x = new ColumnStatisticsData();
    x.setLongStats(value);
    return x;
  }

  public static ColumnStatisticsData doubleStats(DoubleColumnStatsData value) {
    ColumnStatisticsData x = new ColumnStatisticsData();
    x.setDoubleStats(value);
    return x;
  }

  public static ColumnStatisticsData stringStats(StringColumnStatsData value) {
    ColumnStatisticsData x = new ColumnStatisticsData();
    x.setStringStats(value);
    return x;
  }

  public static ColumnStatisticsData binaryStats(BinaryColumnStatsData value) {
    ColumnStatisticsData x = new ColumnStatisticsData();
    x.setBinaryStats(value);
    return x;
  }

  public static ColumnStatisticsData decimalStats(DecimalColumnStatsData value) {
    ColumnStatisticsData x = new ColumnStatisticsData();
    x.setDecimalStats(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, Object value) throws ClassCastException {
    switch (setField) {
      case BOOLEAN_STATS:
        if (value instanceof BooleanColumnStatsData) {
          break;
        }
        throw new ClassCastException("Was expecting value of type BooleanColumnStatsData for field 'booleanStats', but got " + value.getClass().getSimpleName());
      case LONG_STATS:
        if (value instanceof LongColumnStatsData) {
          break;
        }
        throw new ClassCastException("Was expecting value of type LongColumnStatsData for field 'longStats', but got " + value.getClass().getSimpleName());
      case DOUBLE_STATS:
        if (value instanceof DoubleColumnStatsData) {
          break;
        }
        throw new ClassCastException("Was expecting value of type DoubleColumnStatsData for field 'doubleStats', but got " + value.getClass().getSimpleName());
      case STRING_STATS:
        if (value instanceof StringColumnStatsData) {
          break;
        }
        throw new ClassCastException("Was expecting value of type StringColumnStatsData for field 'stringStats', but got " + value.getClass().getSimpleName());
      case BINARY_STATS:
        if (value instanceof BinaryColumnStatsData) {
          break;
        }
        throw new ClassCastException("Was expecting value of type BinaryColumnStatsData for field 'binaryStats', but got " + value.getClass().getSimpleName());
      case DECIMAL_STATS:
        if (value instanceof DecimalColumnStatsData) {
          break;
        }
        throw new ClassCastException("Was expecting value of type DecimalColumnStatsData for field 'decimalStats', but got " + value.getClass().getSimpleName());
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected Object standardSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TField field) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case BOOLEAN_STATS:
          if (field.type == BOOLEAN_STATS_FIELD_DESC.type) {
            BooleanColumnStatsData booleanStats;
            booleanStats = new BooleanColumnStatsData();
            booleanStats.read(iprot);
            return booleanStats;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case LONG_STATS:
          if (field.type == LONG_STATS_FIELD_DESC.type) {
            LongColumnStatsData longStats;
            longStats = new LongColumnStatsData();
            longStats.read(iprot);
            return longStats;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case DOUBLE_STATS:
          if (field.type == DOUBLE_STATS_FIELD_DESC.type) {
            DoubleColumnStatsData doubleStats;
            doubleStats = new DoubleColumnStatsData();
            doubleStats.read(iprot);
            return doubleStats;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case STRING_STATS:
          if (field.type == STRING_STATS_FIELD_DESC.type) {
            StringColumnStatsData stringStats;
            stringStats = new StringColumnStatsData();
            stringStats.read(iprot);
            return stringStats;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case BINARY_STATS:
          if (field.type == BINARY_STATS_FIELD_DESC.type) {
            BinaryColumnStatsData binaryStats;
            binaryStats = new BinaryColumnStatsData();
            binaryStats.read(iprot);
            return binaryStats;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case DECIMAL_STATS:
          if (field.type == DECIMAL_STATS_FIELD_DESC.type) {
            DecimalColumnStatsData decimalStats;
            decimalStats = new DecimalColumnStatsData();
            decimalStats.read(iprot);
            return decimalStats;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        default:
          throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      return null;
    }
  }

  @Override
  protected void standardSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case BOOLEAN_STATS:
        BooleanColumnStatsData booleanStats = (BooleanColumnStatsData)value_;
        booleanStats.write(oprot);
        return;
      case LONG_STATS:
        LongColumnStatsData longStats = (LongColumnStatsData)value_;
        longStats.write(oprot);
        return;
      case DOUBLE_STATS:
        DoubleColumnStatsData doubleStats = (DoubleColumnStatsData)value_;
        doubleStats.write(oprot);
        return;
      case STRING_STATS:
        StringColumnStatsData stringStats = (StringColumnStatsData)value_;
        stringStats.write(oprot);
        return;
      case BINARY_STATS:
        BinaryColumnStatsData binaryStats = (BinaryColumnStatsData)value_;
        binaryStats.write(oprot);
        return;
      case DECIMAL_STATS:
        DecimalColumnStatsData decimalStats = (DecimalColumnStatsData)value_;
        decimalStats.write(oprot);
        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected Object tupleSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, short fieldID) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(fieldID);
    if (setField != null) {
      switch (setField) {
        case BOOLEAN_STATS:
          BooleanColumnStatsData booleanStats;
          booleanStats = new BooleanColumnStatsData();
          booleanStats.read(iprot);
          return booleanStats;
        case LONG_STATS:
          LongColumnStatsData longStats;
          longStats = new LongColumnStatsData();
          longStats.read(iprot);
          return longStats;
        case DOUBLE_STATS:
          DoubleColumnStatsData doubleStats;
          doubleStats = new DoubleColumnStatsData();
          doubleStats.read(iprot);
          return doubleStats;
        case STRING_STATS:
          StringColumnStatsData stringStats;
          stringStats = new StringColumnStatsData();
          stringStats.read(iprot);
          return stringStats;
        case BINARY_STATS:
          BinaryColumnStatsData binaryStats;
          binaryStats = new BinaryColumnStatsData();
          binaryStats.read(iprot);
          return binaryStats;
        case DECIMAL_STATS:
          DecimalColumnStatsData decimalStats;
          decimalStats = new DecimalColumnStatsData();
          decimalStats.read(iprot);
          return decimalStats;
        default:
          throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      throw new TProtocolException("Couldn't find a field with field id " + fieldID);
    }
  }

  @Override
  protected void tupleSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case BOOLEAN_STATS:
        BooleanColumnStatsData booleanStats = (BooleanColumnStatsData)value_;
        booleanStats.write(oprot);
        return;
      case LONG_STATS:
        LongColumnStatsData longStats = (LongColumnStatsData)value_;
        longStats.write(oprot);
        return;
      case DOUBLE_STATS:
        DoubleColumnStatsData doubleStats = (DoubleColumnStatsData)value_;
        doubleStats.write(oprot);
        return;
      case STRING_STATS:
        StringColumnStatsData stringStats = (StringColumnStatsData)value_;
        stringStats.write(oprot);
        return;
      case BINARY_STATS:
        BinaryColumnStatsData binaryStats = (BinaryColumnStatsData)value_;
        binaryStats.write(oprot);
        return;
      case DECIMAL_STATS:
        DecimalColumnStatsData decimalStats = (DecimalColumnStatsData)value_;
        decimalStats.write(oprot);
        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case BOOLEAN_STATS:
        return BOOLEAN_STATS_FIELD_DESC;
      case LONG_STATS:
        return LONG_STATS_FIELD_DESC;
      case DOUBLE_STATS:
        return DOUBLE_STATS_FIELD_DESC;
      case STRING_STATS:
        return STRING_STATS_FIELD_DESC;
      case BINARY_STATS:
        return BINARY_STATS_FIELD_DESC;
      case DECIMAL_STATS:
        return DECIMAL_STATS_FIELD_DESC;
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TStruct getStructDesc() {
    return STRUCT_DESC;
  }

  @Override
  protected _Fields enumForId(short id) {
    return _Fields.findByThriftIdOrThrow(id);
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }


  public BooleanColumnStatsData getBooleanStats() {
    if (getSetField() == _Fields.BOOLEAN_STATS) {
      return (BooleanColumnStatsData)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'booleanStats' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setBooleanStats(BooleanColumnStatsData value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.BOOLEAN_STATS;
    value_ = value;
  }

  public LongColumnStatsData getLongStats() {
    if (getSetField() == _Fields.LONG_STATS) {
      return (LongColumnStatsData)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'longStats' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setLongStats(LongColumnStatsData value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.LONG_STATS;
    value_ = value;
  }

  public DoubleColumnStatsData getDoubleStats() {
    if (getSetField() == _Fields.DOUBLE_STATS) {
      return (DoubleColumnStatsData)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'doubleStats' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setDoubleStats(DoubleColumnStatsData value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.DOUBLE_STATS;
    value_ = value;
  }

  public StringColumnStatsData getStringStats() {
    if (getSetField() == _Fields.STRING_STATS) {
      return (StringColumnStatsData)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'stringStats' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setStringStats(StringColumnStatsData value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.STRING_STATS;
    value_ = value;
  }

  public BinaryColumnStatsData getBinaryStats() {
    if (getSetField() == _Fields.BINARY_STATS) {
      return (BinaryColumnStatsData)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'binaryStats' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setBinaryStats(BinaryColumnStatsData value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.BINARY_STATS;
    value_ = value;
  }

  public DecimalColumnStatsData getDecimalStats() {
    if (getSetField() == _Fields.DECIMAL_STATS) {
      return (DecimalColumnStatsData)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'decimalStats' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setDecimalStats(DecimalColumnStatsData value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.DECIMAL_STATS;
    value_ = value;
  }

  public boolean isSetBooleanStats() {
    return setField_ == _Fields.BOOLEAN_STATS;
  }


  public boolean isSetLongStats() {
    return setField_ == _Fields.LONG_STATS;
  }


  public boolean isSetDoubleStats() {
    return setField_ == _Fields.DOUBLE_STATS;
  }


  public boolean isSetStringStats() {
    return setField_ == _Fields.STRING_STATS;
  }


  public boolean isSetBinaryStats() {
    return setField_ == _Fields.BINARY_STATS;
  }


  public boolean isSetDecimalStats() {
    return setField_ == _Fields.DECIMAL_STATS;
  }


  public boolean equals(Object other) {
    if (other instanceof ColumnStatisticsData) {
      return equals((ColumnStatisticsData)other);
    } else {
      return false;
    }
  }

  public boolean equals(ColumnStatisticsData other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(ColumnStatisticsData other) {
    int lastComparison = org.apache.thrift.TBaseHelper.compareTo(getSetField(), other.getSetField());
    if (lastComparison == 0) {
      return org.apache.thrift.TBaseHelper.compareTo(getFieldValue(), other.getFieldValue());
    }
    return lastComparison;
  }


  /**
   * If you'd like this to perform more respectably, use the hashcode generator option.
   */
  @Override
  public int hashCode() {
    return 0;
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


}
