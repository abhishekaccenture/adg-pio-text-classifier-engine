name:="SantimentAnalysis_BagOfWords_Model"
libraryDependencies++=Seq(
"org.apache.predictionio"%%"apache-predictionio-core"%"0.10.0-incubating"%"provided",
"org.apache.spark"%%"spark-core"%"1.5.1"%"provided",
"org.apache.spark"%%"spark-mllib"%"1.5.1"%"provided")
enablePlugins(JavaAppPackaging)
