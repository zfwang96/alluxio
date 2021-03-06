/*
 * The Alluxio Open Foundation licenses this work under the Apache License, version 2.0
 * (the "License"). You may not use this work except in compliance with the License, which is
 * available at www.apache.org/licenses/LICENSE-2.0
 *
 * This software is distributed on an "AS IS" basis, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied, as more fully set forth in the License.
 *
 * See the NOTICE file distributed with this work for information regarding copyright ownership.
 */

package alluxio.wire;

import alluxio.thrift.TTtlAction;

import javax.annotation.concurrent.ThreadSafe;

/**
 * Utility methods for conversion between wire types and thrift types.
 */
@ThreadSafe
public final class ThriftUtils {

  private ThriftUtils() {} // prevent instantiation

  /**
   * Converts a thrift type to a wire type.
   *
   * @param blockInfo the thrift representation of a block information
   * @return wire representation of the block information
   */
  public static BlockInfo fromThrift(alluxio.thrift.BlockInfo blockInfo) {
    return new BlockInfo(blockInfo);
  }

  /**
   * Converts a thrift type to a wire type.
   *
   * @param blockMasterInfo the thrift representation of a block master information
   * @return wire representation of the block master information
   */
  public static BlockMasterInfo fromThrift(alluxio.thrift.BlockMasterInfo blockMasterInfo) {
    return new BlockMasterInfo(blockMasterInfo);
  }

  /**
   * Converts a thrift type to a wire type.
   *
   * @param blockLocation the thrift representation of a block location
   * @return wire representation of the block location
   */
  public static BlockLocation fromThrift(alluxio.thrift.BlockLocation blockLocation) {
    return new BlockLocation(blockLocation);
  }

  /**
   * Converts a thrift type to a wire type.
   *
   * @param jobInfo the thrift representation of a command-line job information
   * @return wire representation of the command-line job information
   */
  public static CommandLineJobInfo fromThrift(alluxio.thrift.CommandLineJobInfo jobInfo) {
    return new CommandLineJobInfo(jobInfo);
  }

  /**
   * Converts a thrift type to a wire type.
   *
   * @param fileBlockInfo the thrift representation of a file block information
   * @return wire representation of the file block information
   */
  public static FileBlockInfo fromThrift(alluxio.thrift.FileBlockInfo fileBlockInfo) {
    return new FileBlockInfo(fileBlockInfo);
  }

  /**
   * Converts a thrift type to a wire type.
   *
   * @param fileInfo the thrift representation of a file information
   * @return wire representation of the file information
   */
  public static FileInfo fromThrift(alluxio.thrift.FileInfo fileInfo) {
    return new FileInfo(fileInfo);
  }

  /**
   * Converts a thrift type to a wire type.
   *
   * @param conf the thrift representation of a command-line job configuration
   * @return wire representation of the command-line job configuration
   */
  public static JobConfInfo fromThrift(alluxio.thrift.JobConfInfo conf) {
    return new JobConfInfo(conf);
  }

  /**
   * Converts a thrift type to a wire type.
   *
   * @param lineageInfo the thrift representation of a lineage information
   * @return wire representation of the lineage information
   */
  public static LineageInfo fromThrift(alluxio.thrift.LineageInfo lineageInfo) {
    return new LineageInfo(lineageInfo);
  }

  /**
   * Converts a thrift type to a wire type.
   *
   * @param masterInfo the thrift representation of the Alluxio master information
   * @return wire representation of the Alluxio master information
   */
  public static MasterInfo fromThrift(alluxio.thrift.MasterInfo masterInfo) {
    return new MasterInfo(masterInfo);
  }

  /**
   * Converts a thrift type to a wire type.
   *
   * @param mountPointInfo the thrift representation of a lineage information
   * @return wire representation of the lineage information
   */
  public static MountPointInfo fromThrift(alluxio.thrift.MountPointInfo mountPointInfo) {
    return new MountPointInfo(mountPointInfo);
  }

  /**
   * Converts thrift type to wire type.
   *
   * @param tTtlAction {@link TTtlAction}
   * @return {@link TtlAction} equivalent
   */
  public static TtlAction fromThrift(TTtlAction tTtlAction) {
    return TtlAction.fromThrift(tTtlAction);
  }

  /**
   * Converts a thrift type to a wire type.
   *
   * @param workerInfo the thrift representation of a worker information
   * @return wire representation of the worker information
   */
  public static WorkerInfo fromThrift(alluxio.thrift.WorkerInfo workerInfo) {
    return new WorkerInfo(workerInfo);
  }

