(ns day2)

(require '[clojure.java.io :as io])

(def texts
  (with-open [r (io/reader (io/resource "resources/day2_input.txt"))]
    (doall (line-seq r))))
