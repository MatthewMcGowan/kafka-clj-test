# kafka-clj-test

Testing out Clojure with Kafka.
Motivation is that for simple JSON transformation between two Kafka topics, the dynamic nature of Clojure, unrestricted by compile time objects to update with schema change, could be a natural fit.

## Installation & Dependencies

Dependency on kafka-clj library, which in turn has dependency on both Kafka and Redis. Both must be available.

## Usage

    $ java -jar kafka-clj-test-0.1.0-standalone.jar [args]

