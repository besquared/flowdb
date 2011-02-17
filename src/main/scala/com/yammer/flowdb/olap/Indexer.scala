package com.yammer.flowdb.olap

import com.yammer.flowdb.data._

/**
 * Created by IntelliJ IDEA.
 * User: jferguson
 * Date: 2/17/11
 * Time: 12:15 AM
 * To change this template use File | Settings | File Templates.
 */

class Indexer(dataSource: DataSource) {
  def construct() {
    // Create a Map[Map[String, Int]]
    dataSource.foreach(row => {

    })
  }
}