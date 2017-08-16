(defproject kafka-clj-test "0.1.0-SNAPSHOT"
  :description "Testing out Clojure producer/consumer"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [kafka-clj "4.0.3"]]
  :main ^:skip-aot kafka-clj-test.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
