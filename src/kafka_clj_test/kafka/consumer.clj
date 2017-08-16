(ns kafka-clj-test.kafka.consumer
  (:use kafka-clj.consumer.node))

(def consumer-conf {:bootstrap-brokers [{:host "localhost" :port 9092}]
                    :redis-conf {:host "localhost" :max-active 5 :timeout 1000 :group-name "test"}
                    :conf {:use-earliest true}})

(def node (create-node! consumer-conf ["testIn"]))

(def m (msg-seq! node))