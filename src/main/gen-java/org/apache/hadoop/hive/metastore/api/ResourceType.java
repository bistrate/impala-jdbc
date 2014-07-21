/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum ResourceType implements org.apache.thrift.TEnum {
  JAR(1),
  FILE(2),
  ARCHIVE(3);

  private final int value;

  private ResourceType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static ResourceType findByValue(int value) { 
    switch (value) {
      case 1:
        return JAR;
      case 2:
        return FILE;
      case 3:
        return ARCHIVE;
      default:
        return null;
    }
  }
}
