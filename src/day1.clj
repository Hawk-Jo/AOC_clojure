(ns day1)


(require '[clojure.java.io :as io])

(def nums
  (with-open [r (io/reader (io/resource "resources/day1_input.txt"))]
   (doall (map #(Integer/parseInt %)
               (line-seq r)))))
(reduce + nums)