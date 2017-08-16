(ns kafka-clj-test.core
  (:use kafka-clj-test.kafka.consumer)
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (:bts (first m))))
