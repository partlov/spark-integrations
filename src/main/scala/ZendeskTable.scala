package org.pivmar

import org.apache.spark.sql.connector.catalog.{SupportsRead, Table, TableCapability}
import org.apache.spark.sql.connector.read.ScanBuilder
import org.apache.spark.sql.types.StructType
import org.apache.spark.sql.util.CaseInsensitiveStringMap

import java.util
import scala.collection.JavaConverters.setAsJavaSetConverter

class ZendeskTable extends Table with SupportsRead {

  override def name(): String = ???

  override def schema(): StructType = ???

  override def capabilities(): util.Set[TableCapability] =
    Set(TableCapability.MICRO_BATCH_READ).asJava

  override def newScanBuilder(options: CaseInsensitiveStringMap): ScanBuilder = ???
}