  /**
   * Converts a thrift type to a wire type.
   *
   * @param workerNetAddress the thrift representation of a worker net address
   * @return wire representation of the worker net address
   */
  public static WorkerNetAddress fromThrift(alluxio.thrift.WorkerNetAddress workerNetAddress) {
    return new WorkerNetAddress(workerNetAddress);
  }

  /**
   * Converts a wire type to a thrift type.
   *
   * @param blockInfo the wire representation of a block information
   * @return thrift representation of the block information
   */
  public static alluxio.thrift.BlockInfo toThrift(BlockInfo blockInfo) {
    return blockInfo.toThrift();
  }

  /**
   * Converts a wire type to a thrift type.
   *
   * @param blockLocation the wire representation of a block location
   * @return thrift representation of the block location
   */
  public static alluxio.thrift.BlockLocation toThrift(BlockLocation blockLocation) {
    return blockLocation.toThrift();
  }

  /**
   * Converts a wire type to a thrift type.
   *
   * @param blockMasterInfo the wire representation of a block master information
   * @return thrift representation of the block master information
   */
  public static alluxio.thrift.BlockMasterInfo toThrift(BlockMasterInfo blockMasterInfo) {
    return blockMasterInfo.toThrift();
  }

  /**
   * Converts a wire type to a thrift type.
   *
   * @param jobInfo the wire representation of a command-line job information
   * @return thrift representation of the command-line job information
   */
  public static alluxio.thrift.CommandLineJobInfo toThrift(CommandLineJobInfo jobInfo) {
    return jobInfo.toThrift();
  }

  /**
   * Converts a wire type to a thrift type.
   *
   * @param fileBlockInfo the wire representation of a file block information
   * @return thrift representation of the command-line job information
   */
  public static alluxio.thrift.FileBlockInfo toThrift(FileBlockInfo fileBlockInfo) {
    return fileBlockInfo.toThrift();
  }

  /**
   * Converts a wire type to a thrift type.
   *
   * @param fileInfo the wire representation of a file information
   * @return thrift representation of the file information
   */
  public static alluxio.thrift.FileInfo toThrift(FileInfo fileInfo) {
    return fileInfo.toThrift();
  }

  /**
   * Converts a wire type to a thrift type.
   *
   * @param conf the wire representation of a command-line job configuration
   * @return thrift representation of the command-line job configuration
   */
  public static alluxio.thrift.JobConfInfo toThrift(JobConfInfo conf) {
    return conf.toThrift();
  }

  /**
   * Converts a wire type to a thrift type.
   *
   * @param lineageInfo the wire representation of a lineage information
   * @return thrift representation of the lineage information
   */
  public static alluxio.thrift.LineageInfo toThrift(LineageInfo lineageInfo) {
    return lineageInfo.toThrift();
  }

  /**
   * Converts a wire type to a thrift type.
   *
   * @param masterInfo the wire representation of the master information
   * @return thrift representation of the master information
   */
  public static alluxio.thrift.MasterInfo toThrift(MasterInfo masterInfo) {
    return masterInfo.toThrift();
  }

  /**
   * Converts a wire type to a thrift type.
   *
   * @param mountPointInfo the wire representation of a mount point information
   * @return thrift representation of the mount point information
   */
  public static alluxio.thrift.MountPointInfo toThrift(MountPointInfo mountPointInfo) {
    return mountPointInfo.toThrift();
  }

  /**
   * Converts a wire type to a thrift type.
   *
   * @param workerInfo the wire representation of a worker information
   * @return thrift representation of the worker information
   */
  public static alluxio.thrift.WorkerInfo toThrift(WorkerInfo workerInfo) {
    return workerInfo.toThrift();
  }

  /**
   * Converts wire type to thrift type.
   *
   * @param ttlAction {@link TtlAction}
   * @return {@link TTtlAction} equivalent
   */
  public static TTtlAction toThrift(TtlAction ttlAction) {
    return TtlAction.toThrift(ttlAction);
  }

  /**
   * Converts a wire type to a thrift type.
   *
   * @param workerNetAddress the wire representation of a worker net address
   * @return thrift representation of the worker net address
   */
  public static alluxio.thrift.WorkerNetAddress toThrift(WorkerNetAddress workerNetAddress) {
    return workerNetAddress.toThrift();
  }
}

