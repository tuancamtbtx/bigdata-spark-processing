package vn.bigdata.processing.jobs;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.sql.SparkSession;

public abstract class SparkJobAbstract {
    public JavaSparkContext _jsc;
    SparkConf sparkConf;
    public SparkSession sparkSession;
}
