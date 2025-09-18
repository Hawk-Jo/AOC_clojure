(ns day1)


(comment
  (+ 2 2)
  (->> (range 101)
       (filter even?)
       (map #(* % %)))
  :rcf)